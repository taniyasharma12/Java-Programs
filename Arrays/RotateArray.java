package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          
          int Arr[] = new int[n];
          for(int i=0; i<n; i++) {
        	  Arr[i] = sc.nextInt();
          }
          int k = sc.nextInt();
         
    
          rotate(Arr,k);
          
          for(int i=0; i<n; i++) {
                System.out.print(Arr[i] + " ");
            }
	}
          public static void reverse(int []Arr, int start, int end) {
        	  
        	  
        	  while(start<=end) {
        		  int temp = Arr[start];
        		  Arr[start]=Arr[end];
        		  Arr[end]=temp;
        		  
        		  start++;
        		  end--;
        	  }
          }
          
          
          public static int[] rotate(int[]Arr, int k) {
        	  k=k%Arr.length;
        	  reverse(Arr, 0,Arr.length-1);
        	  
        	  reverse(Arr, 0, k-1);
        	  
        	  reverse(Arr, k, Arr.length-1);
        	  
			return Arr;
        	  
          }
	
}
	


