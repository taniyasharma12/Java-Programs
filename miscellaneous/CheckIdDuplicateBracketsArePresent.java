package miscellaneous;

import java.util.Stack;

public class CheckIdDuplicateBracketsArePresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		String str = "((a+b)+(c+d))";
		
		/*
1.if closing bracket check peek if opening bracket that means nothing in between so return true
2.if peek is not opening bracket then pop until opening bracket comes and at last pop opening bracket as well
3.if character is not closing bracket the push		 
		*/
		
		System.out.println(isDuplicateBracket(str));
	}
	
	
	
	public static boolean isDuplicateBracket(String str) {
		
		Stack<Character> st = new Stack<Character>();
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
		if(ch!=')')	{
			
			st.push(ch);
		}
		else if(ch==')') {
			
			if(st.peek()=='(') {
				
				return true;
			}
			else {
				while(st.peek()!='(') {
				st.pop();
			}
			st.pop();
		}
		}		
		
	}
		return false;


	}}
