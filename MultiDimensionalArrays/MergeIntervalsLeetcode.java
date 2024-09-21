/**
 * 
 */
package MultiDimensionalArrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

/**
 * @author TaniyaSharma
 *
 */
public class MergeIntervalsLeetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intervals [] [] = {{1,3},{2,6},{8,10},{15,18}};
		
		System.out.println(merge(intervals));
	}


	public static int[][] merge(int[][] intervals) {

		//sort array based on starting point of each interval
		
		Arrays.sort(intervals, (a,b)-> a[0]-b[0]);
		
		//create list of int array to store result
		
		List<int[]> result = new ArrayList<>();
		
		//store first interval in newInterval array ie 1,3
		
		int [] newInterval=intervals[0];
		
		result.add(newInterval);
		//iterate over each interval
		
		for(int [] interval : intervals) {
//if next interval starting point < previous interval ending point then then take max of both's ending point
			if(interval[0]<=newInterval[1]) {
				
				newInterval[1] = Math.max(newInterval[1], interval[1]);
			}
			else {
				
				newInterval = interval;
				result.add(newInterval);
			}
			
		}
		
		
		return result.toArray(new int [result.size()][]);

		
	}
}

//sort array based on starting point of each interval
//iterate one by one, if next interval starting point < previous interval ending point then merge