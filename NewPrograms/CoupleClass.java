package NewPrograms;

public class CoupleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Couple c1 = new Couple();
    
    c1.first=5;
    c1.second=10;
    
    
    System.out.println(c1.convertToString());
		
	
	
	Couple c2 = new Couple();
	
	c2.first = 5;
	
	c2.second=10;
	
	System.out.println(c1.equals(c2));

}}

class Couple{
	
	
	int first;
	
	int second;
	
	//constructors
	
	//default constructor is called ans sets values as 0, 0
	
	Couple(){
		
		System.out.print("hello");
	}
	
	String convertToString() {
		
		return "[ " + first + second + " ]";
	}
	
	boolean equals(Couple c2) {
		return first==c2.first && second == c2.second;
	}
}
