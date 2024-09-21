package Strings;

public class ReverseVowelsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "ai";
		
		System.out.println(reverseVowels(s));
		
		//output "leotcede"

	}
		
	public static String reverseVowels(String s) {

        char [] arr = s.toCharArray();

       int left =0; 

       int right= arr.length-1;

       while(left<=right){

        while(left<right&& isVowel(arr,left)==false){
         left++;
        }

        while(left<right&& isVowel(arr,right)==false){
         right--;
        }

       swap(arr, left, right);
       left++;
       right--;
       }
       String str ="";
 for(int i=0; i<arr.length; i++){
    str+=arr[i];
 }
     return str;   
    }


	public static void swap(char arr[], int left, int right) {
		char temp = arr[left];
		
		arr[left] = arr[right];
		
		arr[right] = temp;
		
	}


    public static boolean isVowel(char [] arr, int index){
        
        char ch = arr[index];
				if(ch=='a'|| ch=='e'||ch=='i'|| ch=='o'|| ch=='u'||ch=='A'|| ch=='E'||ch=='I'|| ch=='O'|| ch=='U'){
					
					return true;
				}
				else {
					return false;
				}
			}

    
}