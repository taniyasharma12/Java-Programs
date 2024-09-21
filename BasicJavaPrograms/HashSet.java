package BasicJavaPrograms;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Character> set = new LinkedHashSet<Character>();
		
		String str = "ttssggbbhhjjuukk";
		
		for(int i =0; i< str.length(); i++) {
			
			set.add(str.charAt(i));
		}
		
		//using iterator to print
		
		Iterator<Character> it = set.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
	}

}
