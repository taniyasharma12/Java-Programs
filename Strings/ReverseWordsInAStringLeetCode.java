package Strings;

public class ReverseWordsInAStringLeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "a good   example";
		
		System.out.print(reverseWords(s));
	}

	
public static String reverseWords(String s) {
        
        String rev = "";

        String words[] = s.trim().split("\\s+");

        for(int i=words.length-1; i>0; i--){
           
            rev +=words[i] + " ";
        }

return rev+words[0];

    }
}

