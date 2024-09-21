package miscellaneous;

import java.util.Arrays;
import java.util.Collections;

public class SortAnArrayOfStringsAccordingToStringLengths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] input = {"GeeksforGeeeks", "I", "from", "am"};
		//Output : I am from GeeksforGeeks
		
		sort(input, input.length);
		
	}
		
		public static void sort(String input [], int n) {
			
		String temp;	
		for(int i=0; i<input.length; i++) {
			 for(int j= 0; j<input.length; j++) {
				 
				 if(input[i].length()<input[j].length()) {
					 
					 temp = input[i];
						
					 input[i] = input[j];
						
					 input[j] = temp;
					}
				 }
			 }
				
			for(int i=0; i<input.length; i++) {
				System.out.println(input[i]);
			}
		
		/*	Arrays.sort(input, (a,b)-> Integer.valueOf(a.length())-(Integer.valueOf(b.length())));

			for(int i=0; i<input.length; i++) {
				System.out.println(input[i]);
			}
		
		/*
		
		Arrays.sort(input, (a,b)-> Integer.valueOf(a.length()).compareTo(Integer.valueOf(b.length())));
		
		for(int i=0; i<input.length; i++) {
			
			System.out.println(input[i]);
		}
		*/	
		
		

	/*	Arrays.sort(input, (a, b) -> {
	            return Integer.valueOf(a.length()).compareTo(Integer.valueOf(a.length()));
	        });
		} */
	}

}