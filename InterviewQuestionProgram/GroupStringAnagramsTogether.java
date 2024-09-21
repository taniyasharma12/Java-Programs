package InterviewQuestionProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*
 Given an array of strings, group the strings that are anagrams of each other.
Example:
Input:
arr = ["eat", "tea", "tan", "ate", "nat", "bat"]
Output:
[["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]
Explanation:
The groups of anagrams are ["eat", "tea", "ate"], ["tan", "nat"], and ["bat"]. 
 */
public class GroupStringAnagramsTogether {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String [] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
		
		System.out.print(groupAnagrams(arr));
		
	}
	 
/*
Function should return List of List in output
Create a hashmap of String and List
extract string from string array and convert to array and sort it and convert to string
create entry in hashmap for sorted string and its word if not present
if key is present just add word to list
 */
	
	public static List<List<String>> groupAnagrams(String arr[]){
		
		Map<String, List<String>> map = new LinkedHashMap<>();
		
		      for(String word : arr) {
		    	  
		    	  char ch[] = word.toCharArray();
		    	  
		    	  Arrays.sort(ch);
		    	
		    	  String sortedWord = Arrays.toString(ch);
		    	  
		    //	  System.out.println(sortedWord);
		    	  
		    	  if(!map.containsKey(sortedWord)) {
		    		  
		    		  ArrayList<String> list = new ArrayList<String>();
		    		  
		    		  list.add(word);
		    		  
		    		  map.put(sortedWord, list);
		    		  
		    	  }
		    	  else {
		    		  
		    		  map.get(sortedWord).add(word);
		    		  
		    	  }
		      }
			return new ArrayList<>(map.values());
		
	}
}

	 
	 

