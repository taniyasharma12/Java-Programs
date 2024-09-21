
package InterviewQuestionProgram;


public class CompressString {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "aaabbbbbcccaaabb";
		
		System.out.println(result(s));
	}

	
	
	
	public static String result(String str) {
		
		int count =1;
		
		String res ="";
		for(int i=1; i<str.length(); i++) {
			
			
			char previous = str.charAt(i-1);
			char current = str.charAt(i);
			
			if(previous==current) {
				
				count++;
			}
			
			else {
				
				res+=str.charAt(i-1);
				res+=count;
				count=1;
				
			}	
			
		}
		res+=str.charAt(str.length()-1);
		res+=count;
		return res;
	}
}


