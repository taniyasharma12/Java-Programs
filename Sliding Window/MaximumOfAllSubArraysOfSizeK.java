package SlidingWindowFixedSize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumOfAllSubArraysOfSizeK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,3,-1,-3,5,3,6,7};
        
		int k =3;
		
        System.out.println(maxofAllSubArrayOfSizeK(arr,k));


	}

/*
1. take pointers i and j, create an array of size nums.length-k+1
2. take arrayIndex pointer to iterate new array
3. create a list to elements as we move in window
4. while j < nums.length check if size of list is not 0 and last element of 
   list < current element them remove the element from list and add current element 
   to list (as we want to keep maxmimum element at beginning of list
[the element which are to the left of j and are smaller than list top element can be removed since those are of no user
dont need to remove smaller elements which are on right because they can become maximum in next window]
5. while window size < k j++
6. if window size ==k then assign value of first element of list to first element of ans
   array and increment index of array [ maximum will always be the start element of list]
7. if nums[i] == list.get(0) ie 
 */
	
	public static String maxofAllSubArrayOfSizeK(int nums [], int k) {
		//{9, 10, 9, -7, -4, -8, 2, -6};
		int i=0;
		int j=0;
		int arrayIndex=0;
		
		int ans [] = new int[nums.length-k+1];
		
		List<Integer> list = new ArrayList<Integer>();
		
		  while(j<nums.length) {
			  
			  
			  while(list.size()!=0 && list.get(list.size()-1)<nums[j]) {
				  
				  list.remove(list.get(list.size()-1));
				  
			  }
			list.add(nums[j]);  
		
		  if(j-i+1<k) {
			  
			  j++;
		  }
		  else if(j-i+1==k){
			  
			  ans[arrayIndex] = list.get(0);
			  arrayIndex++;
			  if(nums[i]==list.get(0))
			  list.remove(list.get(0));
			  i++;
			  j++;
		  }
	}
		return Arrays.toString(ans);
	
	}
}

