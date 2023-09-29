#  Question 1

import sys

def duplicateNumber(arr, n) :
    #Your code goes here
    for i in range(n):
        for j in range(n):
            if arr[i]==arr[j] and i!=j:
                return arr[i]

    return 0;

# Question 2


import sys

def intersections(arr1, n, arr2, m) :
    #Your code goes here
    for i in range(n):
        for j in range(m):
            if arr1[i]==arr2[j]:
                print(arr1[i], end = " ")
                arr2[j]= sys.maxsize
                break


