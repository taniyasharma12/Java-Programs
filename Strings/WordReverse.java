package Strings;

public class WordReverse {

	public static void main(String[] args) {
		
	String str = "this is a set words";
	 
	
	String words [] = str.split(" ");
	
	String rev = "";
	
	int n = words.length-1;
	
	for(int i= n; i>=0; i--) {
		
		if(n==0) {
			rev = rev + words[i];
		}
		else {
			rev = rev + words[i] + " ";
	
		}
	}
	
	System.out.println(rev);
	
}
}