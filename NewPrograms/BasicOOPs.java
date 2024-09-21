package NewPrograms;



public class BasicOOPs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car amancreta = new Car();
		
		//set properties for aman creta
		
		amancreta.make = "Hyundai";
		amancreta.model= "Creta";
		amancreta.kmsDriven = 12000;
		System.out.println(amancreta.stringFormat());

	}

}


class Car{
	
	
	String make;
	
	String model;
	
	int kmsDriven;
	
	
	String stringFormat() {
		return make +" " + model + " "+ kmsDriven;
	}
}