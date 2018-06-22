#!/usr/bin/python3
import sys
for line in sys.stdin:
    words={}
    for token in line.strip().split(" "):
        if token: 
            if token in words:
                words[token]=words[token]+1
            else:
                words[token]=1
    for k, v in words.items():
        print(k + "\t" + str(v))
