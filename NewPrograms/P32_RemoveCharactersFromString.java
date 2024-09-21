package NewPrograms;

public class P32_RemoveCharactersFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "i am happy";
		String rmv = "imy";
		
		//public boolean contains(CharSequence chars)
		//public string replace(char prevChar, char newChar)  
		//public String replace(CharSequence target, CharSequence replacement) 
		//public String replaceAll(String str, String replacement)  
		
		for(int i=0; i<rmv.length(); i++) {
			if(str.contains(rmv.charAt(i)+"")) {
				str = str.replace(rmv.charAt(i)+"", "");
			}
		}
		System.out.println(str);
	}
	
}
