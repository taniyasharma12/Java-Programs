package Arrays;

public class LengthOftheLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String s = "Hello Worlder";
	
	String words [] = s.split(" ");

    System.out.println(words[words.length-1].length());

    }


}
