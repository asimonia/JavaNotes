/*
 * Program performs math computations and displays the results
*/

public class TimedComputation {

	public static void main(String[] args) {
		long startTime;
		long endTime;
		double time;

		startTime = System.currentTimeMillis();

		double width, height, hypoteneuse;
		width = 42.0;
		height = 17.0;
		hypoteneuse = Math.sqrt( width * width + height * height );
		System.out.print("A triangle with sides 42 and 17 has hypoteneuse ");
		System.out.println(hypoteneuse);

		System.out.print("\nHere is a random number: ");
		System.out.println( Math.random() );
		System.out.print("The value of Math.PI is ");
		System.out.println( Math.PI );
		endTime = System.currentTimeMillis();
		time = (endTime - startTime) / 1000.0;

		System.out.print("\nRun time in seconds was: ");
		System.out.println(time);

	}
}