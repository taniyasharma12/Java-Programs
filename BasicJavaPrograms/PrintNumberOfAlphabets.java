package BasicJavaPrograms;
import java.util.HashMap;
import java.util.Map;

public class PrintNumberOfAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		String str = "abcdefabbccdeffmrrrrrrrr";
		
		if(str==null) {
			System.out.println("string is null");
		}
		
		else if(str.isEmpty()) {
			
			System.out.println("string is empty");
			
		}
		
		else {
			
		char[]	str1 = str.toCharArray();
		
		Map<Character, Integer> map = new HashMap<Character,Integer>();
		
		for(Character ch : str1) {
			
			if(map.containsKey(ch)) {
				
				map.put(ch, map.get(ch)+1);
			}
			
			else
				map.put(ch, 1);
			
		}
		
 		for(Map.Entry<Character,Integer> m : map.entrySet()) {
			
 		//	if(m.getValue()>1) {
 				
			System.out.println(m.getKey()+ " "+ m.getValue());
			
		}
 		}
			
		}
		
	}

