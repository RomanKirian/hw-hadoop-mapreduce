#!/usr/bin/python3
import sys

lastKey=None
group_counts={}
groups={}
for line in sys.stdin:
    (k,g) = line.strip().split("\t")
    
    if lastKey and lastKey!=k:
        for group,v in groups.items():
            if group in group_counts:
                group_counts[group] = group_counts[group] + 1
            else:
                group_counts[group] = 1
        groups={}

    lastKey = k
    groups[g]=""

if lastKey:
    for group,v in groups.items():
        if group in group_counts:
            group_counts[group] = group_counts[group] + 1
        else:
            group_counts[group] = 1

for k,v in group_counts.items():
    print(k+"\t"+str(v))