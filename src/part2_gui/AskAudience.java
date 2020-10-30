package part2_gui;
import java.util.*;

/**
 * @author Maliha Mim, Student ID: 18034438
 * @author Jennifer Nou, Student ID: 18022509
 */

/*
 * This class will extend the Lifeline class and randomly picks a random option 50 times using the Options enum class.
 * Based on the random numbers, it will tally up how many times it got each option and display to user
*/
public class AskAudience extends Lifeline 
{
    Random rand = new Random();
    int guess;
    int count_a = 0; // Counts how many time 'A' was chosen
    int count_b = 0; // Counts how many time 'B' was chosen
    int count_c = 0; // Counts how many time 'C' was chosen
    int count_d = 0; // Counts how many time 'D' was chosen
    
    /**
     * This method is for the lifeline; Asking the Audience. It will randomly 
     * generate how many times each option has been chosen. It will then 
     * display the total count for
     * each option. 
     * 
     * @return Options type value
     */
    public Options useAudience() 
    {
        for(int audience = 0; audience < 50; audience++) { // Audience has been set to 50 people
            guess = rand.nextInt(Options.values().length); // Randomly picks an option 
            if(null != Options.values()[guess]) switch (Options.values()[guess]) { // Switch starts
                case A:
                    count_a++; // If A has been chosen, add to the counter
                    break;
                case B:
                    count_b++; // If B has been chosen, add to the counter
                    break;
                case C:
                    count_c++; // If C has been chosen, add to the counter
                    break;
                case D:
                    count_d++; // If D has been chosen, add to the counter
                    break;
                default:
                    break;
            }
        }
        System.out.println("A: " + count_a + " B: " + count_b + " C: " 
                    + count_c + " D: " + count_d);
        return Options.values()[guess];
    }
  
    /*
     * This will be an override of the parent class method use_lifeline:
    */
    @Override
    public void use_lifeline() 
    {
        // What do we put here?
        super.decrease_lifeline();
    }
}
