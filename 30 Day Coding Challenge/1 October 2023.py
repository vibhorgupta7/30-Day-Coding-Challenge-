# Question 1


from sys import stdin


def pairSum(arr, n, x) :
    #Your code goes here
    count =0;

    for i in range(n):
        for j in range(i+1,n):
            if arr[j] == x-arr[i]:
                count +=1
    
    return count;



