package Strings;

import java.util.Arrays;

public class SplitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "a good   example";
		
		String [] str1 = s.split(" ");
		
		String [] str2 = s.split("\\s+");
		
		for(int i=0; i<str1.length; i++) {
		
		System.out.println(str1[i]);
		
	}
		
		System.out.println("****************");
		
		for(int i=0; i<str2.length; i++) {
		
		System.out.println(str2[i]);
	}

}}
