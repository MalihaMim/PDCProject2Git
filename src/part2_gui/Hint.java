package part2_gui;

import java.io.*;

/**
 * @author Maliha Mim, Student ID: 18034438
 * @author Jennifer Nou, Student ID: 18022509
 */

/**
 * This class will read the file and take the hint for that question, returning a string
 * @author malih
 */
public class Hint extends Lifeline
{
    /**
     * Overridden method from Lifeline class 
     */
    @Override
    public void use_lifeline() 
    {
        super.decrease_lifeline();
    }
    
    /**
     * This method will return a String that holds the hint for a specified question 
     * @param q_num will hold the question number
     * @param file will hold the file from which it is being taken
     * @return
     * @throws IOException 
     */
    public String getAHint(int q_num, File file) throws IOException 
    {
        Question q = new Question();
        Lifeline hint = new Hint();
        hint.decrease_lifeline();
        return q.getHint(q_num,file);
    }
}
    

