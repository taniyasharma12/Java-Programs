package BasicJavaPrograms;
import java.util.Arrays;

public class Anagrams{
	
	public static void main(String[] args) {
		

		String str1 ="LISTEN";
		String str2 ="SILENT";
		Boolean Result = null;
		
		Result = IsAnagram(str1, str2, Result);
		System.out.println(Result);
		
	}
		
		public static boolean IsAnagram(String strg1, String strg2, Boolean result) 
		{
			if(strg1.length()!=strg2.length()) 
				return false;
				
				else {
				
				char char1[] = strg1.toCharArray();
				char char2[] = strg2.toCharArray();
				
				Arrays.sort(char1);
				Arrays.sort(char2);
					
			strg1 = Arrays.toString(char1);
			strg2 =	Arrays.toString(char2);
			
			if(strg1.equalsIgnoreCase(strg2)) {
				
			return true;
			}
			else 
			return false;
						

	}
		}
}


/*

Result = Findanagrams(str1, str2, Result);
		System.out.println(Result);
	}
		
		public static boolean Findanagrams (String strg1, String strg2, Boolean result) {
			
			if(strg1.length()==strg2.length()) {
				
				char char1 [] = strg1.toCharArray();
				char char2 [] = strg2.toCharArray();
				
				Arrays.sort(char2);
				Arrays.sort(char1);
				
			strg1 = Arrays.toString(char1);
			
					strg2 = Arrays.toString(char2);
			
			if(strg1.equalsIgnoreCase(strg2)) {
				result = true;
		
			}	
			
			else
			{
				result = false;
			}
			}
			else
			result = false;
			
			return result;
			}

		
}
	      

*/