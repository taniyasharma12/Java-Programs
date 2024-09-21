package SortingAlgorithms;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Find minimum element and swap min element with first element, first iteration
		//after few iterations left side becomes sorted, right unsorted
		
		
		int arr[] ={3,2,5,4};
		
		for(int i=0; i<arr.length; i++) {
			
			int min_index = i;
			
			int temp =0;
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[j]<arr[min_index]) {
					
					temp = arr[j];
					
					arr[j] = arr[min_index];
					
					arr[min_index] = temp;
					
				}
				
			}
			
		}
			for(int i=0; i<arr.length; i++) {
				System.out.println(arr[i]);
				
			}
		}
	}


