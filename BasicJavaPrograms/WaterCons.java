package BasicJavaPrograms;

import java.util.Scanner;

//if water consumption is more than 2000 print yes else no

public class WaterCons {
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
    		int x = sc.nextInt();
    		if(x>=2000){
    		    System.out.println("yes");
    		}
    		else{
    		    System.out.println("no");
    		   
    		}
		}
		
	}
}
