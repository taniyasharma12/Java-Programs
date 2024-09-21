package Arrays;

public class ProgramToPrintStrongNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//For example: 145 is strong number. Since, 1! + 4! + 5! = 145
		
		
		
		int n =145;
		
		int temp= n;
		
		int sum =0;
		
		int suml =1;
		
		while(temp>0) {
			
			int lastDigit = temp%10;
			
			for(int j=1; j<=lastDigit; j++) {
				
				suml= suml*j;	
			}
			sum = sum + suml;
			
			suml=1;
			
			temp = temp/10;
		}
		System.out.println(sum);
	}

}
