/**
 * 
 */
package miscellaneous;

import java.util.Arrays;

/**
 * @author TaniyaSharma
 *
 */
public class Leetcode443 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char chars[] = {'a','a','b','b','c','c','c'};
		
		System.out.println(compress(chars));

	}
	
	public static int compress(char[] chars) {

        StringBuilder sb = new StringBuilder();
         sb.append(chars[0]);
         
	     int count=1;
	     
	     for(int i=1; i<chars.length; i++){
	        
	        char prev = chars[i-1];
	        char curr = chars[i];

	        if(prev==curr){

	            count++;

	        }
	        else {
	         
	         if(count>1){
	         sb.append(count);
	          
	         }
	          sb.append(chars[i]);
	          count=1;
	         }
	        }
	     if(count>1) {
	    	 sb.append(count);
	     }
	     for(int i=1; i<sb.length(); i++) {
	    	 chars[i]= sb.charAt(i);
	     }
	 return sb.length();       
	    }
	}




