from dataclasses import dataclass

from .parser.antlr4 import ParserVisitor
from .parser.antlr4.Parser import Parser
from .py23_common import Opcode

@dataclass(frozen=True, slots=True)
class Insn:
    opcode: Opcode
    oparg: int | str | None


class CompilerVisitor(ParserVisitor.ParserVisitor):
    def visitProgram(self, ctx: Parser.ProgramContext) -> list[Insn]:
        stream = []
        for child in ctx.getChildren():
            stream.extend(self.visit(child) or [])
        return stream

    def visitStat(self, ctx: Parser.StatContext) -> list[Insn]:
        res = self.visitChildren(ctx)
        res.append(Insn(Opcode.POP_TOP, 0))
        return res

    def visitAssgn(self, ctx: Parser.AssgnContext) -> list[Insn]:
        res = self.visitExpr(ctx.expr())
        res.append(Insn(Opcode.DUP, 0))
        res.append(Insn(Opcode.STORE_NAME, f"{ctx.ID()}"))
        return res

    def visitWhil(self, ctx: Parser.WhilContext) -> list[Insn]:
        res = self.visitExpr(ctx.expr())
        len_expr = len(res)
        body = []
        for stat in ctx.stat():
            body.extend(self.visitStat(stat))
        # +1 for the JUMP_BACKWARD
        res.append(Insn(Opcode.POP_JUMP_IF_FALSE, len(body) + 1))
        res.extend(body)
        # +2 because one for POP_JUMP_IF_FALSE, one for pc+1
        res.append(Insn(Opcode.JUMP_BACKWARD, len(body) + len_expr + 2))
        res.append(Insn(Opcode.PUSH_NULL, 0))
        return res

    def visitIf_els(self, ctx: Parser.If_elsContext) -> list[Insn]:
        return self.visitChildren(ctx)

    def visitFunc_def(self, ctx: Parser.Func_defContext) -> list[Insn]:
        return self.visitChildren(ctx)

    def visitExpr(self, ctx: Parser.ExprContext) -> list[Insn]:
        name = ctx.ID()
        int_ = ctx.INT()
        binop = ctx.BINOP()
        # ... more to follow
        if int_ is not None:
            return [Insn(Opcode.LOAD_CONST, int(int_.symbol.text))]
        elif name is not None:
            return [Insn(Opcode.LOAD_NAME, name.symbol.text)]
        elif binop is not None:
            lhs, rhs = ctx.expr()
            return [*self.visit(lhs), *self.visit(rhs), Insn(Opcode.BINARY_OP, binop.symbol.text)]
        raise NotImplementedError()
        # ... more to follow

    def visitFunc(self, ctx: Parser.FuncContext) -> list[Insn]:
        return self.visitChildren(ctx)
    
    def visitTerminal(self, node):
        return []

def compile(ctx: Parser.ProgramContext) -> list[Insn]:
    return CompilerVisitor().visitProgram(ctx)