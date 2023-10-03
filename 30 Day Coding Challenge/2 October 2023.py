# Question 1
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

# Question 2

from sys import stdin

def sortZeroesAndOne(arr, n) :
    #Your code goes here 
    i=0
    j=n-1

    while(i<j):
        if arr[i]==0:
            i +=1
        else:
            if arr[j]==0:
                arr[i]=0
                arr[j]=1
                i +=1
            j -=1



