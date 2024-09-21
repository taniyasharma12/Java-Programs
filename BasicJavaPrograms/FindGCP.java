package BasicJavaPrograms;

public class FindGCP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n1= 12;
		
		int on1=12;
		
		int on2 =34;
		
		int n2=34;
		
		
		while(n1%n2 !=0) {
			
			int rem = n1%n2;
			n1 = n2;
			n2 = rem;
		}
		
		int gcd = n2;
	
		int lcm = (on1*on2)/gcd;
		
		System.out.println(gcd);
		System.out.println(lcm);

	}
	

}
