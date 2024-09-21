package Strings;

public class ReversePrefixofWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String word = "abcdefd";
		
		char ch = 'd';
		
		System.out.println(reversePrefix(word,ch));
		
		
	}

	 public static  String reversePrefix(String word, char ch) {
		
		 char words [] = word.toCharArray();
		 
		 int indexch = 0;
		 
			String rev ="";

				 
		 for(int i=0; i<word.length(); i++) {
			 if(words[i]==ch) {
				 
			 indexch = i;
			 break;
			 }
			 }
		 
		 for(int i=indexch; i>=0; i--) {
			 
			 rev = rev + words[i];
		 }
        for(int i=indexch+1; i<words.length; i++) {
			 
			 rev = rev + words[i];
		 }
		 
		 return rev;
	        
	    }
	}

