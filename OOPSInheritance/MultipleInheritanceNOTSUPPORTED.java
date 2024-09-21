package OOPSInheritance;

public class MultipleInheritanceNOTSUPPORTED {

	/*
	 
	 MULTIPLE INHERITANCE NOT SUPPORTED IN JAVA
	 ie 
	 
	 ONE CHILD CLASS CANNOT INHERIT 2 PARENT CLASSES
	 

     WHY IT IS NOT ALLLOWED??
     
     Suppose class C has 2 Parent Classes A and B , both A and B show() method
     now if C class calls show() method we donot know if A method will be called 
     or B called
	 This problem is called ambiguity ie we have confusion which parent class method
	 to choose
	 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	class F{
	
		
	}
	
	
	class G{
	
		
	}
	
	
//	class H extends G, H{ --> gives error
	
	class H{
	
		
	}
	
	
}
