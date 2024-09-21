package Strings;

public class individualWordsPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//write a program to get individual words in array of given string
		//input - "the is of of the are is of"
		//output - arr[0]  the arr[1] id .... so on
		
		String str = "the is of of the are is of";
		
		
		
		String words[] = str.split(" ");
		
		
		for( int i =0; i<words.length; i++) {
			String word = words[i];
			
			System.out.println(word);
		}
	}

}
