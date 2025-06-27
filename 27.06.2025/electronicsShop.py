#!/bin/python3

import os
import sys

def getMoneySpent(keyboards, drives, b):
    maxamount=-1;
    for key in keyboards:
        for dr in drives:
            if key+dr<=b:
                maxamount=max(maxamount,key+dr)
                
    return maxamount    

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    bnm = input().split()

    b = int(bnm[0])

    n = int(bnm[1])

    m = int(bnm[2])

    keyboards = list(map(int, input().rstrip().split()))

    drives = list(map(int, input().rstrip().split()))


    moneySpent = getMoneySpent(keyboards, drives, b)

    fptr.write(str(moneySpent) + '\n')

    fptr.close()
