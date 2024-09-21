package Arrays;
import java.util.Scanner;

public class MaxArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Arr[] = new int[n];
        for(int i=0; i<n; i++){
            Arr[i] = sc.nextInt();
        }
        int max =Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
                if(Arr[i]>max) {
                	max=Arr[i];
                }
            }
        System.out.println(max);
        }
	}
