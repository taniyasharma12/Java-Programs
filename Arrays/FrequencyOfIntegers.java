package Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfIntegers {

	//get the frequency of each integer values in integers array
	// arr[] = {2,4,1,2,5,3,4,4}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[] = {2,4,1,2,5,3,4,4};
     
     Map<Integer, Integer> map = new HashMap<Integer, Integer>();
     
     for(int i =0; i < arr.length; i++)
    	 
     
     {
    	 if(map.containsKey(arr[i])) {
    		 map.put(arr[i], map.get(arr[i]) +1);
    	 }
    	 else
    	 {
    		 map.put(arr[i], 1);
    	 }
    	 
    		 
     }
     System.out.println(map);
	}

}
