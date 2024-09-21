package Strings;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class HackerRankSherLockAndTheValidStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abcc";
		System.out.println(isValid(str));
  //https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem
	}

	/*
	 
	Sherlock considers a string to be valid if all characters of the string 
	appear the same number of times. It is also valid if he can remove just one
	character at index in the string, and the remaining characters will occur 
	the same number of times. Given a string , determine if it is valid. 
	If so, return YES, otherwise return NO.
	 
	 */
	
	public static String isValid(String s) {
        
	    Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
	    
	    for(int i=0; i<s.length(); i++){
	        
	        if(map.containsKey(s.charAt(i))){
	            
	            map.put(s.charAt(i), map.get(s.charAt(i))+1);
	        }
	        
	        else{
	            
	            map.put(s.charAt(i), 1);
	        }
	    }
	    
	    int arr[] = new int[map.size()];
	    
	    int i=0;
	    for(Character element : map.keySet()){
	        
	        arr[i++] = map.get(element);
	    }
	    
	    Arrays.sort(arr);
	    
	    int first = arr[0];
	    
	    int second = arr[1];
	    
	    int last = arr[arr.length-1];
	    
	    int secondLast = arr[arr.length-2];
	    
	    
	    //if first and last and same all frequencies are same
	    
	    if(first ==last){
	        
	        return "YES";
	    }
	    //if first is 1 and all other characters have frequency
	    
	    if(first ==1 && second == last){
	        
	        return "YES";
	    }
	    //if all are same and last character is one extra
	    
	    if(first == secondLast && secondLast ==(last-1)){
	        
	        return "YES";
	    }
	      return "NO";
	    
	    }

	}


