package LinkedListsPrograms;

public class DoubleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		DoubleLinkedList list1 = new DoubleLinkedList(2);
		DoubleLinkedList list2 = new DoubleLinkedList(3);
		DoubleLinkedList list3 = new DoubleLinkedList(4);

		list1.next = list2;
		list2.prev = list1;
		
		list2.next=list3;
		list3.prev=list2;
		
		//iterate from start
		DoubleLinkedList curr = list1;

		while(curr!=null) {
			
			System.out.println(curr.data);
			
			curr = curr.next;
		}
		
		//iterate from last
			    curr = list3;

				while(curr!=null) {
					
					System.out.println(curr.data);
					
					curr = curr.prev;
				}
	}

	
	
		
		int data;
		
		DoubleLinkedList next;
		
		DoubleLinkedList prev;
		
		public DoubleLinkedList(int val) {
			
			this.data = val;
			
			this.next = null;
			
			this.prev = null;
		}
		
		
	}

