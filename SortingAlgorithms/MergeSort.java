package SortingAlgorithms;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Keep dividing arrays into half and get all individual elements
		//take pair of 2 elements and compare them, sort them
		//again divide into half and repeat same process
		
		int arr[] = {5,3,6,2,1};
		
		mergeSort(arr,0, arr.length-1);
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.println(arr[i]);
		}
		
	}

	
	public static void mergeSort(int [] arr, int left, int right) {
		
		int mid = (left+right)/2;
		
		mergeSort(arr,left,mid);
		
		mergeSort(arr,mid+1,right);

		merge(arr, left, mid,right);
		
	}
	
	public static void merge(int arr[], int left, int mid, int right) {
		
		int n1 = mid-left+1;
		int n2 = right-mid;
		
		int[] arrL = new int[n1];
		int[] arrR = new int[n2];

		for(int x=0; x<n1; x++) {
			arrL[x] = arrL[x+left];
		}
		
		for(int x=0; x<n2; x++) {
			arrR[x] = arrR[mid+1+x];
		}
		int i=0;
		int j=0;
		int k=left;
		
		while(i<=n1 && j<=n2) {
			
		
		if (arrL[i]<=arrR[j]) {
			
			arr[k] = arrL[i];
			i++;
		}
		else {
			arr[k]= arrR[j];
			j++;
		}
		k++;
	}

	}
}




