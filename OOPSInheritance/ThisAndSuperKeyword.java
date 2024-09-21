package OOPSInheritance;

public class ThisAndSuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//test2 b = new test2(); 
		
/*whenever we create object of a class default constructor gets called
if we create object of sub class the super class constructor gets called 
first then sub class
*/
		test2 c = new test2(5); 
		
/*this will call default constructor for super class and parameterized 
 constructor for sub class
because by default super() method gets called which works on non parameterized 
constructor

BY DEFAULT EVERY CONSTRUCTOR HAS SUPER() AS FIRST STATEMENT(even id not mentioned)

 */
/*
 EVERY CLASS IN JAVA EXTENDS THE OBJECT CLASS BY DEFAULT , SO PARENT CLASS EXTENTS OBJECT
 CLASS ALWAYS 
*/
}
}

class test1{
	
	public test1() {
		
		System.out.println("this is A");
	}
	
	
    public test1(int x) {
		
		System.out.println("this is A int ");
	}
}

class test2 extends test1{
	
	public test2() {
		
		System.out.print("this is B");
		
	}
	
	public test2(int b) {
		
		this(); //-> this method executes the constructor of same class which is test2()
		
		//super(b);// this helps calling parameterized constructor of super class
		System.out.print("this is B int");

	}
	

}