package InterviewQuestionProgram;

public class ReverseStringPreservingSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "intern at geeks";
		
		System.out.println(reverse(str));
		
		//Output : skeegt an retni
		
	}
	
	public static String reverse(String str) {
		
		
		char input[] = str.toCharArray();
		
		char result[] = new char[input.length];
		
		for(int x=0; x<input.length; x++) {
			
			if(input[x]==' ') {
				
				result[x]=input[x];
			}
		}
		
		int j=input.length-1;
		
		for(int i=0; i<input.length; i++) {

             if(input[i]!=' ') {
				
            	 if(result[j]==' ') {
			    j--;
             }
 				result[j]=input[i];
            		 j--;
            	 }
             }
		
		
		return String.valueOf(result);
	}

}


/**
 * @author TaniyaSharma
 *
 */