package Arrays;

public class CheckIfStringIsaPrefixofArrayLeetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean isPrefixString(String s, String[] words) {

	      String concatenatedText = "";

	      for(int i=0; i<words.length; i++){
	      
	    	  concatenatedText += words[i];
	    	  
	    	  if(concatenatedText.equals(s)) {
	    		  
	    		  return true;
	    	  }
	      
	    	  else {
	    		  
	    		  continue;
	    	  }
	      }
	      return false;
	}
	        
	}