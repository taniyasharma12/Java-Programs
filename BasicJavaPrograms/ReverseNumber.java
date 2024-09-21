package BasicJavaPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//reverse a number
		//56 
		
		/*
		 56 = 
		 56%10 =  6 remainder
		 5*10 + 6
		 
		 67
		 6*10 + 7
		 
		 
		  
		 
		 */
		int number = 56;
		int rev = 0;
		
	while(number>0)
	{
	
	int lastDigit = number %10;
    rev = (rev*10) + lastDigit;
	number = number/10;
	
	//System.out.println(rev);	
	}
System.out.println(rev);
}
}
