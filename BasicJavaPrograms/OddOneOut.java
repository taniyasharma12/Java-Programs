package BasicJavaPrograms;

public class OddOneOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//You are given three digits a, b, c

        //Two of them are equal, but the third one is different from the other two

        //Find the value that occurs exactly once
		
		int a = 10; 
		
		int b = 100;
		
		int c = 100;
		
		if(a==b) {
			
			System.out.println(c);
		}
        if(a==c) {
			
			System.out.println(b);
		}
        if(b==c) {
        	
			System.out.println(a);
	
        }
	}
	

}
