from antlr4 import *
from toy.parser.antlr4.Lexer import Lexer
from toy.parser.antlr4.Parser import Parser

# Special thanks to https://yetanotherprogrammingblog.medium.com/antlr-with-python-974c756bdb1b
# for the guide on the ANTLR API.
def parse(contents: str):
    parsed = Parser(CommonTokenStream(Lexer(InputStream(contents))))
    print(parsed.program().toStringTree())