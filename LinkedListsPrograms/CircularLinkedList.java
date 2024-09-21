package LinkedListsPrograms;

public class CircularLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		

		CircularLinkedList list1 = new CircularLinkedList(2);
		CircularLinkedList list2 = new CircularLinkedList(3);
		CircularLinkedList list3 = new CircularLinkedList(4);
		CircularLinkedList list4 = new CircularLinkedList(9);
		
		
		list1.next = list2;
		list2.next = list3;
		list3.next = list4;
		list4.next = list1;
		
		last = list4;
		
		CircularLinkedList curr = list1;
		
		 if (curr != null) 
		    {
		       
		        // Keep printing nodes till we reach the first node
		        // again
		        do
		        {
		            System.out.print(curr.data + " ");
		            curr = curr.next;
		        } while (curr != list1);
		    }
		}
	
	
	int data;
	
	CircularLinkedList next;
	
	static CircularLinkedList last;
		
public CircularLinkedList(int val) {
			
			this.data = val;
			
			this.next = null;
			
			this.last = null;
		}
	}


