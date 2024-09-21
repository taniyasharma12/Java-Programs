package ComparatorsAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



class MyCustomComparator implements Comparator<Animal>{

	@Override
	public int compare(Animal o1, Animal o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.weight, o2.weight);
	}
	
	
}
public class LearnComparableAndComparators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		Animal a1 = new Animal(4, "leo", 10);
		Animal a2 = new Animal(2, "Bruno", 4);
		Animal a3 = new Animal(1, "Maxo", 6);
		Animal a4 = new Animal(3, "Don", 3);
		
		List<Animal> dogs = new ArrayList<Animal>();

		
		dogs.add(a1);
		dogs.add(a2);
		dogs.add(a3);
		dogs.add(a4);
		
		System.out.println(dogs);
		//to compare 2 dogs make class comparable
		
		Collections.sort( dogs);
		
		Collections.sort(dogs, new MyCustomComparator());

		System.out.println(dogs);

		Collections.sort(dogs, new Comparator<Animal>(){
			
			@Override
			public int compare(Animal o1, Animal o2) {
			return o1.name.compareTo(o2.name);
		
		}
		});

		
		
		/*
		 Collections.sort(dogs, Comparator<Animal>(){
		 @Override
		 public int compare(Animal o1, Animal o2){
		 
		 return 0;
		 }}); 
		 */
		
		//lamba expressions

		Collections.sort(dogs, (o1, o2) -> {return o1.name.compareTo(o2.name);});
		
		//or
		
		Collections.sort(dogs, (o1, o2) -> o1.name.compareTo(o2.name));
		
		
		
	}
		
		
		
}