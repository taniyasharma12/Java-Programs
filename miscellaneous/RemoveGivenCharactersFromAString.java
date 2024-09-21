package miscellaneous;

public class RemoveGivenCharactersFromAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "i am happy";
		String rmv = "imy";
		
		
		
		
		//output a happ
		
		for(int i=0; i<rmv.length(); i++) {
			
			if(str.contains(rmv.charAt(i)+"")) {
				
				str = str.replace(rmv.charAt(i)+"", "");
			}
		}
		
		System.out.println(str);
	}

}
