package part2_gui;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;


/**
 * @author Maliha Mim, Student ID: 18034438
 * @author Jennifer Nou, Student ID: 18022509
 */

/**
 * 
 * This class will keep actual answer aside, randomly choose one option from incorrect ones, and then take answer option and the randomly
 * chosen option and shuffle them around and return char array
 */
public class FiftyFifty extends Lifeline
{
    /**
     * Overridden method from parent class Lifeline
     */
    @Override
    public void use_lifeline() 
    {
        super.decrease_lifeline();
    }
    
   
    /**
     * 
     * @param q_num will hold the question number
     * @param file will hold the file name of type File
     * This method will return a Character array holding two option letters, one being the answer, and another being random
     * @return
     * @throws IOException 
     */
    public Character[] use_fiftyfifty(int q_num, File file) throws IOException 
    {
        Question q = new Question();
        String option1 = ""; //Answer is stored here!
        String option2 = ""; //Anything else, BESIDES the answer
        char answer_token1 = 0; //Keep 1st token here
        char answer_token2 = 0; //Keep 2nd token here
        Character[] two_options = new Character[2]; //an array of the 2 tokens
        
        //Put all the options in one array:
        ArrayList<String> array_of_answers = new ArrayList<String>(); //Answer strings
        array_of_answers.add(q.getA(q_num, file));
        array_of_answers.add(q.getB(q_num, file));
        array_of_answers.add(q.getC(q_num, file));
        array_of_answers.add(q.getD(q_num, file));
        
        //print out the options:
        /**for(int i = 0 ; i < array_of_answers.size(); i++) 
        {
            System.out.println(array_of_answers.get(i) + "\n");
        }**/
        
        //Check if any element in answer array matches the actual answer:
        for(int i = 0; i < array_of_answers.size(); i++)
        {
            if(array_of_answers.get(i).charAt(0) == q.getAnswer(q_num, file).charAt(10))
            {
                option1 = array_of_answers.get(i); //store it in first option variable
                answer_token1 = option1.charAt(0); //get token for answer
                array_of_answers.remove(i); //remove that option from the answer array
                break;
            }
        }
        
        
        Random rand = new Random(); //choose a random number 0 to 2
        int random_choice = rand.nextInt(3); //now we are left with 3 options
        
        //go through array and match the random number with the corresponsing index and retrieve element:
        for(int i = 0; i < array_of_answers.size(); i++)
        {
            if(i == random_choice)
            {
                option2 = array_of_answers.get(i); //store in option 2
                answer_token2 = option2.charAt(0); //save token
            }
        }
        
        //update the token array:
        two_options[0] = answer_token1;
        two_options[1] = answer_token2;
        List<Character> options_left = Arrays.asList(two_options);
        Collections.shuffle(options_left);
        Character[] myShuffledArray = (Character[]) options_left.toArray();
        
        return two_options; //return the array with the 2 answers to display
    }
    
}
