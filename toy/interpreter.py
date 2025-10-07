from py23_common import Opcode

import json

import sys
# Pass the path to pypy homedir here
sys.path.insert(0, "/home/ken/Documents/GitHub/pypy")


from rpython.rlib.jit import JitDriver, hint, elidable

def get_location(pc, insn_stream):
    return "%d_%s_%s" % (
            pc, insn_stream[pc][0].encode("ascii"), insn_stream[pc][1].encode("ascii")
    )
jitdriver = JitDriver(greens=['pc', 'insn_stream'], reds=['stack', 'namespace'], get_printable_location=get_location) 
class Interpreter:
    def __init__(self):
        pass
    
    @staticmethod
    @elidable
    def get_insn(insn_stream, pc):
        return insn_stream[pc]

    @staticmethod
    def run(insn_stream):
        pc = 0
        stack = []
        namespace = {}
        while True:
            jitdriver.jit_merge_point(pc=pc, insn_stream=insn_stream, stack=stack, namespace=namespace)           
            if pc >= len(insn_stream):
                break
            insn = Interpreter.get_insn(insn_stream, pc)
            opcode = insn[0]
            oparg = insn[1]
            # print(pc, opcode, len(stack))
            if opcode == Opcode.LOAD_CONST:
                oparg = hint(oparg, promote=True)
                stack.append(int(oparg))
            elif opcode == Opcode.LOAD_NAME:
                stack.append(namespace[oparg])
            elif opcode == Opcode.BINARY_OP:
                rhs = stack.pop()
                lhs = stack.pop()
                op = oparg
                if op == u'<':
                    num = 1 if lhs < rhs else 0
                elif op == u'+':
                    num = lhs + rhs
                elif op == u'-':
                    num = lhs - rhs                    
                elif op == u"%":
                    num = lhs % rhs
                else:
                    raise NotImplementedError(u"Unknown binop %s" % op)
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
                    pc += int(oparg)
            elif opcode == Opcode.PUSH_NULL:
                stack.append(0)
            elif opcode == Opcode.JUMP_BACKWARD:
                pc -= int(oparg)
            elif opcode == Opcode.JUMP_FORWARD:
                pc += int(oparg)  
            else:
                raise NotImplementedError("Unknown opcode ")
            pc += 1
            if opcode == Opcode.JUMP_BACKWARD:
                jitdriver.can_enter_jit(pc=pc, insn_stream=insn_stream, stack=stack, namespace=namespace)
        # print(namespace)

def jitpolicy(driver):
    from rpython.jit.codewriter.policy import JitPolicy
    return JitPolicy()

import os
def run(argv):
    fp = os.open(argv[1], os.O_RDONLY, 0777)
    res = []
    MAX_BUF_LEN = 4096
    buf = os.read(fp, MAX_BUF_LEN)
    prev = 0
    for i in range(len(buf)):
        if buf[i] == "\n":
            line = buf[prev:i]
            prev = i + 1
            opcode, oparg, _ = line.split(",")
            res.append((opcode.decode("utf-8"), oparg.decode("utf-8")))
    Interpreter().run(res)
    os.close(fp)
    return 0

def target(*args):
    return run, None

if __name__ == "__main__":
   run(sys.argv)

