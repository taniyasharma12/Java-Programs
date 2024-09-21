package miscellaneous;

public class CheckStringIsAnagramOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isAnagram("listen", "silenT"));
		
		//anagram -> listen, silent -- 2 words which have exactly same letters
		//create character frequency count array for str1 and str2
		//add character count for str1 and substract for str2 , if all elements are 0 means all elements are cancelled with each other
	}

	public static boolean isAnagram(String str1, String str2) {
		
	
		if(str1.length()!=str2.length()) {
			return false;
		}
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		
		int char_count [] = new int[128];
		
		for(int i=0; i<str1.length(); i++) {
						
			char_count[str1.charAt(i)]++;
		}
		
        for(int i=0; i<str2.length(); i++) {
			
			char_count[str2.charAt(i)]--;
		}
		
        for(int i=0; i<128; i++) {
        	
        	if(char_count[i]!=0) {
        		return false;
        	}
        }
		return true;
			
	}
}
