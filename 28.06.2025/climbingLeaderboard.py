#!/bin/python3

import math
import os
import random
import re
import sys



def climbingLeaderboard(ranked, player):
    ranked=list(set(ranked))
    ranked.sort()
    n=len(ranked)
    i=0
    result=[]
    
    for j in player:
        while i<n and ranked[i]<=j:
            i+=1
        result.append(n-i+1)
    return result        

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    ranked_count = int(input().strip())

    ranked = list(map(int, input().rstrip().split()))

    player_count = int(input().strip())

    player = list(map(int, input().rstrip().split()))

    result = climbingLeaderboard(ranked, player)

    fptr.write('\n'.join(map(str, result)))
    fptr.write('\n')

    fptr.close()
