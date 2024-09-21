package NewPrograms;

public class MinimumDistanceBetween2Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str[] = { "the", "quick", "brown", "fox", "quick"};
		String word1 = "the";
		String word2 = "fox";
		int l1 = 0;
		int l2 = 0;
		
		// word2.length - word1.length
		
		for(int i=0; i<str.length; i++) {
			
			if(str[i]==word1) {
				l1 =i;
			}
			if(str[i]==word2) {
				l2 =i;
			}
		}
		System.out.println(l2-l1);
	}

}
