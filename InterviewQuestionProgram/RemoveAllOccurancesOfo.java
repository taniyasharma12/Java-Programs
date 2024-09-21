/**
 * 
 */
package InterviewQuestionProgram;

public class RemoveAllOccurancesOfo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "hello world";
		
		System.out.println(removeOccurances(str));
	}

	public static String removeOccurances(String str) {
		
		String ans = "";
		
		for(int i=0;  i<str.length(); i++) {
			
			if(str.charAt(i)!='o') {
				
				ans+=str.charAt(i);
			}
			
		}
	
		return ans;
		
		
	}
	
}


