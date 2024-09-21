package Strings;

public class ReverseStringIILeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://leetcode.com/problems/reverse-string-ii/description/
	
		
		String str = "abcdefg";
		
		int k = 2;

		System.out.print(reverseStr(str,k));
		
	}
		public static void reverse(int left, int right, char arr[]) {
			
			while(left<=right) {
				
				 char temp= arr[left]; 
				 arr[left]=arr[right];
				 arr[right]=temp;
				 left++;
				 right--;
			}
		}
			
			public static String reverseStr(String str, int k) {
		        
				char s[] =str.toCharArray();
				
				int i=0; 
				
				while(i<s.length) {
				int j = Math.min(i+k-1,s.length-1);
				
				reverse(i,j,s);
				
				i = i+ 2*k;
				
				}
				return new String(s);
		    }
			
}
	

