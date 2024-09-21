package Strings;

public class ReverseWordsinaStringIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Let's take LeetCode contest";
		
		System.out.print(reverseWords(s));
	}
	public  static String reverseWords(String s) {
	    
	    String words [] = s.split(" ");
	      //make a string array of words in string sentence

	      String rev = ""; //take empty string to save final result

	      for(int i=0; i<words.length; i++){
	    	  
	    	  String word = words[i]; 
	
		      String revWord = "";

	    	  for(int j=word.length()-1; j>=0; j--) {
		    	  revWord  += word.charAt(j);
 
	    	  }
	    		 rev += revWord + " ";

	      }
	 
	 return rev.trim();
	    }

	}