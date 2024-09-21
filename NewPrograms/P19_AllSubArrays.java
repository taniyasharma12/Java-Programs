package NewPrograms;

import java.util.Scanner;

public class P19_AllSubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//loop through 3 loops 
		
		int [] arr = {1,2,3};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				
				for(int k=i; k<=j; k++) {
					
					System.out.print(arr[k]);
				}
				System.out.println();
			}
		}
	}
}