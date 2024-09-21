package BasicJavaPrograms;

public class AddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
		
		int N = 2456;
		
		System.out.println(addDigits(N));
		
				
	}
	
	public static int addDigits(int number) {
		

		while(number>=10) {
			
			int currSum=0;
			
			while(number>0) {
				
				currSum = currSum + number %10;
				
				number = number /10;
			}
			
			number=currSum;
		}
		return number;
	}
	
}