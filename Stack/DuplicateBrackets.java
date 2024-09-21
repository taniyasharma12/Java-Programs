package Stack;

import java.util.Stack;

public class DuplicateBrackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "((a+b))";

		Stack<Character> st = new Stack<Character>();

		
// IF CLOSING BRACKET then check peek if opening bracket the its duplicate return true
// IF CLOSING BRACKET then pop till opening bracket is not received and then pop opening bracket as wee
// IF CHARCTER IS NOT CLOSING BRACKET THEN PUSH
		
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			
			if(ch==')') {
				if(st.peek()=='(') {
					
					System.out.println("true");
					return;
				}
				else {
					
					while(st.peek()!='(') {
						st.pop();
					}
					st.pop();
				}
			}
			else {
				
				st.push(ch);
				
			}
			}
		System.out.println("false");

	}
}

			