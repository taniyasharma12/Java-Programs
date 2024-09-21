package NewPrograms;

import java.util.Scanner;
import java.util.Stack;

public class P27_BalancedBrackets {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "(())(())";
		
		//create a stack
		//push if open bracket
		//return false if peak is not closed bracket, else pop
		//if stack size is 0 its balanced
		
	Stack<Character> st = new Stack<Character>();
	 
	for(int i=0; i<str.length(); i++) {
		char ch = str.charAt(i);
		
		if(ch == '(' || ch == '{' || ch =='[') {
			
			st.push(ch);
		}
		
		else if(ch==')') {
			if(st.size()==0) {
				System.out.println(false);
				return;
			}
			if(st.peek() != '(') {
				System.out.println(false);
				return;
			}
			else {
				st.pop();
			}
		}
		
		else if(ch=='}') {
			if(st.size()==0) {
				System.out.println(false);
				return;
			}
			if(st.peek() !='{') {
				System.out.println(false);
				return;
			}
			else {
				st.pop();
			}
		}
		else if(ch ==']') {
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
	}
	if(st.size()==0) {
		System.out.println("balanced");
	}
	else
	{
		System.out.println("not balanced");
	}
}
}