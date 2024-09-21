package BasicJavaPrograms;

public class PrintNumbersNto1 {

	public static void printnto1(int n, int i) {

        if (n < 1) {
            return;
        }

        System.out.println(n);

        printnto1(n-1, i);

    }

    public static void printn21(int n) {

        if (n == 0) {
            return;
        }

        System.out.println(n);

        printn21(n-1);

    }

    public static void main(String[] args) {

        int n = 10;

        int i = 1;

        printn21(n);
        printnto1(n, i);

    }
}

