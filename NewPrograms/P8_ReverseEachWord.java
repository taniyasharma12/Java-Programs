package NewPrograms;

public class P8_ReverseEachWord {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		String str = "Hello how are you doing";
		//OUTPUT - olleH woh era uoy gniod 
		
		String test1 = "hello";
		
		//test st = new test();
		
		P8_ReverseEachWord st = new P8_ReverseEachWord();
		
		st.test();
		
		
		
		String rev ="";
		
		String words[] = str.split(" ");
		
		for(int i=0; i<words.length; i++) {
			
			String word = words[i];
			String revWord = "";
			for(int j=word.length()-1; j>=0; j--) {
				
				revWord = revWord + word.charAt(j);
			}
			rev = rev + revWord + " ";
		}
		
		System.out.print(rev);
		
	}
	void test() {
		
		//
	}
}