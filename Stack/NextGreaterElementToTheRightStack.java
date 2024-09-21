package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementToTheRightStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 2, 5, 9, 3, 1, 12, 6, 8, 7 };

		System.out.println(Arrays.toString(nextGreaterElementToRight(arr)));

	}

	public static int[] nextGreaterElementToRight(int arr[]) {

		// create an empty array to add next greater elements

		int[] nge = new int[arr.length];

		// assign last element to nge

		Stack<Integer> st = new Stack<Integer>();
		
		//push last in the stack
		st.push(arr[arr.length-1]);
		
		//assign -1 value to last nge as no element at right side last element
		
		nge[arr.length-1]=-1;
		
		//reverse loop from second last element
		
		for(int i=arr.length-2; i>=0; i--) {
			
			while(st.size()!=0 && arr[i]>=st.peek() ) {
				st.pop();
			}
			if(st.size()==0) {
				
				nge[i]=-1;
			}
			else {
				nge[i] = st.peek();
			}
			
			st.push(arr[i]);
		}
		return nge;
		
	}

}
