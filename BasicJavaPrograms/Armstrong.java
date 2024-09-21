package BasicJavaPrograms;
import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int number = 153;
     
     //armstrong = all digits raise to power number of dig + 
         
       //we need count, last digit , then sum of last digits to power count
        
        System.out.println(isArmStrong(number));
        
        
	}
	
	
	public static boolean isArmStrong(int number) {
		
		int temp = number;
		
		int sum=0;
		
		int count=0;
		
		while(temp>0) {
			
			 temp = temp/10;
			
			count++;		
		}
		
		temp=number;
		
		while(temp>0) {
			
			int rem = temp%10;
			
			sum+= Math.pow(rem, count);
			
			temp = temp/10;
		}
		
		if(sum==number) {
			return true;
		}
		
		return false;
	}
	
}