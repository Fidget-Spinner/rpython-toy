# Generated from Parser.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .Parser import Parser
else:
    from Parser import Parser

# This class defines a complete listener for a parse tree produced by Parser.
class ParserListener(ParseTreeListener):

    # Enter a parse tree produced by Parser#program.
    def enterProgram(self, ctx:Parser.ProgramContext):
        pass

    # Exit a parse tree produced by Parser#program.
    def exitProgram(self, ctx:Parser.ProgramContext):
        pass


    # Enter a parse tree produced by Parser#stat.
    def enterStat(self, ctx:Parser.StatContext):
        pass

    # Exit a parse tree produced by Parser#stat.
    def exitStat(self, ctx:Parser.StatContext):
        pass


    # Enter a parse tree produced by Parser#assgn.
    def enterAssgn(self, ctx:Parser.AssgnContext):
        pass

    # Exit a parse tree produced by Parser#assgn.
    def exitAssgn(self, ctx:Parser.AssgnContext):
        pass


    # Enter a parse tree produced by Parser#whil.
    def enterWhil(self, ctx:Parser.WhilContext):
        pass

    # Exit a parse tree produced by Parser#whil.
    def exitWhil(self, ctx:Parser.WhilContext):
        pass


    # Enter a parse tree produced by Parser#if_els.
    def enterIf_els(self, ctx:Parser.If_elsContext):
        pass

    # Exit a parse tree produced by Parser#if_els.
    def exitIf_els(self, ctx:Parser.If_elsContext):
        pass


    # Enter a parse tree produced by Parser#func_def.
    def enterFunc_def(self, ctx:Parser.Func_defContext):
        pass

    # Exit a parse tree produced by Parser#func_def.
    def exitFunc_def(self, ctx:Parser.Func_defContext):
        pass


    # Enter a parse tree produced by Parser#expr.
    def enterExpr(self, ctx:Parser.ExprContext):
        pass

    # Exit a parse tree produced by Parser#expr.
    def exitExpr(self, ctx:Parser.ExprContext):
        pass


    # Enter a parse tree produced by Parser#func.
    def enterFunc(self, ctx:Parser.FuncContext):
        pass

    # Exit a parse tree produced by Parser#func.
    def exitFunc(self, ctx:Parser.FuncContext):
        pass


