package Arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class KthDistinctStringinanArrayLeetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = {"aaa","aa","a", "a", "a"};
		int k = 2;
		System.out.println(kthDistinct(arr,k));

	}
	public static String kthDistinct(String[] arr, int k) {

	       Map<String, Integer> map = new LinkedHashMap<String, Integer>();
	       
	       for(int i=0; i<arr.length; i++) {
	     
	    	  map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
	    }
	       System.out.println(map);
	       
	       int j=0;
	       String ans ="";
	       for(String element : map.keySet()) {
	    	   
	    	   if(map.get(element)==1) {
	    		   j++;
	    		   if(j==k) {
	    			   ans = element;
	    		   }
	    	   }
	       }
		return ans;
	}
}
