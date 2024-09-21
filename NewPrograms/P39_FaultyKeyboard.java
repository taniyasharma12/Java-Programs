package NewPrograms;

import java.util.Scanner;

public class P39_FaultyKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// input name = "taniya"
		// typed = "ttaaniya"
		
		// true - if name can be derived from typed else false
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		
		String typed = sc.next();
		
		System.out.println(canFormName(name, typed));
		
		}
	
	public static boolean canFormName(String name, String typed) {
		int i=0;
		int j=0;
		while(i<name.length() && j< typed.length()) {
			
			if(name.charAt(i)== typed.charAt(j)) {
				i++;
				j++;
			}
			else if(i >0 && name.charAt(i-1)==typed.charAt(j)) {
				j++;
			}
			else {
				return false;
			}
		}
		
		while(j<typed.length()) {
			if(name.charAt(i-1)!=typed.charAt(j)) {
				return false;
			}
			j++;
		}
		return i<name.length() ? false : true;
		
		
	}

}
