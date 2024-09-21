/**
 * 
 */
package InterviewQuestionProgram;

/**
 * @author TaniyaSharma
 *
 */
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "hello";
		
		String result ="";
		
		for(int i=str.length()-1; i>=0; i--) {
			
			result+=str.charAt(i);
			
		}
		
		System.out.print(result);
	}

}


