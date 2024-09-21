package NewPrograms;

import java.util.Scanner;

public class P9_RemoveElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new  Scanner(System.in);
           int n = sc.nextInt();
           int [] arr = new int[n];
           for(int i=0; i<n; i++) {
        	   arr[i] = sc.nextInt();
           }
           int k = sc.nextInt();
           
           int newArr[] = new int[n-1];
           int j=0;
           for(int i=0; i<n; i++) {
        	   
        	   if(arr[i]!=k) {
        		 newArr[j]=arr[i]; 
        		 j++;
        	   }
           }
		for(j=0; j<n-1; j++) {
			System.out.println(newArr[j]);
		}
		
	}
}

