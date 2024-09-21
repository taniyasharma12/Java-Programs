package Arrays;

import java.util.ArrayList;

public class AlternativePositiveNegativeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 Given an unsorted array Arr of N positive and negative numbers. Your task is to create an array of alternate positive and negative numbers without changing the relative order of positive and negative numbers.
Note: Array should start with a positive number and 0 (zero) should be considered a positive element.
		 */
	
		int Arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
		
		int n = Arr.length;
		
	    rearrange(Arr, n);
		
		for(int i=0; i<n; i++) {
			
			System.out.println(Arr[i]);
		}
		
	}
	
	
	 public static void rearrange(int arr[], int n) {
		 
		 ArrayList<Integer> pos = new ArrayList<Integer>();
		 
		 ArrayList<Integer> neg = new ArrayList<Integer>();
		 
		 for(int i=0; i<arr.length; i++) {
			 
			 if(arr[i]>0) {
				 pos.add(arr[i]);
			 }
			 
			 if(arr[i]<0)
			 {
				 neg.add(arr[i]);
			 }
		 }
		 
		 int i=0; int j=0; int k=0;
		 
		 while(i<neg.size() && j<pos.size()) {
			 
			 arr[k]= pos.get(j);
			 k++; j++;
			 arr[k]=neg.get(i);
			 k++; i++;
		 }
	 
		 
	}

}
