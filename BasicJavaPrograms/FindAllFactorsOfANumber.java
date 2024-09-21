package BasicJavaPrograms;

public class FindAllFactorsOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//factors -- that divide the number completely
		int number = 24;
		
		for(int i=1; i<number; i++) {
			
			if(number%i==0) {
				System.out.println(i);
			}
		}
	}

}
