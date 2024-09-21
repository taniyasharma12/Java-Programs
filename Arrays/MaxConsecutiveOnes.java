package Arrays;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Arr[] = {0,0,1,1,1,1,0,0,1,1,1};
		System.out.print(findMaxConsecutiveOnes(Arr));

	}

	public static int findMaxConsecutiveOnes(int Arr[] ) {
	 
		int count =0;
		
		int maxCount = Integer.MIN_VALUE;
		
		for(int i=0; i<Arr.length; i++) {
			
			if(Arr[i]==1) {
				count++;
			}
			else {
			    maxCount = Math.max(maxCount,count);
			    count=0;
			}
			
		}
		 maxCount = Math.max(maxCount,count);
		return maxCount;
		
	}
}
