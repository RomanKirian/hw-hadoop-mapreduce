#!/usr/bin/python3
import sys
for l in sys.stdin:
    lt = []
    ln = l.strip().split(" ")
    for t in ln:
        if lt.count(t) == 0:
            lt.append(t)
            print(t+'\t'+str((ln.count(t))))
