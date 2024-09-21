package BasicJavaPrograms;
import java.util.Scanner;

public class PrintNumbersIndividually {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//System.out.println("number is "+n);
	    int temp= n;
		//45
		while(temp>0) {
			
			int rem = temp%10;
			System.out.println(rem);
			temp= temp/10;
			
			
		}
		


}

	}



