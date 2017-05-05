public class RollDice {

	public static void main(String[] args) {

		PairOfDice dice;
		int rollCount;
		

		dice = new PairOfDice();
		rollCount = 0;
		
		do {
			dice.roll();
			System.out.println("You rolled a " + dice );
			rollCount++;
			System.out.println("Roll count is " + rollCount + "\n");
		} while (dice.getTotal() != 2);
	}

}