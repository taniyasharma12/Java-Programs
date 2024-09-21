package miscellaneous;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromArrayOfAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] arr = {"hi", "hello", "hello", "hey"};
		
		
		Set<String> set = new LinkedHashSet<String>();
		
		for(int i=0; i<arr.length; i++) {
			
			set.add(arr[i]);
		}
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
	}

}
