package Arrays;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElementsFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[] = {2,2,2,3,4,5,5,6,6};
		
		
		Set<Integer> set = new LinkedHashSet<Integer>();
		
		
		for(int i=0; i<arr.length; i++) {
			
			set.add(arr[i]);
		}
		
		
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
	}

}
