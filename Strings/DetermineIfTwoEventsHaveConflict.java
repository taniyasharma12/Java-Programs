package Strings;

public class DetermineIfTwoEventsHaveConflict {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String event1[] = {"02:00","02:10"};
		String event2 [] = {"02:30","13:00"};
		
		System.out.println(haveConflict(event1, event2));
	}

	public static boolean haveConflict(String[] event1, String[] event2) {
        
       //start time of event1 lies between start and end time of event2 
       //start time of event2 lies between start and end time of event1


		   Integer s1 = Integer.valueOf(event1[0].replace(":", ""));
		   System.out.println(s1);
		   Integer e1 = Integer.valueOf(event1[1].replace(":", ""));
		   System.out.println(e1);
		   Integer s2 = Integer.valueOf(event2[0].replace(":", ""));
		   System.out.println(s2);
		   Integer e2 = Integer.valueOf(event2[1].replace(":", ""));
		   System.out.println(e2);
		   
	   
	   if(s1>s2 && s1<e2 || s2>s1 && s2<e1) {
	
		   return true;
	   
	}
       
      return false;  
      
    }
}
