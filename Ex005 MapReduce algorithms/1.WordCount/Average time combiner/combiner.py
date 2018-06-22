#!/usr/bin/python3
import sys

(lastKey, lastSum, lastCount) = (None, 0, 0)

for line in sys.stdin:
    (key, val) = line.strip().split("\t")
    (sum, count) = val.split(";")
    if lastKey and lastKey!=key:
        print(lastKey +"\t"+ str(lastSum) +";"+ str(lastCount))
        (lastKey, lastSum, lastCount) = (key, int(sum), 1)
    else:
        (lastKey, lastSum, lastCount) = (key, lastSum+int(sum), lastCount+1)

if lastKey:
    print(lastKey +"\t"+ str(lastSum)+";"+str(lastCount))
