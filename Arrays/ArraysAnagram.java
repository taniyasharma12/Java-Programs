import java.util.Arrays;

public class ArraysAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "LISTEN";
		String s1 = "SILENT";
		
       int[] farr = new int[126];

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            farr[ch]++;
        }
        System.out.println(Arrays.toString(farr));
      for(int i=0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            farr[ch]--;
        }

        int count = 0;

        for(int i=0; i<farr.length; i++){
            if(farr[i] != 0){
                count = count + Math.abs(farr[i]);
            }
        }

       System.out.println(count);
       

        }
	}


