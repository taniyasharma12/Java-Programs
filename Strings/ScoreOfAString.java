package Strings;

public class ScoreOfAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(scoreOfString("hello"));
	}
public static int scoreOfString(String s) {
        
        char ch [] = s.toCharArray();

        int sum =0;

        for(int i=1; i<ch.length; i++){
         
         int diff = Math.abs(ch[i-1]-ch[i]);

         sum = sum + diff;

        }
		return sum;
    }
}

