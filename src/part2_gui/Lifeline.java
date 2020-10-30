package part2_gui;

import java.util.ArrayList;

/**
 * @author Maliha Mim, Student ID: 18034438
 * @author Jennifer Nou, Student ID: 18022509
 */

/**
 * This class will hold the Lifeline attributes, keeping a lifeline count(which will decrease later) and an array that holds the different
 * subclass lifelines (hint, fiftyfifty, askaudience, askfriend)
 * @author malih
 */
public class Lifeline
{
    private int lifeline_count = 4; //There are 4 lifelines, askaudience, askfriend, fiftyfifty, & hint
    private ArrayList<Lifeline> lifelines; //holds the 4 types
     
    /**
     * This will set the Lifelines array
     * @param lifelines 
     */
    public void setLifelines(ArrayList lifelines)
    {
        this.lifelines = lifelines;
    }
    
    /**
     * This will get the arraylist
     * @return ArrayList type holding lifelines
     */
    public ArrayList<Lifeline> getLifelines()
    {
        return lifelines;
    }
    
    //every subclass overriding this method will have a different body:
    public void use_lifeline()
    {
        //STAYS EMPTY TO BE OVERRIDDEN!
    };
    
    
    /**
     * This method will decrease the lifeline count by 1
     */
    public void decrease_lifeline()
    {
        this.lifeline_count--;
    }
}
