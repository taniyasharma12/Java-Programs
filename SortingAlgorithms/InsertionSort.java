package SortingAlgorithms;


public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr [] = {8,9,3,5,1,2,10,12,11,48,23,25};
		
		//key is 9
		//compare 9 with elements on left side if left side element is greater then switch
		
		insertionSort(arr);
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.println(arr[i]);
		}
		
	}
	
	public static void insertionSort(int arr[]) {
		
		int n = arr.length;
		
		for(int i =1; i<n; i++) {
			
			//int arr [] = {8,9,3,5,1,2,10,12,11,48,23,25};
			//i=2, key = 3, j = 1, arr[2]=9, j=0
			//j=0, 8> 3yes, arr[1]=8
			
			int key = arr[i];
			
			int j=i-1;
			
			while(j>=0 && arr[j]>key )
			{
			arr[j+1]=arr[j];
			
			j=j-1;
				
			}
			
			arr[j+1]=key;
		}
		//time complexity O(n)2 in worst case and O(n) in best
		
		
	}

}
