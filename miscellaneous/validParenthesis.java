package miscellaneous;

import java.util.Stack;

public class validParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//https://leetcode.com/problems/valid-parentheses/description/
		
/*
		 
opening brackets -> push
closing brackets -> check size of stack if empty return false;[means closing bracket has no opening bracket so no balanced/valid]
closing brackets -> check peek if not opening bracket then return false;
closing brackets -> if peek is opening bracket then pop
now check size of stack if 0 return true;		 
		 
		 
*/
		
		String str = "()[]{}{]";
		
		System.out.println(isValid(str));
		
	}

	
	public static boolean isValid(String str) {
		
		Stack<Character> st = new Stack<Character>();
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(ch=='('|| ch=='{'|| ch=='[') {
				
				st.push(ch);
					
				}
			else if(ch==')') {
				if(st.isEmpty()) {
					
					return false;
				}
				else if(st.peek()!='(') {
					
					return false;
				}
				else {
					
					st.pop();
				}
			}
			else if(ch=='}') {
				if(st.isEmpty()) {
					
					return false;
				}
				else if(st.peek()!='{') {
					
					return false;
				}
				else {
					
					st.pop();
				}
			}
			else if(ch==']') {
				if(st.isEmpty()) {
					
					return false;
				}
				else if(st.peek()!='[') {
					
					return false;
				}
				else {
					
					st.pop();
				}
			}
		}
			if(st.size()==0) {
				
				return true;
			}
		return false;
	}
}
