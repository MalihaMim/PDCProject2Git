package part2_gui;

import java.io.*;
import java.util.*;
/**
 * @author Jennifer Nou, Student ID: 18022509
 * @author Maliha Mim, Student ID: 18034438
 * 
 * This class will be used to read the output of the starting screen, rules and ready to play prompt 
 * in the console.
 */
public class Display {
    /**
     * This reads in the title screen text file before the main game is executed 
     * @throws FileNotFoundException
     * @throws IOException 
     */ 
   public void titleScreen() throws FileNotFoundException, IOException {
        BufferedReader title = new BufferedReader(new FileReader("title_screen.txt"));
        String line;
        while((line = title.readLine()) != null) // While there is text in the line
        {
            System.out.println(line); // Print out the text line 
        }
        title.close();
    }
    /**
     * This reads in the rules text file before the main game is executed 
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void Rules() throws FileNotFoundException, IOException {
        BufferedReader rules = new BufferedReader(new FileReader("rules.txt"));
        String line;
        while((line = rules.readLine()) != null)
        {
            System.out.println(line);
        }
        rules.close();
    }
    /**
     * This reads in the Play text file before main game is executed 
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void readyPlay() throws FileNotFoundException, IOException {
        BufferedReader play = new BufferedReader(new FileReader("ready_play.txt"));
        String line;
        while((line = play.readLine()) != null)
        {
            System.out.println(line);
        }
        play.close();
    }
    /**
     * This will execute the screen display in order
     * @return returns a boolean status for playing_status 
     * @throws IOException 
     */
    public boolean startGame() throws IOException {
        boolean playing_status = false; //holds play status, yes or no
        boolean play_game = true; //this will continue loop until set to false upon a condition (represents the game running)
        
        titleScreen(); //Run the title screen first
        
        Rules(); // Displays the rules
        Scanner scan = new Scanner(System.in); //PRESS Y TO CONTINUE
        String continue_input = scan.nextLine();
        
        // While loop for READY TO PLAY:
        while(play_game) { // While game is running (true)
            if("Y".equalsIgnoreCase(continue_input)) { // IF USER CLICKED Y IN RULES SECTION...
                readyPlay(); // RUN READYPLAY, ONCE USER SAYS YES TO RULES
                continue_input = scan.nextLine();
                
                // Check input if it's 'Y', 'X' or 'N'
                while(!("Y".equalsIgnoreCase(continue_input)||"N".equalsIgnoreCase(continue_input)||
                        "X".equalsIgnoreCase(continue_input))) {
                    System.out.println("Please enter the correct statement");
                    continue_input = scan.nextLine();
                }
                // If 'Y' has been entered, go here
                if("Y".equalsIgnoreCase(continue_input)) {
                    playing_status = true; //this will be returned in main
                    play_game = false; //this variable is to control the loop
                }
                // If 'N' has been entered, go here
                else if("N".equalsIgnoreCase(continue_input)) {
                    Rules(); //they say no, you go back to rules
                    continue_input = scan.nextLine();
                    playing_status = true;
                }
                // If 'X' has been entered, go here
                else if("X".equalsIgnoreCase(continue_input)) {
                    playing_status = false;
                    play_game = false; // break loop 
                }
            }
            // If user enters empty string...
            else if("".equalsIgnoreCase(continue_input)) 
            { 
                Rules();
                System.out.println("PLEASE ENTER THE CORRECT STATEMENT!: ");
                continue_input = scan.nextLine();
            }
            else { // Go back to the rules section if wrong input is entered
                System.out.println("Wrong input entered! Please only enter 'Y' "
                        + "to continue");
                continue_input = scan.nextLine();
            }
        }
        return playing_status;
    } 
}
