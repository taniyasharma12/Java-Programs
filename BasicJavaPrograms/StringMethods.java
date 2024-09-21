package BasicJavaPrograms;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "mynameistaniya hello hello hello";
		
		String str1= "hey";
		
		String s1 = "Hello";
		
		String s2 = "Hi";
		
		String s3 = " hey how are you    ";
		
		int num = 12345;
		
		
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.substring(4));
		System.out.println(str.substring(5, 8)); //8 is exclusive
		System.out.println(str.concat(str1));
		System.out.println(str.indexOf("hello"));
		System.out.println(str.indexOf("hello",16));
		System.out.println(str.lastIndexOf("hello"));
		System.out.println(str.equals(str1));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s3.trim());
		System.out.println(s1.replace('e', 't'));
		System.out.println(s3.contains("how"));
		System.out.println(s1.toCharArray());
		System.out.println(s1.startsWith(s3));
		System.out.println(s3.replaceAll("hey", "xyzzz"));
		System.out.println(s3.split(" "));
		System.out.println(str.endsWith("hello"));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(String.valueOf(num));

//format getBytes, getChar, intern, isEmpty, join, 
		
	}

}
