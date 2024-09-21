package Arrays;

import java.util.Scanner;

public class RangeSumQuery {

	
		// TODO Auto-generated method stub

		 public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        int N = sc.nextInt();   // size of array
		        int Q = sc.nextInt();   // num of query

		        int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

		        for (int i = 0; i < Q; ++i) {

		            int l = sc.nextInt();  
		            int r = sc.nextInt();  
		            int v = sc.nextInt();  

		            // put v at l and -v at r+1 index so that at prefix sum time r+1 ke aage wale gets nullified
		            arr[l] = arr[l] + v;

		            if (r + 1 < N) {
		                arr[r+1] = arr[r+1] - v;
		            }
		        }

		        // convert the same array in the prefix sum array

		        for (int i=1; i<N; i++) {
		            arr[i] = arr[i] + arr[i-1];
		        }

		        for (int num : arr) {
		            System.out.println(num + " ");
		        }


		    }

		}