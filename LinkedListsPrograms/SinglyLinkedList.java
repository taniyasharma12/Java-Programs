package LinkedListsPrograms;

public class SinglyLinkedList {
	
	int data ;
	
	SinglyLinkedList next ; 
	
	
	public SinglyLinkedList(int val) {
		
		 this.data = val;
		 
		 this.next = null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SinglyLinkedList list1 = new SinglyLinkedList(1);
		SinglyLinkedList list2 = new SinglyLinkedList(2);
		SinglyLinkedList list3 = new SinglyLinkedList(3);

		//link nodes
		
		list1.next = list2;
		list2.next = list3;
		list3.next = null;
		
		
		
		//print values
		
			SinglyLinkedList curr = list1;
			
			while(curr!=null) {
				System.out.println(curr.data);
			curr = curr.next;
		}
	}

	
}
