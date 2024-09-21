
package InterviewQuestionProgram;

public class ExtractNumbers {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int number = 123;
		
	//100+20+3
				
		int power =0;
		
		int temp =number;
		
		int count =0;
		
		while(temp>0) {
			
			temp = temp/10;
			count++;
		}
		
		int div = (int) Math.pow(10, count-1);
		temp =number;
		
		while(temp>0) {
			
			int q = temp/div;
			System.out.println(q);
			temp=temp%div;
			div=div/10;
		}
		
	}

}

