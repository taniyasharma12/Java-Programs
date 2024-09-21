package NewPrograms;

public class P7_ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This is My Program";
		String words [] = str.split(" ");
		
		String rev = "";
		
		for(int i=words.length-1; i>=0; i--) {
			
			rev = rev + words[i]+ " ";
		}
		
		System.out.println(rev);
	}
	
}
