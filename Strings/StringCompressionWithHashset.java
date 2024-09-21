package Strings;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class StringCompressionWithHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aabbccdfrggewra";
		
		System.out.print(compressString(str));
		
	}

	
	public static String compressString(String str) {
		
		String result ="";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0; i<str.length(); i++) {
			
			set.add(str.charAt(i));
			
		}		
		
		Iterator<Character> it = set.iterator();
		
		   while(it.hasNext()) {
			   
			  result += it.next();
		   }

		   return result;
		   
	}
	
	
	
	
}