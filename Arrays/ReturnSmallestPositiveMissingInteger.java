package Arrays;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

public class ReturnSmallestPositiveMissingInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1, 2, 5, 10, 11};
		System.out.println(solution(a));
	}

	public static int solution(int a[]) {
		
		int smallInt = 1;
		
		Set<Integer> set = new LinkedHashSet<Integer>();
		
		for(int i=0; i<a.length; i++) {
			set.add(a[i]);
			}
		while(set.contains(smallInt)) {
		smallInt++;
		}
		
		return smallInt;
		
	}
}
