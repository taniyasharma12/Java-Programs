package NewPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class P21_ArrayListImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		System.out.println(arr);
		
		arr.add(1, 5);
		
		System.out.println(arr);
		
		arr.remove(0);
		//Arrays.sort() for array
		
		System.out.println(arr + "before sorting");
		arr.set(0,9);
		Collections.sort(arr);
		
		
		
		System.out.println(arr + "after sorting");
		//iterating
		
		for(int i=0; i<arr.size(); i++) {
			System.out.print(arr.get(i));
		}
		System.out.println(arr.size());
		
	}

}
