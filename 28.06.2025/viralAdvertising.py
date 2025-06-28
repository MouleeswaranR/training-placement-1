#!/bin/python3

import math
import os
import random
import re
import sys



def viralAdvertising(n):
    total=0
    shared=5
    
    for i in range(n):
        likes=shared//2
        total+=likes
        shared=likes*3
    return total

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    result = viralAdvertising(n)

    fptr.write(str(result) + '\n')

    fptr.close()
