import dataclasses
import json

from .parser import parse
from .compiler import compile, Insn

def serialize_to_json(stream: list[Insn]):
    res = []
    for insn in stream:
        res.append(json.dumps(dataclasses.astuple(insn)))
    return "[" + ',\n'.join(res) + "]"


def main(contents):
    stream = compile(parse(contents))
    toyc = serialize_to_json(stream)
    with open("toy.json", "w") as fp:
        fp.write(toyc)
    


    

    
