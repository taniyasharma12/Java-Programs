package NewPrograms;

import java.util.ArrayList;

public class P22_SortZerosAndOnesUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Arr [] = {1,1,0,0,1,0,1,1};
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<Arr.length; i++) {
			list.add(Arr[i]);
		}
		
		ArrayList<Integer> listOnes = new ArrayList<Integer>();
		
		ArrayList<Integer> listZeros = new ArrayList<Integer>();
		
		for(int i=0; i<Arr.length; i++) {
			if(Arr[i]==1) {
				listOnes.add(Arr[i]);
			}
			else
			{
				listZeros.add(Arr[i]);
			}
		}
		
		System.out.print(listZeros);
		System.out.print(listOnes);
		
	}

}
