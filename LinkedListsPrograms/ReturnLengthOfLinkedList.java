package LinkedListsPrograms;

public class ReturnLengthOfLinkedList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		ListNode1 list = new ListNode1();
		
		list.addAtHead(1);
		list.addAtHead(2);
		list.addAtHead(3);
		list.addAtHead(88);
		list.addAtHead(78);
		list.addAtHead(10);
		list.addAtHead(90);

		System.out.println(list.len());


	}
}

class Node2{
	
	
	int data;
	
    Node2 next;
	
	public Node2(int val) {
		
		this.data = val;
		
		this.next = null;
	}	
}


 class ListNode1 {
		
	Node2 head;
	int count=0;
	
	
	    public int len() {
		
		Node2 currr =head;
		
		while(currr!=null) {
			
			count++;

			currr = currr.next;
			
		}
		
		return count;
		
		
		
	}	
	    
	    public void addAtHead(int val) {
	    	
	    	Node2 newNode = new Node2(val);
	    	
	    	newNode.next = this.head;
	    	this.head = newNode;
	    }
	
	    
}
