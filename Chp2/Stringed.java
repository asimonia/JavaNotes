public class Stringed {

	public static void main(String[] args) {
		String advice;
		advice = "Seize the day";

		System.out.println("The phrase is " + advice.length() + " letters long");

		String s1, s2, s3, s4, s5;
		s1 = "Hello";
		s2 = "Hello";

		System.out.println("Does s1 = s2" + s1.equals(s2));
		System.out.println("Does s1 = s2 with ignored case" + s1.equalsIgnoreCase(s2));
		System.out.println("The char at 3 of s1 is : " + s1.charAt(3));
		System.out.println("To uppercase of s1 : " + s1.toUpperCase());
	}

}