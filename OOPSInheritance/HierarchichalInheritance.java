package OOPSInheritance;

public class HierarchichalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 
		 one super class is extended by multiple superclasses
		 
		 
		 
		 */
		
		Y obj = new Y ();
       
		obj.print();
		
		Z z = new Z();
		
		z.print();
		
		
	}

}

class X{
	
	public void print() {
		
		System.out.println("Class X");
	
        }
}
class Y extends X{
	
	 public void printy() {
		
		System.out.println("Class Y");
	
        }
}

class Z extends X{
	
	 public void printz() {
		
		System.out.println("Class Z");
	
       }
}



