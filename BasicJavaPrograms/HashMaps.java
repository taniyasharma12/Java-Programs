package BasicJavaPrograms;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> map = new LinkedHashMap<String, String>();
		
		map.put("fruit", "apple");
		map.put("fruit", "apple");
		map.put("fruit", "banana");
		map.put("blue", "yyy");
		
		
		for(String m : map.keySet()) {
			
			System.out.println(m + " " + map.get(m));
		}
		
	}

}
