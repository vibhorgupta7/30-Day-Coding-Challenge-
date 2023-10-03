// Question 1
public class Solution {
    
    public static int findTriplet(int[] arr, int x) {
    	//Your code goes here
        int count =0;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i] + arr[j] + arr[k] ==x)    
                        count++;
                }
            }
        }

        return count;
    }

}


// Question 2

public class Solution {  

    public static void sortZeroesAndOne(int[] arr) {
    	//Your code goes here
        int j =arr.length-1,k=0;

        while(k<j){
            if(arr[k]==0){
                k++;
            } else {
                if(arr[j]==0){
                    arr[k]=0;
                    arr[j]=1;
                    k++;
                } 
                j--;
            }
        }
    }
}
