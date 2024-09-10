package SlidingWindowVariableSize;

public class LargestSubArrayOfSumK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {4,1,1,2,2};

		int k =5;
		
		System.out.print(largestSubArrayOfSumK(arr,k));
	}
	//SLIDING WINDOW APPROACH
	
	
/*
take two pointers i and variable maxLength for storing maxLength, sum variable to store sum
while j<arr.length add sum of elements
if sum<k do j++
if sum==k find max length and increment j
if sum>k remove sum of ith element and increment i then check if sum==k if yes find maxLength
then increment j
return maxLength


 */
	public static int largestSubArrayOfSumK(int [] arr, int k) {
		
		int i=0;
		int j=0;
		int sum=0;
		int maxLength = 0;
		
		while(j<arr.length) {
			
			sum+=arr[j];
		
		
		if(sum<k) {
			
			j++;
		}
		
		else if(sum==k) {
			
			maxLength = Math.max(maxLength, j-i+1);
			
			j++;
		}
		else {
			
			while(sum>k) {
				
				sum-=arr[i];
				i++;
                
				if(sum==k) {
					maxLength = Math.max(maxLength, j-i+1);
		
				}	
			}
			j++;
			
		}
		}
		return maxLength;
		}

}
