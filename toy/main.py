from .parser import parse
from .compiler import compile

def main(contents: str):
    print(compile(parse(contents)))
    
