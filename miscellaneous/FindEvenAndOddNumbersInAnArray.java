package miscellaneous;

public class FindEvenAndOddNumbersInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//2.find even odd numbers in array (print odd numbers first then even numbers)

		int [] arr = {3,4,2,5,6,1,9,13,34};
		int j=0;

		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				
				arr[j]=arr[i];
				j++;
			}
		}
			for(int i=j; i<arr.length; i++) {
				{
	           if(arr[i]%2!=0)
				arr[j]=arr[i];
				j++;
				
			}
		}
		
		for(j=0; j<arr.length; j++) {
			
			System.out.println(arr[j]);
		}
	}

}
