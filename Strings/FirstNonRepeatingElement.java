package Strings;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "xeetcodex";
		
		System.out.println(firstUniqChar(str));
		
	}
	
	public static int firstUniqChar(String s) {

	       char ch =' ';

	       int result =0;

	       Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();

	       for(int i=0; i<s.length(); i++){

	        if(map.containsKey(s.charAt(i))){

	            map.put(s.charAt(i), map.get(s.charAt(i))+1);
	        }
	        else{

	            map.put(s.charAt(i), 1);
	        }
	       } 
	       for(Character key : map.keySet()){
	              
	              if(map.get(key)==1){
	                ch = key;
	                //System.out.println(ch);
                   break;
	              }
	       }
	       for(int i=0; i<s.length(); i++){
	           if(s.charAt(i)==ch){
	            result = i;
	            break;
	           }else{
	            result =-1;
	           }
	       }
	       return result;
	    }
	}