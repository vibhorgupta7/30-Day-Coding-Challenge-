// Question 1
public class Solution{  
    
    public static int duplicateNumber(int arr[]) {
    	//Your code goes here
        for(int i =0;i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i] == arr[j] && i!=j){
                    return arr[i];
                }
            }
        }
        return 0;
    }
}

// Question 2

public class Solution{  
    
    public static void intersections(int arr1[], int arr2[]) {
    	//Your code goes here

        for(int i=0; i<arr1.length; i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i] + " ");
                    arr2[j]=Integer.MAX_VALUE;;
                    break;
                }

            }
        }
    }
}
