import dataclasses
import json

from .parser import parse
from .compiler import compile, Insn

def serialize_to(stream: list[Insn]):
    res = []
    for insn in stream:
        res.append(f"{insn.opcode},{insn.oparg}")
    return ',\n'.join(res)


def main(contents):
    stream = compile(parse(contents))
    toyc = serialize_to(stream)
    with open("toy.txt", "w") as fp:
        fp.write(toyc)
    


    

    
