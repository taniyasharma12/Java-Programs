package BasicJavaPrograms;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class PrintOnceAppearingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int num[] = new int[n];
	        for(int i=0; i<n; i++){
	            num[i] = sc.nextInt();
	        }
	  LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
	  for(int i=0; i<n; i++) {
			if(map.containsKey(num[i])) {
				map.put(num[i], map.get(num[i])+1);
			}
			else {
				map.put(num[i], 1);
			}
		}
	     for(int i=0; i<n; i++)
		{
			if (map.get(num[i])==1){
				System.out.println(num[i]);
				
			}
	  }
              

	  /*
          for(int key : map.keySet())  {
        	  if(map.get(key)==1) {
        	  System.out.print(key + " ");
        	  System.out.println(map.get(key));
          }
	  }
	  */
	}
}
	