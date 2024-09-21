/**
 * 
 */
package InterviewQuestionProgram;

import java.util.ArrayList;
import java.util.List;

public class NumberOfElementsThatFallInRange {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*
1. You are given an unsorted array of integers and two integers, r1 and r2, which represent the inclusive range. Your task is to count the number of elements in the array that fall within this range, including the boundaries.

𝐄𝐱𝐚𝐦𝐩𝐥𝐞:
𝐈𝐧𝐩𝐮𝐭:
Array = [1, 3, 5, 2]
r1 = 1
r2 = 5
Output:
4

Input :  arr = [1 3 3 9 10 4] 
         i1 = 1, j1 = 4
         i2 = 9, j2 = 12
Output : 4
         2

 */
		int arr [] = {1, 3, 5, 2};
		
		int r1 = 1;
				
		int r2 = 5;
		
		System.out.println(answer(arr,r1,r2));
		
		//output -> 3
	}
	
	public static int answer(int arr[] , int r1, int r2){
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>=r1 && arr[i]<=r2) {
				
				list.add(arr[i]);
			}
		}
		
		return list.size();
		
	}

}


