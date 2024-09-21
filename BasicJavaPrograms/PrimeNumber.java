package BasicJavaPrograms;
import java.util.Scanner;

public class PrimeNumber {

	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 System.out.println("prime numbers till" +t);
		 for(int i=0; i <=t; i++) {
			 
		 //int n = sc.nextInt();
		 
		 if(i==1 || i==0)
		 {
			 System.out.println("prime");
		 }
		 int count =0;
		 for(int div=2; div <=i/2; div++) {
			 
			 if(i % div == 0) {
				 count++;
			 }
		 }
			 if(count==0)
			 {
				 System.out.println(i + " prime");
			 }
			 else {
				 System.out.println(i + " not prime");
		 }
		 }
	}
}

