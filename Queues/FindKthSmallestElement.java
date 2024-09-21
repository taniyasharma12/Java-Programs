package Queues;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class FindKthSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int[] Arr = {4,3,6,7,15,12,23,45}; 
		
		int k=4;
		
		System.out.println(kThsmallestElement(Arr, k));
		
	}
	
	
	public static int kThsmallestElement(int Arr [], int k) {
		
		
		Queue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		
		for(int i=0; i<k; i++) {
			
			q.add(Arr[i]);
			
		}
		
		for(int i=k; i<Arr.length; i++) {
			
			if(Arr[i]<q.peek()) {
				
				q.remove();
				
				q.add(Arr[i]);
			}
		}
		return q.peek();
	}

}