package LearnYard.Arrays;

import java.util.Scanner;

public class InsertionDeletion {

	
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int[] arr = new int[100];

	        int n = sc.nextInt();

	        for (int i=0; i<n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        
	        display(arr, n);

	     //   n = pushback(arr, 20, n);

	       // display(arr, n);
	        
	        n = pushfront(arr, 20, n);
	        
	        display(arr, n);
 
	 }
	 
	 public static void display(int arr[], int n) {
		 for(int i=0; i<n; i++) {
			 if(i==0) {
				 System.out.print("[");
			 }
			 System.out.print(arr[i]);
			 
			 if(i<n-1) {
				 System.out.print(","); 
			 }
			 else {
				 System.out.print("]");
			 }
		 }
		 
		 System.out.println();
	 }
	 
	 
	 public static int pushback(int[] arr, int val, int n) {
	        if (n == arr.length) {
	            return n;
	        }
	        arr[n] = val;
	        return n+1;
	    }
	 
	 public static int pushfront(int[] arr, int val, int n) {
		 
		 if(n==arr.length) {
			 return n;
		 }
		 for(int i=n-1; i>=0; --i) {
			 arr[i+1]=arr[i];
		 }
		 arr[0]=val;
		 return n+1;
	 }
}

