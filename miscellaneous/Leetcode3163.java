/**
 * 
 */
package miscellaneous;

/**
 * @author TaniyaSharma
 *
 */
public class Leetcode3163 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(compressedString("aaaaaaaaaaaaaaccccbbbbbbbbbbbb"));
		
	}

	
	
	public static String compressedString(String word) {
		
		String result ="";
		
		int count=1;
		
		for(int i=1; i<word.length(); i++) {
			
			char prev = word.charAt(i-1);
			char curr = word.charAt(i);
			
			if(prev==curr) {
				
				if(count<9) {
				    count++;
				}
				else {
					result+=count;
					result+=prev;
					count=1;
				}
			}
			else {
				result +=count;
				result+=prev;
				count=1;	
			}
			
		}
		result+=count;
		result+=word.charAt(word.length()-1);
        return result;
        
    }
}