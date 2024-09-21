package Strings;

public class SumOfLastAndFirstDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 109773;
		
		String str = Integer.toString(number);
		
		// just subtract character '0' from num character to get char in int
		
		int firstDigit = str.charAt(0)-'0';
		
		int lastDigit  = str.charAt(str.length()-1) - '0';
		
		System.out.println(firstDigit+lastDigit);
		
		System.out.println(str.charAt(0));

        System.out.println(str.charAt(str.length()-1));

        System.out.println(str.charAt(0)+str.charAt(str.length()-1));

        for (int i = 'a'; i <= 'z'; i++) {
            System.out.println((char) i);
        }

	
	}

}

