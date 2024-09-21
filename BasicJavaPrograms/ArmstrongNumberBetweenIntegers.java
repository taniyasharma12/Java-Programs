package BasicJavaPrograms;

public class ArmstrongNumberBetweenIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number1 = 1;
		int number2 = 153;
		
//		int sum = 0;
	
		for(int i=number1; i<=number2; i++) {
			
			int temp =i;
			
			int count =0;
			
			int sumi= 0;
			
			while(temp>0) {
				
				temp = temp/10;
				
				count++;
			}
			
			temp =i;
			
			while(temp>0) {
				
				int rem = temp%10;
				
				sumi+= Math.pow(rem, count);
				
				temp = temp/10;
			}
			
			if(sumi==i) {
				System.out.println(i);
			}
		}
	}
}