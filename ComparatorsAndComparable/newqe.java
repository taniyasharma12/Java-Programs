package ComparatorsAndComparable;

import java.util.Arrays;
import java.util.HashMap;

public class newqe {
	public static void main(String[] args) {


	int nums [] = {1,1,2,2,2,3};
	
	System.out.println(frequencySort1(nums));
}

public static int[] frequencySort1(int[] nums) {

    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    for (int e : nums) {
        map.put(e, map.getOrDefault(e, 0) + 1);
    }

    Integer[] arr = new Integer[nums.length];

    for (int i=0; i < nums.length; i++) {
        arr[i] = nums[i];
    }

    Arrays.sort(arr, (a, b) -> {
        if (map.get(a) != map.get(b)) {
            // if freq of numbers are not equal then return in increasing order based on
            // freq.
            return map.get(a) - map.get(b);
        } else {
            // otherwise sort them in decreasing order based on number in nums.
            return b - a;
        }
    });

    for (int i=0; i < nums.length; i++) {
        nums[i] = arr[i];
    }

    return nums;

}
}