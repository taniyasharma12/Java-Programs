package Strings;
import java.util.Scanner;

public class CharacterDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
         String str = sc.next();
         char [] ch = str.toCharArray();
         String result = "";
         
         int i=1;
         int j=0;
         int res = 0;
         while(i<ch.length) {
        	 
        	 res=ch[i]- ch[j];
        	// result = str.charAt(i) + res;
        	 
        	 result += str.charAt(j);
        	 result += res;
        	 i++;
        	 j++;
        	 
         }
    	 System.out.print(result);
System.out.println(str.charAt(str.length()-1));
	}

}
