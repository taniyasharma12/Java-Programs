package miscellaneous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int [][] intervals = {{1,3},{2,6},{8,10},{15,18}};
		
		
		merge(intervals);
		
	}	
		public static int[][] merge(int[][] intervals) {
	        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

	        for(int i=0; i<intervals.length; i++) {
	        	for(int j=0; j<intervals[i].length; j++) {
	        		
	        		System.out.println(intervals[i][j]);
	        	}
	        	
	        }
	        List<int[]> merged = new ArrayList<>();
	        int[] prev = intervals[0];

	        for (int i = 1; i < intervals.length; i++) {
	            int[] interval = intervals[i];
	            if (interval[0] <= prev[1]) {
	                prev[1] = Math.max(prev[1], interval[1]);
	            } else {
	                merged.add(prev);
	                prev = interval;
	            }
	        }

	        merged.add(prev);

	       
	        return merged.toArray(new int[merged.size()][]);         
	    }
	}