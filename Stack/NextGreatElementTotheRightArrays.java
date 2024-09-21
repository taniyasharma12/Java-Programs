package Stack;

import java.util.ArrayList;
import java.util.List;

public class NextGreatElementTotheRightArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int arr[] = {2, 5, 9, 3, 1, 12, 6, 8, 7};
		
		int max=0;
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i; j<arr.length; j++) {
			
             max = arr[i];
             if (arr[j] > max) {
                 max = arr[j];
                 break;
             }

             if (max == arr[i]) {
                 max = -1;
             }

         }

         list.add(max);

     }

     System.out.println(list); 

     }
		
	}


