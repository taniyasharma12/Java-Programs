package Strings;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//https://leetcode.com/problems/find-words-containing-character/description/
		
		String [] arr = {"abc","bcd","aaaa","cbca"};
		
		System.out.println(findWordsContaining(arr,'a'));
	}
public static List<Integer> findWordsContaining(String[] words, char x) {
        
	List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<words.length; i++) {
        	
        	if(words[i].contains(x+"")) {
        		
        		list.add(i); 		
        	}
    }
        return list;
}
}