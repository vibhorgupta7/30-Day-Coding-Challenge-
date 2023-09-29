#  Question 1

import sys

def duplicateNumber(arr, n) :
    #Your code goes here
    for i in range(n):
        for j in range(n):
            if arr[i]==arr[j] and i!=j:
                return arr[i]

    return 0;