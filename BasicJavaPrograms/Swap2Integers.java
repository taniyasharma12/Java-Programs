package BasicJavaPrograms;
import java.util.Scanner;

public class Swap2Integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
				int a = sc.nextInt();
				int b = sc.nextInt();
				System.out.println(a);
				System.out.println(b);
				a = a+b;
				b = a-b;
				a = a-b;
				System.out.println("After Swap");
				System.out.println(a);
				System.out.println(b);

				
	}

}
