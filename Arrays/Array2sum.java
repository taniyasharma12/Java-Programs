package Arrays;
import java.util.Scanner;

public class Array2sum {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int Arr[] = new int[n];
        for(int i=0; i<n; i ++){
            Arr[i] = sc.nextInt();
}
            int k = sc.nextInt();
            boolean ans = getSumFlag(Arr, k, n);
            System.out.print(ans);
        }
    
        
        public static boolean getSumFlag(int Arr[], int k, int n){
        for(int i=0; i<n; i++){
            for(int j= i+1; j<n; j++)
            {
                if(Arr[i]+Arr[j]==k){
                    return true;
                }
            }
        }
             return false;
            }
}   