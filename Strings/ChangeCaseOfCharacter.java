package Strings;

public class ChangeCaseOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "HeLLo";
		System.out.println(changeCase(str));

	}

	
	public static String changeCase(String str) {
		
		StringBuilder sb = new StringBuilder(str);
		
		for(int i=0; i<sb.length(); i++) {
			
		char ch = sb.charAt(i);
		
		
		if(ch>='a'&& ch <= 'z')
		{
			char up = (char) ('A' + ch - 'a'); // ch -a = up -A
			sb.setCharAt(i, up);
		}
		else if(ch>='A'&& ch <= 'Z')
		{
			char down = (char) ('a' + ch - 'A');  // ch-A = down - a
			sb.setCharAt(i, down);

		}
		}
		return sb.toString();
				
	}
}
