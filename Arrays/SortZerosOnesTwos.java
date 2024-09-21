package Arrays;

public class SortZerosOnesTwos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[] = {2,0,2,1,1,0}; //0,0,1,1,2,2
		
        int count0 =0;
        
        int count1 =0;
        
        int count2 =0;


        for(int i=0; i<arr.length; i++) {
            
            if(arr[i]==0) {
                
                count0++;
            }
            else if(arr[i]==1) {
                
                count1++;
            }
            else
            {
                count2++;
            }
        }
        
        int j=0;

        for(int i=0; i<count0; i++) {  
            
            arr[j] =0;
            j++;
        }
        for(int i=0; i<count1; i++) { 
            
            arr[j] =1;
            j++;
        }
         for(int i=0; i<count2; i++) {
    
           arr[j] =2;
           j++;
}
             
 		for(int i=0; i<arr.length; i++) {

 			{
 				System.out.println(arr[i]);
 			}
	}
	

	}
}
