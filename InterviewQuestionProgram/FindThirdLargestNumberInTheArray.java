/**
 * 
 */
package InterviewQuestionProgram;

import java.util.PriorityQueue;
import java.util.Queue;

/*Given an unsorted array of integers, find the third largest number in the array. If the array has less than three distinct numbers, return the largest number.
Example:
Input:
arr = [2, 4, 1, 5, 3, 6]
Output:
4

 */
public class FindThirdLargestNumberInTheArray {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {2, 4, 1, 5, 3, 6};
		//2,4 in queue
		//4,5
		//5,6

		System.out.println(returnKthLargest(arr, 2));
		
	}

	
	public static int returnKthLargest(int arr [], int k) {
		
		Queue<Integer> q = new PriorityQueue<Integer>();
		
		for(int i=0; i<k; i++) {
			
			q.add(arr[i]); //added first k element in ascending order
		}
		
		for(int i=k; i<arr.length; i++) {
			
			if(q.peek()<arr[i]) {
				
				q.remove();
				q.add(arr[i]);
			} //by end of this iteration we have  2 largest elements in queue
		}
		return q.peek();
	}
}


