package BasicJavaPrograms;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class FindFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int m = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		int arr1 [] = new int[m];
		
		for(int i=0; i<m; i++) {
			arr1[i] = sc.nextInt();
		}
		
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		
		for(int i=0; i<n; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		System.out.print(map);
		
	for(int j=0; j<m; j++)
	{
		if (map.containsKey(arr1[j])){
			System.out.println(arr1[j]+ " " +map.get(arr1[j]));
		}
		else{
            System.out.println("0");
        }
	}
		

	}

}
