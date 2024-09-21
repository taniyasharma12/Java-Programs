package BasicJavaPrograms;

public class FindNthFibonacciTerm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(fibo(7));
	}

	static int fibo(int n) {
		
		if(n==0 || n==1) 
			
			return n;
		

			int ans = fibo(n-1) + fibo(n-2);
		
		
		return ans;
	}
}
