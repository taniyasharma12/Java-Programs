package SearchAlgorithms;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int number =144;
	
	System.out.println(sqaureRT(number));
	
	}
	
	public static int sqaureRT(int number) {
		
		if(number==1 ||number ==0) 
			
			return number;
		
		
		int start =0;
		
		int end = number;
		
		int ans=-1;
		
		while(start<=end) {
			
			int mid = (start+end)/2;
			
			if(mid*mid > number) {
				
				end = mid-1;
			}
			
			else {
				ans=mid;
				start = mid+1;
			}
		}
		return ans;
	}

}
