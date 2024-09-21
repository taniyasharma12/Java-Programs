package Strings;

import java.util.Iterator;
import java.util.Stack;

public class HackerRankSuperReducedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "aaabccddda"; 
		
		Stack<Character>  st = new Stack<Character>();
		
		for(int i=0; i<str.length(); i++) {
		
			if(st.isEmpty()) {
				
			st.push(str.charAt(i));
		
			}
			else if(st.peek()==str.charAt(i)){
				
				st.pop();
			}
			
			else {
				
				st.push(str.charAt(i));
			}
		}
		
		Iterator it = st.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());		
			
		}
		
	}

}
