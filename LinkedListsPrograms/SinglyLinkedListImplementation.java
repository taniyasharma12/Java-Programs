package LinkedListsPrograms;

import java.util.LinkedList;
import java.util.List;

public class SinglyLinkedListImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// one node class , one linked list class in which all methods

		// components of MyLinkedList Class - node head, length of the list

		// Components of Node class - data and next pointer

		/* Start with the empty list. */
		// Insert the values

		MyLinkedLists list = new MyLinkedLists();
		list.addAtHead(34);
		list.addAtHead(45);
		list.addAtHead(334);
		list.addAtIndex(3, 78);

		list.printList(list);

	}
}

class Node {

	int data;

	Node next;

	public Node(int val) {

		this.data = val;
		this.next = null;
	}
}

class MyLinkedLists {

	static Node head;

	int length;

	public MyLinkedLists() {

		this.head = null;
		this.length = 0;
	}

	public void addAtHead(int val) {

		Node newHead = new Node(val);

		// since new node is added on left side now next for new node will be this.head
		newHead.next = this.head;

		// now we need to update head and make newNode the

		this.head = newHead;

		// increment length

		this.length += 1;

	}

	public void addAtTail(int val) {

		if(this.length==0) {
			
			addAtHead(val);
			return;
		}
		Node newNode = new Node(val);
		
		//starting from head, traverse to last node
    	//will traverse until next = null

		Node curr = this.head;
		
		while(curr.next!=null) {
			
			curr = curr.next;
		}
		
		curr.next = newNode; //assign new node at the end of the list
    	this.length+=1;
    }



	public void addAtIndex(int index, int val) {
		 
		 if(index<0 || index>length) {
			 return;
		 }
		 
		 else if(index==0) {
	    	   addAtHead(val);
	    	   return;
	       }


		 else {
			 
	         Node newNode = new Node(val);

			 Node curr = this.head;
			 //take new node curr which is equal to head
			 //traverse till index to add element in list
			 for(int i=0; i<=index-1; i++) {
				 
			 curr = curr.next;
			// increment curr value as we more forward in list
			 }
			           
         newNode.next = curr.next; //insert the node
         curr.next = newNode;
			 this.length +=1;
		 }
	 }
	
	public void deleteAtHead() {
		
		Node secondNode = this.head.next;
		
		this.head = secondNode;
		
		length-=1;
	}
	
	public void deleteAtTail() {
		
		Node curr = this.head;
		
		while(curr.next!=null) {
			
			curr = curr.next;
		}
		//point the next of second last node to null
		 
		 curr.next =null;
		 
		 // 1 2 3 4 null
	 }
	 public void deleteAtIndex(int index, int val) {
		 
		 
		 if(index<0 || index<length) {
			 return;
		 }
		 
		 else if(index==0) {
	    	   deleteAtHead();
	    	   return;
	       }

		 else {
			 
			 Node curr = this.head;
			 for(int i=0; i<=index-1; i++) {
				 
				 curr = curr.next;
			 }
			 curr.next = curr.next.next;
			 this.length -=1;
		 }
		 
	 }
	 public int get(int index) {
	    	
	    	if(index<0 || index>=this.length){
	    		
	    		return -1;
	    	}
	    	else {
	    		Node curr = this.head;
	    		for(int i=0; i<index; i++) {
	    			curr = curr.next;
	    		}
	    		return curr.data;
	    	}
	    	
	    }
	  
	  
	  public static void printList(MyLinkedLists list) 
	    { 
	        Node curr = head;
	    
	        System.out.print("LinkedList: "); 
	    
	        // Traverse through the LinkedList 
	        while (curr != null) { 
	            // Print the data at current node 
	            System.out.print(curr.data + " "); 
	    
	            // Go to next node 
	            curr=curr.next;
	        } 
	    } 
	}
