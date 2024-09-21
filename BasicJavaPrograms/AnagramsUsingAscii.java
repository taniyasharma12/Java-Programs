package BasicJavaPrograms;

public class AnagramsUsingAscii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1="BHGJU";
		
		String str2 ="UGJBH";
		
		System.out.println(isAnagram(str1,str2));
	}
	
	
	
	public static boolean isAnagram(String str1, String str2) {
		
		
		char ch1[] = str1.toCharArray();
		
		char ch2[] = str2.toCharArray();
		
		
		int count[] = new int[128];
		
		
		for(int i=0; i<str1.length(); i++) {
			
			count[str1.charAt(i)]++;
		}
		
        for(int i=0; i<str2.length(); i++) {
			
			count[str2.charAt(i)]--;
		}
        
        for(int i=0; i<128; i++) {
        	
        	if(count[i]!=0) {
        		
        		return false;
        	}
        }
        
        return true;
	}

}
