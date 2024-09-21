package BasicJavaPrograms;

public class isSubsequenceLeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//https://leetcode.com/problems/is-subsequence/?envType=study-plan-v2&envId=top-interview-150
		
		String s = "abc";
		
		String t ="ahbgdc";
				
		//output -> true
		
		System.out.println(isSubsequence(s,t));
	}

	
public static  boolean isSubsequence(String s, String t) {
        
	String newS ="";
	
	for(int i=0; i<s.length(); i++) {
		
		if(t.contains(s.charAt(i)+"")) {
			
			newS +=s.charAt(i);
						
		}
	}
	if(newS.equals(s)) {
	return true;
	
	}
	return false;
    }
}

