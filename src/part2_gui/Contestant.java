
package part2_gui;
import java.util.*;

/**
 * @author Maliha Mim, Student ID: 18034438
 * @author Jennifer Nou, Student ID: 18022509
 */

/*
 * This class will store the Constestant's details, along with name, how much they have in their bank as they play, the level they
 * acheived, and an array of values of the amount they may obtain.
*/
public class Contestant 
{
    private String name; //player's name
    private int bank = 0; //bank amount 
    private int level = 0; //current level
    private ArrayList<Integer> values; //100,200,300,500, etc... to 1,000,000
    
    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) 
    {
        this.name = name;
    }

    /**
     * @return the score
     */
    public int getBank()
    {
        return bank;
    }

    /**
     * @param amount the score to set
     */
    public void setBank(int amount) 
    {
        this.bank = amount;
    }

    /**
     * @return the level_counter
     */
    public int getLevel() 
    {
        return level;
    }

    /**
     * @param current_level the level_counter to set
     */
    public void setLevel(int current_level) 
    {
        this.level = current_level;
    }

    /**
     * @return the values
     */
    public ArrayList<Integer> getValues() 
    {
        return values;
    }

    /**
     * @param values the values to set
     */
    public void setValues(ArrayList<Integer> values) 
    {
        this.values = values;
    }
   
    
    //methods:
    //this could be included in MAIN:
    public void LevelUp()
    {
        this.level++;
    }
}
