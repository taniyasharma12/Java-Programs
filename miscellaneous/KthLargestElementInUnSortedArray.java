package miscellaneous;

import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElementInUnSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {3, 2, 1, 5, 6, 4};
		
		System.out.println(kthLargestElement(nums, 2));

	}

	
	/*
	 2. Given an unsorted array of integers, find the kth largest element in the array. The kth largest element is the element that would be in the kth position if the array were sorted in descending order.
Example:
Input:
arr = [3, 2, 1, 5, 6, 4]
k = 2
Output:
5
Explanation:
If the array is sorted in descending order, it becomes [6, 5, 4, 3, 2, 1]. The 2nd largest element is 5.
	 */
	
	public static int kthLargestElement(int nums[], int k) {
	
		/*
		 create a priority queue
		 add first k elements in it
		 then loop from k to n , compare queue peek to current element if it is greater than peek the replace
		 example - [3, 2, 1, 5, 6, 4]  
		 add first 2 elements to queue in priority queue 2,3 
		 compare 1 with 2 no action 
		 compare 5 with 2 , replace , new queue -> 3,5
		 compare 3 with 6 , new queue -> 5,6
		 compare 5 with 4 no action 
		 so final queue has 5,6 and peek is 5 ie kth largest
		 
		 */
		Queue<Integer> queue = new PriorityQueue<Integer>();
		
		
		for(int i=0; i<k; i++) {
			
			queue.add(nums[i]);
		}
		
		for(int i=k ; i<nums.length; i++) {
			
			if(nums[i]>queue.peek()) {
				
				queue.poll();
				queue.add(nums[i]);
			}
		}
		
		
		return queue.peek();

	}
}
