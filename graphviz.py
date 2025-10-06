def dot(logfile):
    from rpython.jit.tool.traceviewer import main
    main(logfile, 1)

import sys
# Pass the path to pypy homedir here
sys.path.insert(0, "/home/ken/Documents/GitHub/pypy")

dot(sys.argv[1])