package LinkedListsPrograms;

import java.util.LinkedList;
import java.util.List;

public class ReturnMiddleNodeOfLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		ListNode list = new ListNode();
		
		list.addAtHead(1);
		list.addAtHead(2);
		list.addAtHead(3);
		list.addAtHead(88);
		list.addAtHead(78);
		list.addAtHead(10);
		list.addAtHead(90);

	


	}
}

class Node1{
	
	
	int data;
	
    Node1 next;
	
	public Node1(int val) {
		
		this.data = val;
		
		this.next = null;
	}	
}


 class ListNode {
		
	Node1 head;
	int count=0;
	
	
	    public int len(ListNode head) {
		
		Node1 currr =this.head;
		
		while(currr!=null) {
			
			count++;

			currr = currr.next;
			
		}
		
		return count;
		
		
		
	}	
	    
	    public void addAtHead(int val) {
	    	
	    	Node1 newNode = new Node1(val);
	    	
	    	newNode.next = this.head;
	    	this.head = newNode;
	    }
	
	    
	    public Node1 midNode(ListNode head) {
	    	
	    	Node1 currr = this.head;
	    	
	    	int mid = (count/2) +1;
	    	
	    	if(mid>=0) {
	    		
	    		currr = currr.next;
                mid = mid-1;	    	
                
	    	}
	    	
	    	return currr;
			
	    	
	    }
}
