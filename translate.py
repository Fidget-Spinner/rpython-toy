import sys
# Pass the path to pypy homedir here
sys.path.insert(0, "/home/ken/Documents/GitHub/pypy")

import rpython.translator.goal.translate as tr

tr.main()

