/**
 * 
 */
package Strings;

/**
 * @author TaniyaSharma
 *
 */
public class StringCompressionRemoveAdjacentDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "aaabbcccbbbbxddaaeeff";
		System.out.println(compressString(str1));

	}

public static String compressString(String str) {
		
		
		String result = str.charAt(0)+"";
		
		for(int i=1; i<str.length(); i++) {
			
			if(str.charAt(i-1)!=str.charAt(i)) {
				
				result = result + str.charAt(i);
				
			}
		}
		return result;
	}
}

