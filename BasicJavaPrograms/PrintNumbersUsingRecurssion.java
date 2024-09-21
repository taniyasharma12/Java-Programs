package BasicJavaPrograms;

public class PrintNumbersUsingRecurssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 6;
        sum(n);	
       
	}

	
	public static void sum(int N) {
		
		if(N==0)
			return;
		
		sum(N-1);
		
		System.out.println(N);
	}
}
