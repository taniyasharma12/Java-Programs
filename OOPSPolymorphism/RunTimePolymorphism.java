package OOPSPolymorphism;

public class RunTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		One oj = new Two();
/*
Reference of One [Super Class] and Object of Two [Sub Class]	
REFERENCE OF PARENT AND OBJECT OF CHILD
If we have same method show in both parent and child class then which method will be called?
		
show method of child class is called because object is of child class

*/		
		oj.show();
		
		Computer computer = new Laptop();
	}

}

//Run time polymorphism is achieved by DYNAMIC METHOD DISPATCH

class One{
	
	public void show() {
		
		System.out.println("in ONE show");
	}
	
}


class Two extends One{
	
public void show() {
		
		System.out.println("in TWO show");
	}
	
}

class Three extends One{
	
public void show() {
		
		System.out.println("in THREE show");
	}
	
}

class Computer {
	
	
	
	
	
}

class Laptop extends Computer{
	
	
	
}