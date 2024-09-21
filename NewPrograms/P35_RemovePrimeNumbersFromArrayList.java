package NewPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class P35_RemovePrimeNumbersFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
		 
		 int n = sc.nextInt();
			 
		 ArrayList<Integer> list = new  ArrayList<Integer>();

		 for(int i=0; i<n; i++) {
			 
			 list.add(sc.nextInt());
		 }
		 
		 for(int i=0; i<list.size(); i++) {
			 
			 if(isPrime(list.get(i))){
           		 list.remove(i);
				 i--;
			 }
		 }
		 for(int i=0; i<list.size(); i++) {
			 System.out.println(list.get(i));
		 }
		 
	}
		 public static boolean isPrime(int number) {
			 
			 if(number <=1) {
				 return false;
			 }
			 for (int i=2; i<=number/2; i++) {
				 if(number%i==0) {
					 return false;
				 }
			 }
			 return true;
		 }
}
	

         