// lesson 5.2 - Decisions
// lesson6/chevalier_de_mere

import java.util.Random;
public class DiceGame {

    Random generator;
    
    public DiceGame()
    {   
        generator = new Random(45);
    }
    
    /** 
     * Throw a die four times and bet on at least one 6. 
     * @return true if the chevalier wins. 
     */
    public boolean game1()
    {
		boolean heWon = false;
    	for(int i = 0; i < 4; i++) {
    		if (generator.nextInt(6) + 1== 6) {
    			heWon = true;
    		}
    	}
    	
    	return heWon;
        // YOUR CODE HERE
        // Use the instance variable generator to simulate 
        // 4 die rolls. 
        // Return true if the chevalier wins (at least one is a 6).
    }
    
    /**
     * Throw two dice 24 times and bet on at least one double-six.
     * @return true if the chevalier wins. 
     */
    public boolean game2()
    {   
		boolean heWon = false;
    	for(int i = 0; i < 24; i++) {
    		int firstRoll = generator.nextInt(6) + 1;
    		int secondRoll = generator.nextInt(6) + 1;
    		if (firstRoll == 6 && secondRoll == 6) heWon = true;
    	}
    	
    	return heWon;
        // YOUR CODE HERE 
        // Use the instance variable generator to simulate 
        // 24 rolls of a pair of dice.
        // Return true if at least one pair is both 6s. 
    }
    
    /**
     * Calculates the score of a round of this game.
     * x the first roll
     * y the second roll
     * @return a score of 1 if exactly one is 3, a score of 0 otherwise
     */
    public int exactlyOneThree(int x, int y)
    {
        if (x != y && (x == 3 || y == 3)) // TODO: if exactly one of x and y is 3
        {
            return 1;
        }
        else
        {
            return 0;
        }

    }
}
