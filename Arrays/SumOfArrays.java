package Arrays;
import java.util.Scanner;

public class SumOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		
		int a1 [] = new int[n1];
		
		for(int i=0; i<n1; i++) {
			
			a1[i]= sc.nextInt();
		}
		
		int n2 = sc.nextInt();
		
		int a2[] = new int[n2];
		
for(int j=0; j<n1; j++) {
			
			a2[j]= sc.nextInt();
		}

int sum [] = new int[n1>n2 ? n1:n2];

int i= a1.length-1;
int j= a2.length-1;
int k = sum.length-1;

int c = 0;



	while (i>=0|| j>=0){
		int d = c;
		if(i>=0) {
		
		d+=a1[i];
	}
		if(j>=0) {
			d+=a2[j];
		}		
 c=d/10;
 d=d%10;
 sum[k]=d;
 
 i--;
 k--;
 j--;
}
	if(c>0) {
		System.out.println(c);
	}
	
	for(int val :sum) {
	    System.out.println(val);

	}
}
}