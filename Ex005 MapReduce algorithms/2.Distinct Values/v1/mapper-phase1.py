#!/usr/bin/python3
import sys

for line in sys.stdin:
    (f, groups_str) = line.strip().split("\t")
    groups = groups_str.split(",")
    for g in groups:
        print(f+","+g + "\t" + str(1))