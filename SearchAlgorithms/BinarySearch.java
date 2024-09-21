package SearchAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int length = sc.nextInt();
        
        int arr[] =new int[length];
        
        for(int i=0; i<length; i++){
            
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        
        int result = binarySearch(arr,target);
        
        System.out.print(result);
        
    
    }
    
    public static int binarySearch(int arr[], int target){
        
        int left =0;
        
        int right = arr.length-1;
        
        while(left<=right){
            
            int mid = (left+right)/2;
            
            if(arr[mid]==target){
                return mid;
            }
            
            else if(target>arr[mid]){
                
                left = mid+1;
            }
            
            else{
                
                right = mid-1;
            }
            
        }
            return -1;
            
            
        }
}