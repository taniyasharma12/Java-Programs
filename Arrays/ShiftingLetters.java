package Arrays;

public class ShiftingLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s =  "abc";
		int [][] shifts = new int[3][3];
		
		shifts[0][1]=0;
		shifts[0][2]=1;
		shifts[0][3]=0;
		shifts[1][0]=1;
		shifts[1][1]=2;
		shifts[1][2]=1;
		shifts[2][0]=0;
		shifts[2][1]=2;
		shifts[2][2]=1;
		
		
		System.out.println(shiftingLetters(s, shifts));

	}
	
	
	
public static  String shiftingLetters(String s, int[][] shifts) {
		
	int count [] = new int[s.length() +1];
	
	for(int i=0; i<shifts[i].length-1;i++) {  // 2,3, 1
		
		int start = shifts[i][0];
		int end = shifts[i][1];
		int dir  = shifts[i][2];
		
		if(dir==1) {
			
			count[start]++;
			count[end+1]--;	
		}
		
		else {
			count[start]--;
			count[end+1]++;	
		}
	}
	
	for (int i = 1; i <= s.length(); i++) {
        count[i] += count[i - 1];
    }
	char[] charArray = s.toCharArray();
    for (int i = 0; i < s.length(); i++) {
        int shiftedIndex = (charArray[i] - 'a' + count[i]) % 26;
        if (shiftedIndex < 0) {
            shiftedIndex += 26;
        }
        charArray[i] = (char) ('a' + shiftedIndex);
    }

    return new String(charArray);
    
}
}

