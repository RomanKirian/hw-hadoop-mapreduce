#!/usr/bin/python3
import sys

lastKey = None

for line in sys.stdin:
    key = line.strip().split("\t")[0]
    if lastKey and lastKey != key:
        print(lastKey)

    lastKey = key

if lastKey:
    print(lastKey)
