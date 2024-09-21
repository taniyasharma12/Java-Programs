package LinkedListsPrograms;

public class TraversalInDoublyLinkedList {

	int val;
	
	TraversalInDoublyLinkedList next;
	
	TraversalInDoublyLinkedList prev;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	}
	
	
	public void traverseFromBeginning(TraversalInDoublyLinkedList node) {
		
		//Go to start 
						
		while(node.prev!=null) {
			node=node.prev;
		}
		
		//start printing the values now
		
		while(node!=null) {
			
			System.out.println(node.val);
			
			node =node.next;
		}
	}
	
	public void traverseFromEnd(TraversalInDoublyLinkedList node) {
		
		
		//go to end
		
		while(node.next !=null) {
			
			node = node.next;
			
		}
		
		while(node!=null) {
			System.out.println(node.val);
		    node = node.prev;	
		}
	}

}
