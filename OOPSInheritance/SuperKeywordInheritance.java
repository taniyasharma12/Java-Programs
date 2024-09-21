package OOPSInheritance;

public class SuperKeywordInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Main Class
	
	//A obj1 = new A(); //this only calls constructor of A since this is a super class
	B obj2 = new B(15);// it calls superclass constructor of super class and then sub class
	System.out.println("************");
	//B obj3 = new B(); // this calls non parameterized function of super class and
	                    //parameterized method from sub class
	}

}

class A { //A is superclass
	
	
	A()
	{ //super constructor
		System.out.println("in A");	
	}
	
	A(int a){
		System.out.println("in A int");	

	}
}


class B extends A{ //B is subclass
	
	
	B()
	{ //subclass constructor
		//super() --> this is called by default 
		System.out.println("in B");
	
	}
	B(int b){
		//super() --> this is called by default
		super(b); //because by default non parameterized constructor gets called
		System.out.println("in B int");	
}
}
/*
 Every sub class calls super() method by default that is why parent method gets called when we call child method
 But to call parameterized constructor of parent class we need to provide super(i) explicitly because by default only 
 non parameterized constructor gets called
 */

