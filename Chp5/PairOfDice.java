public class PairOfDice {

    public int die1;   // Number showing on the first die.
    public int die2;   // Number showing on the second die.
    
    public PairOfDice() {
            // Constructor.  Rolls the dice, so that they initially
            // show some random values.
        roll();  // Call the roll() method to roll the dice.
    }
    
    public PairOfDice(int val1, int val2) {
            // Constructor.  Creates a pair of dice that
            // are initially showing the values val1 and val2.
        die1 = val1;  // Assign specified values 
        die2 = val2;  //            to the instance variables.
    }

    public void roll() {
            // Roll the dice by setting each of the dice to be
            // a random number between 1 and 6.
        die1 = (int)(Math.random()*6) + 1;
        die2 = (int)(Math.random()*6) + 1;
    }
    /**
     * Return a String representation of a pair of dice, where die1
     * and die2 are instance variables containing the numbers that are
     * showing on the two dice.
     */
    public String toString() {
       if (die1 == die2)
          return "double " + die1;
       else
          return die1 + " and " + die2;
    }

} // end class PairOfDice