package NewPrograms;

public class P34_StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sc = new StringBuilder("Hello");
		System.out.println(sc);
		
		sc.setCharAt(0, 'D');
		System.out.println(sc);
        sc.insert(0, 'u');
		System.out.println(sc);

	}
}
