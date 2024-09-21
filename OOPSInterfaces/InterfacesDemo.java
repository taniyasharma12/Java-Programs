package OOPSInterfaces;

public class InterfacesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		A object1 = new A();  this is not allowed since we cannot create object of interfaces
	
		A object1 = new mynew();
		
	
	
	}

}

/*

1.Abstract class which only has abstract methods alternative --> interface

2.Every method in interfaces is public and abstract by default

3.We cannot create object of interfaces we can create references

4.Interface just declares the methods but does not implement it

5.If a class implements an interfaces, it is mandatory for class to implement all methods
of interface or declare class as abstract

6.Every variables inside interface are public static final by default

 WHY DO WE NEED INTERFACES
 
Interfaces are used in Java to achieve total abstraction.


*/

interface A {
	
	int age = 0;
	String area = "";
	void show();
	void config();
}


class mynew implements A{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void config() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
