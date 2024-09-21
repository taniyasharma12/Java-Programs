package BasicJavaPrograms;

public class SumMultiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n =23;
		int sum = 0;

        for(int i=1; i<=n; i++){
            if(i%3==0 || i%5==0 || i%7==0){
                sum = sum + i;
            }

        }
       System.out.println(sum);
    }

	}


