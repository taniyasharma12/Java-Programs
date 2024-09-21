package OOPSInheritance;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VeryAdvancedCalculator obj = new VeryAdvancedCalculator ();
		int r1 = obj.add(5,6);
		int r2 = obj.sub(8,6);
		int r3 = obj.mul(5,6);
		int r4 = obj.div(8,6);
		double r5 = obj.power(10,5);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
	}

}

class Calculator1{  //super class
	
	public int add(int a, int b) {
		
		return a+b;
	}
	
    public int sub(int a, int b) {
		
		return a-b;
	}
}



class AdvancedCalculator1 extends Calculator1{ //sub class
	
    public int mul(int a, int b) {
		
		return a*b;
	}

     public int div(int a, int b) {
	
	    return a/b;
    }
	
}

class VeryAdvancedCalculator extends AdvancedCalculator1 {
	
	
	public double power(int a, int b) {
		
		return Math.pow(a, b);
	}
}

/*
 This is multi level inheritance since
 
 Calculator1
 ^
 | extends
 
 AdvancedCalulaor1
 ^
 | extends
 
 VeryAdvancedCalculator
  
 */
