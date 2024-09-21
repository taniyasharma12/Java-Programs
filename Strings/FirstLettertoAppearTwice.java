package Strings;

public class FirstLettertoAppearTwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(repeatedCharacter("eesll"));
	}

	 public static char repeatedCharacter(String s) {
	        
	        char count[] = new char[128];

	        for(int i=0; i<s.length(); i++){

	            count[s.charAt(i)]++;
	        }
	        char ans = ' ';
	 for(int i=0; i<s.length(); i++){
	    
	    if(count[s.charAt(i)]>=2){

	        ans=  s.charAt(i);
	        break;
	    }
	 }
return ans;
	    }
}
	