package NewPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class P20_ReturnSmallestPositiveMissingInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int Arr[] = {2,3,5,6,7};
		
		//output should be 4
		
		//create a hashSet , take an int smallest 1 , increment smallest by 1 each
		//time when a new int is added to set if set contains current value of smallest int
		
		Set<Integer> set = new LinkedHashSet<Integer>();
		
		int smallest = 1;
		
		for(int i=0; i<Arr.length; i++)
		{
			set.add(Arr[i]);
		}
		
		while(set.contains(smallest)) {
			smallest++;
		}
	System.out.println(smallest);
		
		
	}

}
