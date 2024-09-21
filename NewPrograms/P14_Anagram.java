package NewPrograms;

public class P14_Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "listen";
		String str2 = "silent";
		
		System.out.print(isAnagram(str1, str2));
		//can be anagram when both have same letters
		//increase count in character array for string 1
		//decrease count from string 2
		//count =0 then anagram
		
	}
		
	public static boolean isAnagram(String str1, String str2) {
		
		if(str1.length()!=str2.length()) {
			return false;
		}
		int[] char_count = new int[128];
		
		for(int i=0; i<str1.length(); i++) {
			char_count[str1.charAt(i)]++;
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