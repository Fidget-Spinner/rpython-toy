x = 1
y = 1
while x < 1000000:
    if x % 2:
        x = x + 1;
        x = x - 1;
    if y % 2:
        pass
    else:
        y = y - 1;
        y = y + 1;
    x = x + 1;
    y = y + 1;

import sys
sys._dump_tracelets("hello.gvz")