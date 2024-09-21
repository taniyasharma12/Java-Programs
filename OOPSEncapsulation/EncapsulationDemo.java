package OOPSEncapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Human human = new Human();
		
		// human.getAge() =14;
		//human.name= "xyz";
		human.setAge(10);
		System.out.println(human.getAge());
		System.out.println(human.getName());
		
	}

}



/*
Just by using object anyone can fetch data, Not all data should be accessible
to resolve this make keywords private so that variable will be only accessible in class

Everytime you create an instance varible make it private

If you want to access private data you need to use methods

Private varibles + Public Methods -> Binding Data , Encapsulating Method and Variables

Getters to get value and Setters to set value

*/

class Human{
	
	private int age;
	private String name = "hello";
	
	public int getAge() {
		
		return age;
		
	}
	
	public void setAge(int a) {
		
		age =a;
	}
	
public String getName() {
		
		return name;
		
	}
}