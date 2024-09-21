package OOPSPolymorphism;

public class CompileTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Calcu cal = new Calcu();
		
		System.out.println(cal.add(4,8));
		System.out.println(cal.add(4,8,2));
		
		
	}

}

/*
Static polymorphism/Compile time polymorphism is achieved by method overloading 
at compile time it decides which method to execute
 */

class Calcu{
	
	public int add(int n1, int n2) {
		
		return n1+n2;
		
	}
	
public int add(int n1, int n2, int n3) {
		
		return n1+n2+n3;
		
	}
	
}