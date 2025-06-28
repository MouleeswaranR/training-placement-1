#!/bin/python3

import math
import os
import random
import re
import sys
from collections import Counter


def pickingNumbers(a):
    arr=Counter(a)
    maxnum=0
    
    for i in range(100):
        maxnum=max(maxnum,arr[i]+arr[i+1])
    
    return maxnum    
    

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    a = list(map(int, input().rstrip().split()))

    result = pickingNumbers(a)

    fptr.write(str(result) + '\n')

    fptr.close()
