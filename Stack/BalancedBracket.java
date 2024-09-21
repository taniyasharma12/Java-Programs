package Stack;

import java.util.Stack;

public class BalancedBracket {
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String str = "(){}}{";
		
		Stack<Character> st = new Stack<Character>();

		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			//if open bracket then push
			//if closing bracket, check if size of stack is 0 if yes return false;
			//if closing bracket check peek of the stack if not opening bracket return false
			//if peek is closing bracket pop
			//check size of stack if 0 true else false
			
			
			
			if(ch =='[' || ch =='(' || ch == '{') {
				
				st.push(ch);
			}
			
			else if(ch==')' ) {
				if(st.size()==0) {
					
					System.out.println(false);
					return;
					
				}
				else if(st.peek()!='(') {
					
					System.out.println(false);
					return;
				}
				else {
				st.pop();
				}
			}
			else if(ch==']' ) {
				if(st.size()==0) {
					
					System.out.println(false);
					return;
					
				}
				if(st.peek()!='[') {
					
					System.out.println(false);
					return;
				}
				else {
				st.pop();
				}
			}
			else if(ch=='}' ) {
				if(st.size()==0) {
					
					System.out.println(false);
					return;
					
				}
				if(st.peek()!='{') {
					
					System.out.println(false);
					return;
				}
				else {
				st.pop();
				}
			}
		}
		if(st.size()==0) {
			
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
	}
	
}