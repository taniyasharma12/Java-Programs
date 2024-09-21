package miscellaneous;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/
		
		String s = "abbaca";
	/*	push a, b
		pop b, a
		result 
		*/
		System.out.print(s);
	}

	public static String removeDuplicates(String s) {
		
		Stack<Character> st = new Stack<Character>();
		
		for(int i=0; i<s.length(); i++) {
			
			if (st.peek()!=s.charAt(i)){
				
				st.push(s.charAt(i));
			}
			else {
				
				st.pop();
			}
		}
		
		
		return st.toString();
        
    }
}