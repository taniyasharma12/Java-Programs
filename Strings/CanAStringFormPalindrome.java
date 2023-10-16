
public class CanAStringFormPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(canBePalindrome("aabbc"));
	
	} //aabbccd

	public static boolean canBePalindrome(String s) {
		int[] char_counts = new int[128];
		
		for(int i =0; i< s.length(); i++) {
			char_counts[s.charAt(i)]++;
			System.out.println(char_counts[s.charAt(i)]);
			//System.out.println(char_counts[i]);
		}
	int count  = 0;
		
		for(int j=0; j <128; j++) {
			count += char_counts[j] %2;;

		}
	if(count<=1) {

	
	return true;
	}
	else
		return false;
	}
}

