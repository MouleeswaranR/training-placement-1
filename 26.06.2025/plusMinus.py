#!/bin/python3

import math
import os
import random
import re
import sys



def plusMinus(arr):
    pos=neg=zero=0
    for i in range(n):
        if arr[i]>0:
            pos+=1
        elif arr[i]<0:
            neg+=1
        elif arr[i]==0:
            zero+=1
            
    print(pos/n)
    print(neg/n) 
    print(zero/n)                
if __name__ == '__main__':
    n = int(input().strip())

    arr = list(map(int, input().rstrip().split()))

    plusMinus(arr)
