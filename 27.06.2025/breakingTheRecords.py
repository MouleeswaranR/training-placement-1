#!/bin/python3

import math
import os
import random
import re
import sys



def breakingRecords(scores):
    mincount=maxcount=0
    minscore=maxscore=scores[0]
    for i in range(1,len(scores)):
        if minscore<scores[i]:
            minscore=scores[i]
            mincount+=1
        elif maxscore> scores[i]:
            maxscore=scores[i]
            maxcount+=1
    return mincount,maxcount            

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    scores = list(map(int, input().rstrip().split()))

    result = breakingRecords(scores)

    fptr.write(' '.join(map(str, result)))
    fptr.write('\n')

    fptr.close()
