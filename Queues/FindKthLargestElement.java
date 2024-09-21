package Queues;

import java.util.PriorityQueue;
import java.util.Queue;

public class FindKthLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] Arr = {4,3,6,7,15,12,23,45}; 
		
		int k=4;
		
		System.out.println(kthLargestElement(Arr,k));
		
	}
		
		//by default min heap in implemented in priority queue in java
		
		//Queue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());-> for Max Heap


		
/*1. create a priority queue and add first k elements 4,3,6,7
  2. iterate over left over elements in array
  3. compare the peek of the priority queue (peek will be smallest element)
     3,4,6,7 to the elements in array one by one
  4. example -> 3<15 so replace 3 by 15 , 4<12 replace 4 by 12
  5. now queue becomes 6,7,12,15 so 4th greatest element is 6
		
		
		3,4,6,7
		
		3<15 so 4,6,7,15
		4<12 so 6,7,12,15
		6<23 so 7,12,15,23
		7<45 so 12,15,23,45
		
		
		*/

	public static int kthLargestElement(int arr[], int k) {

		Queue<Integer> queue = new PriorityQueue<Integer>();

		for (int i = 0; i < k; i++) {

			queue.add(arr[i]);
			
		}
		
		for(int i=k; i<arr.length; i++) {
			
			if(arr[i]>queue.peek()) {
				queue.remove();
				queue.add(arr[i]);
			}
		}
		return queue.peek();
	}

}