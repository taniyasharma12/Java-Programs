package Strings;

public class ASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println('a');
		
		System.out.println((int)'a');
		
		for(int i=0; i<256; i++) {
			
			System.out.print(i +"\t -> \t");
			
			System.out.println((char)i +" ");

			//A-Z 65 to 90
			//a-z 97 to 122
		}

	}

}
