package Queues;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Queue<Integer> queue = new PriorityQueue<Integer>();
		
		//priority queue prints in ascending order
		
		queue.add(5);
		queue.add(1);
		queue.add(23);
		queue.add(34);
		queue.add(32);
		
	//	System.out.println(queue.peek());
		
		Iterator it = queue.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
	}

}
