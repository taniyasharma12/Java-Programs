package NewPrograms;

public class P29_BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num [] = {1,2,3,4,5,6,7,8};
		
		int target = 4;
		
		if(binarySearch(num,target)==-1) {
		     System.out.println("not found");
		}
		
		else
		{
			System.out.println(binarySearch(num,target));
		}
	}
	
		public static int binarySearch(int[] num, int target) {
			
			int left = 0; 
			int right = num.length-1;
			
			
			while(left<=right) {
				int mid = (right-left)/2;
				if(num [mid]==target) {
					return mid;
				}
				else if(num[mid]<target) {
					left = mid+1;
				}
				else {
					right = mid-1;
				}
			}
			return -1;
		}
	}
