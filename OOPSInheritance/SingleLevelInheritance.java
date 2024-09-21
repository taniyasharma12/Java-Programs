package OOPSInheritance;

public class SingleLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//This is single level inheritance since there is only one level
//one subclass is extending one superclass
		AdvancedCalculator obj = new AdvancedCalculator ();
		
		int r1 = obj.add(5,6);
		int r2 = obj.sub(8,6);
		int r3 = obj.mul(5,6);
		int r4 = obj.div(8,6);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);

	}

}


class Calculator{  //super class
	
	public int add(int a, int b) {
		
		return a+b;
	}
	
    public int sub(int a, int b) {
		
		return a-b;
	}
}



class AdvancedCalculator extends Calculator{ //sub class
	
    public int mul(int a, int b) {
		
		return a*b;
	}

     public int div(int a, int b) {
	
	    return a/b;
    }
	
}
/*

Why do we need Inheritance?

Allows to copy features from parent class to child class

1.Increases code Reusability & decreases redudandancy
2.Method overriding -> subclass can define parent methods according to their usability
3.Polymorphism


*/