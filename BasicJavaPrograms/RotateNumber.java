package BasicJavaPrograms;

public class RotateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n= 562984;
		int k = 2;
		
		int temp = n;
		
		int count =0;
		
		while(temp>0) {
			temp = temp/10;
			count++;
		}
		
		k = k % count;
		if(k<0) {
			k = k +count;
		}
		int div = 1;
		int mul = 1;
		
		for(int i=1; i<=count; i ++) {
			
			//if need to rotate by 2 divisor will be 2,  multiplier
			if(i<=k) {
				div = div*10;
			}  else
			{
				mul = mul*10;
			}
			
		}
		
		int q= n/div;
		int r = n % div;
		int z = r * mul + q;
		System.out.println(z);
	}

}
