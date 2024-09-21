package NewPrograms;

import java.util.*;

public class P24_LongestRepeatingSequenceInAString {

	
		// TODO Auto-generated method stub

		public static void main(String args[]) {
			String s = "abdfaabdfh";
			P8_ReverseEachWord st = new P8_ReverseEachWord();
			
			st.test();
			
			List<String> lst = allSubstrings(s);
			System.out.println();
	        List<String> lst1 = repeatingSubstrings(lst);
	        List<String> lst2 = solution(lst1);
	        System.out.println(lst2.get(lst2.size()-1));
		
		}

public static List<String> allSubstrings(String str){
	List<String> lst = new ArrayList<String>();
	for(int i=0; i<str.length(); i++) {
		for(int j=i+1; j<str.length(); j++) {
			lst.add(str.substring(i,j));
		}
	}
	System.out.print(lst);
	return lst;
		}

public static List<String> solution(List<String> listSorted) {
	String temp ="";
	String str[] = new String[listSorted.size()];
	for(int i=0; i<listSorted.size(); i++) {
	str[i] = listSorted.get(i);
	}
	for(int i=0; i<str.length; i++) {
		for(int j=i+1; j<str.length; j++) {
			if(str[i].length()>str[j].length()) {
				temp = str[i];
				str[i]= str[j];
				str[j]=temp;
			}		
		}
	}
	System.out.println(Arrays.toString(str));
	return List.of(str);
}

      public static List<String> repeatingSubstrings(List<String> list){
    	  List<String> lst = new ArrayList<String>();
    	  Map<String, Integer> map = new LinkedHashMap<String, Integer>();
    	  for(int i =0; i< list.size(); i++) {
    		  if(map.containsKey(list.get(i))) {
    			  map.put(list.get(i), map.get(list.get(i))+1);
    		  }
    		  else {
    			  map.put(list.get(i), 1);
    		  }
    	  }
    	  for(String key : map.keySet()) {
    		  if(map.get(key)>1) {
    			  lst.add(key);
    		  }
    	  }
    	  System.out.print(lst);
    	  return lst;
    	  
    	  
      }
}