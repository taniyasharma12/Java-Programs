package Strings;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//substring, split, contains, trim
		
		
		String str = "eqwerhtgerfweq";
		
		System.out.println(str.length());
		System.out.println(str.charAt(3));
		System.out.print(str.substring(0,3));
		
		String str1 = "Hey how are you, 1, 2, 3";
		
		String arr[] = str1.split(",");
		
		System.out.println(Arrays.toString(arr));
		
		//or
		
		for(String s : arr) {
			System.out.println(s);
		}
		  System.out.println(str1.contains("hey"));
	}
      
}
