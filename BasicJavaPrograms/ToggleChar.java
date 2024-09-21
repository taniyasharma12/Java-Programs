package BasicJavaPrograms;
import java.util.Scanner;

public class ToggleChar {

	
	    public static void main(String[] args) {
	    		    	
	    	//char ch = ' ';
	    	
	    
	    // 65 A 92 Z , a 97 z 123
	    
	        //Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. 
	        Scanner sc = new Scanner(System.in);
	        String s = sc.next();
	        char ch[] = new char[s.length()];
	        for(int i=0; i<s.length(); i++) {
	            ch[i] = s.charAt(i);
	        }
	        for(int i=0; i<ch.length; i++){
	            if(ch[i] >= 65 && ch[i] <= 92) {
	                ch[i] = (char)(ch[i] + 32);
	            } else{
	                ch[i] = (char)(ch[i] - 32);                
	            }
	        }
	        for(int i=0; i<s.length(); i++) {
	            System.out.print(ch[i]);
	        }
	    }
	}



