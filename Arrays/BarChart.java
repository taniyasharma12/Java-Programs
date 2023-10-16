import java.util.Scanner;

public class BarChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//take input
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i]= sc.nextInt();
			System.out.println(arr[i]);
		}
		
		//find max number
		int max = arr[0];
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i]>max) {
		    max = arr[i];	
			}
		}
		
	    System.out.println(max);

	   for( int floor = max; floor>=1; floor --) {
		   for(int i=0; i<arr.length; i++) {
			   if(arr[i]>=floor) {
				   System.out.print("*");
			   }
			   else
			   {
				   System.out.print(" ");

			   }
		   }
		   System.out.println();
	   }
	}

}
