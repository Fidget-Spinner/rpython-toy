# Generated from Parser.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .Parser import Parser
else:
    from Parser import Parser

# This class defines a complete generic visitor for a parse tree produced by Parser.

class ParserVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by Parser#program.
    def visitProgram(self, ctx:Parser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Parser#stat.
    def visitStat(self, ctx:Parser.StatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Parser#assgn.
    def visitAssgn(self, ctx:Parser.AssgnContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Parser#whil.
    def visitWhil(self, ctx:Parser.WhilContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Parser#if_els.
    def visitIf_els(self, ctx:Parser.If_elsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Parser#func_def.
    def visitFunc_def(self, ctx:Parser.Func_defContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Parser#expr.
    def visitExpr(self, ctx:Parser.ExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Parser#func.
    def visitFunc(self, ctx:Parser.FuncContext):
        return self.visitChildren(ctx)



del Parser