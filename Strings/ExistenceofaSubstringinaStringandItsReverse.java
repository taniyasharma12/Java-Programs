package Strings;

public class ExistenceofaSubstringinaStringandItsReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "leetcode";
		
		System.out.println(isSubstringPresent(s));
		
	}
public static boolean isSubstringPresent(String s) {
	
	/*
	 Given a string s, find any substring of length 2 which is also present in the reverse of s.

Return true if such a substring exists, and false otherwise.

	 take reverse of the whole string then check if any substring from reversed 
	 string is present in original string
	 
	*/
	
	String rev ="";
	
	for(int i=s.length()-1; i>=0; i--) {
		
		rev+=s.charAt(i);
	}
	
	for(int i=0; i<s.length(); i++) {
		
		if(s.contains(rev.substring(i, i+2))) {
			return true;
		}
	}
	return false;
	
	
        
    }

}




