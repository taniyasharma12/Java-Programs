package PatternPrograms;

public class DiamondStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;

		for (int i = 0; i <= n; i++) {

			for (int j = i; j < n; j++) {

				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {

				System.out.print("*");

			}

			for (int j = 0; j < i; j++) {

				System.out.print("*");

			}
			System.out.println();

		}

		for (int i = 0; i <= n; i++) {

			for (int j = 0; j < i; j++) {

				System.out.print(" ");
			}
			for (int j = i; j <= n; j++) {

				System.out.print("*");

			}

			for (int j = i; j < n; j++) {

				System.out.print("*");

			}
			System.out.println();

		}

	}

}
