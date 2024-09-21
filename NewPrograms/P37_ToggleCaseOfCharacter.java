package NewPrograms;

public class P37_ToggleCaseOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 65 A 92 Z , a 97 z 123
		
		StringBuilder str  = new StringBuilder("AbgfGSJJE");
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(ch>='a'&& ch<='z') {
				char uch = (char)('A' + ch - 'a');
				str.setCharAt(i, uch );
			}
			if(ch>='A' &&ch<='Z') {
				char lch =(char) ('a' - 'A' + ch);
				str.setCharAt(i, lch );
			}
			
		}
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
		}
	}

}
