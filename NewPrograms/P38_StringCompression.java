package NewPrograms;

public class P38_StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "AABBBCCDDFFFFFY";
		
	   System.out.print(compressedString(str));
		
		
		//store first char in a variable , store count in a variable
		//declare an empty string for storing compressed string
		//start loop from one index if first char == curr char then increment count
		//if not equal then add first char + count then increment count and store curr character in first char
	}
		public static String compressedString(String str) {
			
			String comp="";
			char prevChar = str.charAt(0);
			int count = 1;
			
			for(int i =1; i<str.length(); i++) {
				
				if(str.charAt(i)==prevChar) {
					count++;
				}
				else {
					comp = comp+ Character.toString(prevChar) + Integer.toString(count);
					count=1;
					prevChar = str.charAt(i);
				}
			}
			comp = comp+ Character.toString(prevChar) + Integer.toString(count);

					return comp;	
		}

		
	}
		


	
	