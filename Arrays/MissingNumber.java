package Arrays;

import java.util.List;

public class MissingNumber {

	public static void main(String[] args) {

      List<Integer> list = List.of(1,2,4,5,6);
      
      for(int i=0; i<list.size(); i++) {
    	  
    	  if(!list.contains(i)&& i!=0) {
    		  
    		 System.out.println(i);
    	  }
      }
      
        }

    }



