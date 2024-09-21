package Strings;

public class FindFirstAndLastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 2056;
		
		String str = Integer.toString(number);
		
		System.out.println(str);
		
		System.out.println(str.charAt(0) + " "+ str.charAt(str.length()-1));
		
	}

}
