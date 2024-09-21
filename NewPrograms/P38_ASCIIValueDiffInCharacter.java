package NewPrograms;

public class P38_ASCIIValueDiffInCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abdgca";
		System.out.print(str.charAt(0));
		
		for(int i=1; i<str.length(); i++) {
			
        
		char curr = str.charAt(i);
		char prev = str.charAt(i-1);
		
		System.out.print(curr-prev);
		
		System.out.print(str.charAt(i));
		
	}
}
}