package OOPSInterfaces;

public class MultipleInheritenceThroughInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Demo object3 = new DemoImp();
		object3.abc();
		object3.show();
		
	}

}

interface Demo{
	
	void abc();
	
	default void show() {

//Java8 provides the ability to create default method implementations:
		
		System.out.println("in Demo show");
	}
	
	
}


/*
 In order to acheive multiple inheritance through interfaces, one class can implement 
 2 interfaces. If there is common method in both the interfaces. Then which method will be
 called out of two interfaces methods??
 to resolve this we implement the common method in the class itself which implements the 2
 interfaces
 
 */
interface MyDemo{
	
	default void show() {

		//Java8 provides the ability to create default method implementations:
				
				System.out.println("in MyDemo show");
			}
	
}


class DemoImp implements Demo, MyDemo {
	
	
	public void abc() {
		
		System.out.println("in abc");
	}
	public void show() {

		//Java8 provides the ability to create default method implementations:
				
				System.out.println("in DemoImp");
			}
}