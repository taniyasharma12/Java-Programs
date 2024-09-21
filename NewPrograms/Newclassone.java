package NewPrograms;

public class Newclassone {

	public static boolean isPrime(int n) {
        boolean b = true;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                b = false;
            }
        }
        return b;
    }

    public static void main(String[] args) {

        int n = 25;

        int incrementedNum = n;
        int decrementedNum = n;

        if (isPrime(n)) {
            System.out.println(n);
        }

        while (true) {

            incrementedNum = incrementedNum++;
            decrementedNum = decrementedNum--;

            if (isPrime(incrementedNum)) {
                System.out.println(incrementedNum);
                break;
            } else if (isPrime(decrementedNum)) {
                System.out.println(decrementedNum);
                break;
            }

            incrementedNum++;
            decrementedNum--;
        }

    }

}
