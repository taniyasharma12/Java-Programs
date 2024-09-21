package miscellaneous;

import java.util.Scanner;

public class RemoveOccurrenceOfAGivenCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.to implement a function which gets a string as an input, and remove all occurrence of a given character from the string.

		
		//input - I Love Programming. I Love Codeforwin. ,'I'
		//output - Love Programming. Love Codeforwin.
		
		Scanner sc = new Scanner(System.in);
		        
		String input = sc.next();
		
		char rmv = sc.next().charAt(0);
				
		for(int i=0; i<input.length(); i++) {
			
			if(input.contains(rmv+"")) {
			  
				input = input.replaceAll(rmv+"", "");
			}
		}
	      System.out.println(input);
	}

}
