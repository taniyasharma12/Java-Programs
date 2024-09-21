package Strings;

public class FindMostRecurringCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aaaaaabbbbbeeeeeeeeeeeeeeeeeeeeeqeweferef";
		
		//create an empty array
		
		int char_count[] = new int[256];
		
		for(int i=0; i<str.length(); i++) {
			
			char_count[str.charAt(i)]++;
		}
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<char_count.length; i++) {
			
			if(char_count[i]>max) {
				
				max = char_count[i];
			}
		}
		
		System.out.println(max + " "+ str.charAt(max));
	}
	
}