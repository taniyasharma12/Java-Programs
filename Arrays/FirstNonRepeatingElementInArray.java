package Arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int arr[] = {1,2,1,4,4};
		
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>(); 
		 
		for(int i=0; i<arr.length; i++) {
			
			if(map.containsKey(arr[i])){
				map.put(arr[i], map.get(arr[i])+1);
				
			}
			else {
				
				map.put(arr[i], 1);
			}
		}
		
		for(int element : map.keySet()) {
			
			if(map.get(element)==1) {
				
				System.out.println(element + " " + map.get(element));
				break;
			}
		}
		
		for(int i=0; i<arr.length; i++) {

			if(map.get(arr[i])==1) {
				System.out.println(i);
				break;
			}
	}
	}
}
