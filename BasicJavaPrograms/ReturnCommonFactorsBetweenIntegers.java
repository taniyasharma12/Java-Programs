package BasicJavaPrograms;

public class ReturnCommonFactorsBetweenIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a = 36;
		
		int b = 45;
		
		int count=0;
	
		for(int i=1; i<=Math.min(a, b); i++) {
			
			
			if(a%i==0 && b%i==0) {
				
				count++;
			}
			
		}
       System.out.println(count);
	}

}
