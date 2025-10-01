# Generated from Lexer.g4 by ANTLR 4.7.2
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24")
        buf.write("g\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write("\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16")
        buf.write("\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23\t\23")
        buf.write("\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3")
        buf.write("\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3")
        buf.write("\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17")
        buf.write("\3\17\3\17\3\17\3\17\3\20\3\20\3\21\6\21V\n\21\r\21\16")
        buf.write("\21W\3\22\3\22\7\22\\\n\22\f\22\16\22_\13\22\3\23\6\23")
        buf.write("b\n\23\r\23\16\23c\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13")
        buf.write("\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37")
        buf.write("\21!\22#\23%\24\3\2\7\4\2,-//\3\2\62;\5\2C\\aac|\6\2\62")
        buf.write(";C\\aac|\5\2\13\f\16\17\"\"\2i\2\3\3\2\2\2\2\5\3\2\2\2")
        buf.write("\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17")
        buf.write("\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3")
        buf.write("\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2")
        buf.write("\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5+\3")
        buf.write("\2\2\2\7.\3\2\2\2\t\62\3\2\2\2\13\64\3\2\2\2\r\66\3\2")
        buf.write("\2\2\178\3\2\2\2\21:\3\2\2\2\23<\3\2\2\2\25>\3\2\2\2\27")
        buf.write("@\3\2\2\2\31D\3\2\2\2\33J\3\2\2\2\35M\3\2\2\2\37R\3\2")
        buf.write("\2\2!U\3\2\2\2#Y\3\2\2\2%a\3\2\2\2\'(\7c\2\2()\7p\2\2")
        buf.write(")*\7f\2\2*\4\3\2\2\2+,\7q\2\2,-\7t\2\2-\6\3\2\2\2./\7")
        buf.write("p\2\2/\60\7q\2\2\60\61\7v\2\2\61\b\3\2\2\2\62\63\7?\2")
        buf.write("\2\63\n\3\2\2\2\64\65\7.\2\2\65\f\3\2\2\2\66\67\7=\2\2")
        buf.write("\67\16\3\2\2\289\7*\2\29\20\3\2\2\2:;\7+\2\2;\22\3\2\2")
        buf.write("\2<=\7}\2\2=\24\3\2\2\2>?\7\177\2\2?\26\3\2\2\2@A\7f\2")
        buf.write("\2AB\7g\2\2BC\7h\2\2C\30\3\2\2\2DE\7y\2\2EF\7j\2\2FG\7")
        buf.write("k\2\2GH\7n\2\2HI\7g\2\2I\32\3\2\2\2JK\7k\2\2KL\7h\2\2")
        buf.write("L\34\3\2\2\2MN\7g\2\2NO\7n\2\2OP\7u\2\2PQ\7g\2\2Q\36\3")
        buf.write("\2\2\2RS\t\2\2\2S \3\2\2\2TV\t\3\2\2UT\3\2\2\2VW\3\2\2")
        buf.write("\2WU\3\2\2\2WX\3\2\2\2X\"\3\2\2\2Y]\t\4\2\2Z\\\t\5\2\2")
        buf.write("[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^$\3\2\2\2_]")
        buf.write("\3\2\2\2`b\t\6\2\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2")
        buf.write("\2\2de\3\2\2\2ef\b\23\2\2f&\3\2\2\2\6\2W]c\3\b\2\2")
        return buf.getvalue()


class Lexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    AND = 1
    OR = 2
    NOT = 3
    EQ = 4
    COMMA = 5
    SEMI = 6
    LPAREN = 7
    RPAREN = 8
    LCURLY = 9
    RCURLY = 10
    DEF = 11
    WHILE = 12
    IF = 13
    ELSE = 14
    BINOP = 15
    INT = 16
    ID = 17
    WS = 18

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'and'", "'or'", "'not'", "'='", "','", "';'", "'('", "')'", 
            "'{'", "'}'", "'def'", "'while'", "'if'", "'else'" ]

    symbolicNames = [ "<INVALID>",
            "AND", "OR", "NOT", "EQ", "COMMA", "SEMI", "LPAREN", "RPAREN", 
            "LCURLY", "RCURLY", "DEF", "WHILE", "IF", "ELSE", "BINOP", "INT", 
            "ID", "WS" ]

    ruleNames = [ "AND", "OR", "NOT", "EQ", "COMMA", "SEMI", "LPAREN", "RPAREN", 
                  "LCURLY", "RCURLY", "DEF", "WHILE", "IF", "ELSE", "BINOP", 
                  "INT", "ID", "WS" ]

    grammarFileName = "Lexer.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.7.2")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


