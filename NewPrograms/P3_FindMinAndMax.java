package NewPrograms;

import java.util.Scanner;

public class P3_FindMinAndMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int [] arr = {6,5,8,3,9,12,7};
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		
	}
		System.out.println(min);
		System.out.println(max);

	}

}
