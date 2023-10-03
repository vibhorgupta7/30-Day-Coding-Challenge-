
from sys import stdin

def findTriplet(arr, n, x) :
    #Your code goes here
    #return your answer
    count =0
    for i in range(n):
        for j in range(i+1,n):
            for k in range(j+1,n):
                if arr[i] + arr[k] + arr[j]==x:
                    count +=1
    
    return count