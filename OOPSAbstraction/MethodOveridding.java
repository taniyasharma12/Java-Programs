package OOPSAbstraction;

public class MethodOveridding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		advCalc objj = new advCalc();
		objj.add(3,2);
		System.out.println(objj.add(3,2));	
		
	}

/*
 
add method of advCalc is overriding add method of calc

*/
}


class calc{
	
	
	public int add(int n1, int n2) {
		
		return n1+n2;
	}
}

class advCalc extends calc {

@Override  //annotation not mandatory but can use for information
public int add(int n1, int n2) {
		
		return n1+n2+1;
	}
	
}