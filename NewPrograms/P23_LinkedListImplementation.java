package NewPrograms;

import java.util.LinkedList;
import java.util.List;

public class P23_LinkedListImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new LinkedList<Integer>();
		
		list.add(5);
		list.add(9);
		list.add(1, 6);
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		list.set(0, 8);
		System.out.println(list);

		//iterate linked list
		
		for(int i=0; i<list.size(); i++)
		{
			System.out.print(list.get(i));
		}
		
	//using for each loop
	for(int k : list) {
		{
			System.out.print(k);
		}
	}
	//convert linked list to array
	Object[] a = list.toArray();

}
}
