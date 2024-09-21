package NewPrograms;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class P11_PrintUniqueCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//input - aabbccdgrf
		//output - abcdgrf
		String str = "aabbccdgrf";
		Set<Character> set = new LinkedHashSet<Character>();
		  for(int i=0; i<str.length(); i++) {
			  
			  set.add(str.charAt(i));
		  }
		  
		  Iterator<Character> it = set.iterator();
		  
		  while(it.hasNext()) {
			  System.out.print(it.next());
		  }
		  
		  
		
	}
}