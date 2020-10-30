package part2_gui;
import java.util.*;

/**
 * @author Maliha Mim, Student ID: 18034438
 * @author Jennifer Nou, Student ID: 18022509
 */

/*
 * This class will go through the enum Options class and chooses a random option and returns it. This class will make it seem like a
 * friend chose that answer, and the player can choose to listen or not listen to their friend...
*/
public class AskFriend extends Lifeline {
    Random rand = new Random();
    private int guess; // Random enum option 
    
   @Override
    public void use_lifeline() 
    {
        super.decrease_lifeline(); //decrese lifeline count
    }
    /**
     * This uses the Options enum class to generate a random option every time this
     * has been run.
     * 
     
     * @return Options type variable
     */
    public Options useFriend() 
    {
        guess = rand.nextInt(Options.values().length);
        return Options.values()[guess]; // Returns a random enum option 
    }
    
    /*
     * toString method will print out what the Friend thinks the answer should be, displaying the randomly chosen option
    */
    @Override
    public String toString() { // toString to print out the lifeline 
        return "Your friend thinks '" + useFriend() + "' is the answer...";
    }
    /**
     * @return the guess
     */
    public int getGuess() {
        return guess;
    }

    /**
     * @param guess the guess to set
     */
    public void setGuess(int guess) {
        this.guess = guess;
    }
}
