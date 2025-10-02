from py23_common import Opcode

import json

import sys
# Pass the path to pypy homedir here
sys.path.insert(0, "/home/ken/Documents/GitHub/pypy")


from rpython.rlib.jit import JitDriver

jitdriver = JitDriver(greens=['pc'], reds=['stack', 'namespace']) 
class Interpreter:
    def __init__(self, stream):
        self.insn_stream = stream
    
    def run(self):
        pc = 0
        stack = []
        namespace = []
        while True:
            jitdriver.jit_merge_point(pc=pc, stack=stack, namespace=namespace)           
            if pc >= len(self.insn_stream):
                break
            insn = self.insn_stream[pc]
            opcode = insn[0]
            oparg = insn[1]
            if opcode == Opcode.LOAD_CONST:
                stack.append(oparg)
            elif opcode == Opcode.LOAD_NAME:
                stack.append(namespace[oparg])
            elif opcode == Opcode.BINARY_OP:
                lhs = stack[-2]
                rhs = stack[-1]
                op = chr(oparg)
                if op == '<':
                    num = 1 if lhs < rhs else 0
                elif op == '+':
                    num = lhs + rhs
                else:
                    raise NotImplementedError("Unknown binop")
                stack.append(num)
            elif opcode == Opcode.STORE_NAME:
                namespace[oparg] = stack[-1]
                stack.pop()
            elif opcode == Opcode.DUP:
                stack.append(stack[-1])
            elif opcode == Opcode.POP_TOP:
                stack.pop()
            elif opcode == Opcode.POP_JUMP_IF_FALSE:
                flag = stack.pop()
                if flag == 0:
                    pc += oparg
            elif opcode == Opcode.PUSH_NULL:
                stack.append(0)
            elif opcode == Opcode.JUMP_BACKWARD:
                pc -= oparg
            else:
                raise NotImplementedError("Unknown opcode ")
            pc += 1
            self.pc = pc
        # print(self.namespace)

def jitpolicy(driver):
    from rpython.jit.codewriter.policy import JitPolicy
    return JitPolicy()

import os
def run(argv):
    fp = os.open(argv[1], os.O_RDONLY, 0777)
    res = []
    buf = os.read(fp, 4096)
    for line in buf:
        opcode, oparg = line.rstrip().split(",")
        res.append((opcode.decode("utf-8"), int(oparg.decode("utf-8"))))
    Interpreter(res).run()
    os.close(fp)
    return 0

def target(*args):
    return run, None

if __name__ == "__main__":
   
    with open("toy.json") as fp:
        stream = json.load(fp)
        Interpreter(stream).run()

