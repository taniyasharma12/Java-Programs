package Stack;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Stack<Integer> st = new Stack<Integer>();
		
		st.push(10);
		
		st.push(12);
		
		st.push(14);
		
		st.push(16);
		
		System.out.println(st.peek());
		System.out.println(st.pop());		
		System.out.println(st.peek());	
		System.out.println(st.isEmpty());	

		
	}

}
