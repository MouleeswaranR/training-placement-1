#!/bin/python3

import math
import os
import random
import re
import sys



def birthdayCakeCandles(candles):
    n=len(candles)
    maxnum=count=0
    for i in range(n):
        if candles[i]>maxnum:
            maxnum=candles[i]
            count=1
        elif maxnum==candles[i]:
            count+=1    
    return count
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    candles_count = int(input().strip())

    candles = list(map(int, input().rstrip().split()))

    result = birthdayCakeCandles(candles)

    fptr.write(str(result) + '\n')

    fptr.close()
