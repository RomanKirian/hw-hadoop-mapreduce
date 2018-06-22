#!/usr/bin/python3
import sys
words={}
for line in sys.stdin:
    for word in line.strip().split(" "):
        if word in words:
            words[word]+=1
        else:
            words[word]=1

for k,v in words.items():
    print(k+"\t"+str(v))
