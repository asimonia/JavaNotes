public class Exer31 {

	public static void main(String[] args) {

		int die1, die2;
		int rolls;

		rolls = 0;

		do {
			die1 = (int)(Math.random() * 6) + 1;
			die2 = (int)(Math.random() * 6) + 1;
			rolls++;
		} while ( die1 != 1 || die2 != 1);

		System.out.println("It took " + rolls + " rolls to get snake eyes.");

	}
}