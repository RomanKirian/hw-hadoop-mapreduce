#!/usr/bin/python3
import sys

(lastKey, sum, count) = (None, 0, 0)

for line in sys.stdin:
    (key, val) = line.strip().split("\t")
    if lastKey and lastKey != key:
        print(lastKey + "\t" + str(int(sum/count)))
        (lastKey, sum, count) = (key, int(val), 1)
    else:
        (lastKey, sum, count) = (key, sum+int(val), count+1)

if lastKey:
    print(lastKey + "\t" + str(int(round(sum/count))))
