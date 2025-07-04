#!/bin/python3

import math
import os
import random
import re
import sys



def pageCount(n, p):
    front=p//2
    if n%2==1:
        back=(n-p)//2
    else:
        back=(n-p+1)//2
    return min(front,back)        
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    p = int(input().strip())

    result = pageCount(n, p)

    fptr.write(str(result) + '\n')

    fptr.close()
