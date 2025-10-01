from py23_common import Opcode

import json


class Interpreter:
    def __init__(self, stream):
        self.insn_stream = stream
        self.pc = 0
        self.stack = []
        self.namespace = {}
    
    def run(self):
        while True:
            pc = self.pc
            stack = self.stack
            namespace = self.namespace
            jitdriver.jit_merge_point(pc=pc, stack=stack, namespace=namespace)
            if self.pc == len(self.insn_stream):
                break
            insn = self.insn_stream[pc]
            opcode = insn[0]
            oparg = insn[1]
            if opcode == Opcode.LOAD_CONST:
                stack.append(oparg)
            elif opcode == Opcode.STORE_NAME:
                namespace[oparg] = stack[-1]
                stack.pop()
            pc += 1
            self.pc = pc
        print(self.namespace)

def jitpolicy(driver):
    from pypy.jit.codewriter.policy import JitPolicy
    return JitPolicy()

if __name__ == "__main__":
    import sys
    # Pass the path to pypy homedir here
    sys.path.insert(0, sys.argv[1])
    from rpython.rlib.jit import JitDriver
    jitdriver = JitDriver(greens=['pc'], reds=['stack', 'namespace'])    
    with open("toy.json") as fp:
        stream = json.load(fp)
        Interpreter(stream).run()