package Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class AscendingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		char arr[] = str.toCharArray();

		String str1 = "";
		
		//ArrayList<String> list = new ArrayList<String>();

		// "abcfDaz"

		for (int i = 0; i < str.length()-1; i++) {

			//System.out.println((int) arr[i]);
			//System.out.println(arr[i]);
			if ((int) arr[i] < (int) arr[i + 1]) {
				str1 = str1 + arr[i];			
			}
		//	str1 = str1 + arr[i];

		}
	
		System.out.println(str1);

	}

}
