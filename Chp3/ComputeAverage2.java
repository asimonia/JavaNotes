public class ComputeAverage2 {

	public static void main(String[] args) {
		String str;		// user's input
		double number;	// input converted into a number
		double total;	// total of all numbers
		double avg;		// average of the numbers
		int count;		// number of numbers entered
		total = 0;
		count = 0;
		System.out.println("Enter your numbers, press return to end.");
		while (true) {
			System.out.print("> ");
			str = TextIO.getln();
			if (str.equals("")) {
				break;	// Exit the loop, since the input line was blank.
			}
			try {
				number = Double.parseDouble(str);
				// If an error occurs, skip both lines
				total = total + number;
				count = count + 1;
			}
			catch (NumberFormatException e) {
				System.out.println("Not a legal number!  Try again.");
			}
		}
		avg = total / count;
		System.out.printf("The average of %d numbers is %1.6g%n", count, avg);
	}

}