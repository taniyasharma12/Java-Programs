package NewPrograms;

public class P17_MaxOccuranceOfACharacterInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//make an integer array of 128 elements
		//store ascii value of characters in array
		//loop through int array to find max element
		
		String str = "rjjjjnnn";
		
		int max = Integer.MIN_VALUE;
		
		char ch = Character.MIN_VALUE;
		
		
		
		int[] char_count = new int[128];
		
		for(int i =0; i<str.length(); i++) {
			
			char_count[str.charAt(i)]++;
		}
		
		for(int i =0; i<str.length(); i++) {
			
			if(max<char_count[str.charAt(i)])	{
				max = char_count[str.charAt(i)];
				ch = str.charAt(i);
			}			
			}
		System.out.print(max + " "+ ch );
	}
}