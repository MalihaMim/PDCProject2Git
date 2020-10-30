package part2_gui;

import java.io.*;
import java.util.*;


/**
 * @author Maliha Mim, Student ID: 18034438
 * @author Jennifer Nou, Student ID: 18022509
 */

/**
 * 
 *This class will have the main function where the game will execute and there will be output to the console, allowing user input
 */
public class MainGame
{
    /**
     * 
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException 
    {
        Display game_displays = new Display();   
        //If startGame() has been set to true, will execute game and carry on to questions, otherwise quit execution!
        if(game_displays.startGame() == false)
        {
            System.out.println("Guess you are NOT playing");
        }
        else
        {
            //Creating a new player:
            Contestant player = new Contestant(); 
            System.out.println("Please enter your name: ");
            Scanner read_name = new Scanner(System.in);
            player.setName(read_name.nextLine());
            
            //Checking if user entered an empty string as name:
            if("".equals(player.getName()))
            {
                player.setName("Player Unknown");
            }
            
            //Setting all player attributes:
            player.setBank(0);
            player.setLevel(0);
            ArrayList<Integer> cash_prizes = new ArrayList<Integer>(Arrays.asList(100,200,300,500,1000,2000,4000,8000,16000,
                    32000,64000,125000,250000,500000,1000000));
            player.setValues(cash_prizes); //CONTESTANT IS COMPLETE
            
            //Starting game:
            System.out.println("\n*****Game has started*****");
            System.out.println("Welcome " + player.getName() + "!\n\n");
            File contest_questions = new File("ContestQuestions.txt"); //create a File object
            Questionnaire questionnaire = new Questionnaire(); //create a new Questionnaire object
            
            //get the 15 random questions and store in Questionnaire:
            questionnaire.getEasyQuestions(); 
            questionnaire.getMediumQuestions();
            questionnaire.getHardQuestions(); //QUESTIONNAIRE IS COMPLETE
            
            //Setting up the 4 Lifeline child classes:
            Hint hint = new Hint();
            FiftyFifty fiftyfifty = new FiftyFifty();
            AskAudience audience = new AskAudience();
            AskFriend friend = new AskFriend();
            
            //Storing these classes in the lifelines array (size 4):
            ArrayList<Lifeline> lifelines = new ArrayList<Lifeline>(); //from this array we can remove every type of lifeline until the user has none left
            lifelines.add(hint);
            lifelines.add(fiftyfifty);
            lifelines.add(audience);
            lifelines.add(friend);
        
            
            Scanner read = new Scanner(System.in);
            char user_answer; //stores user's answer as a letter
            int question_counter = 1; //Question starts from 1:
            Question current_question = new Question(); //create a new Question object to manipulate 
            
            //Going through Questionnaire (questions 1 to 15):
            first: //(outer loop)
            while(question_counter <= 15)
            {
                //Displaying current question on console:
                System.out.println("Now playing for...$" + cash_prizes.get(player.getLevel()));
                System.out.println(current_question.getQuestion(question_counter, contest_questions)); //
                System.out.println(current_question.getA(question_counter, contest_questions));
                System.out.println(current_question.getB(question_counter, contest_questions));
                System.out.println(current_question.getC(question_counter, contest_questions));
                System.out.println(current_question.getD(question_counter, contest_questions));
                
                //Keep asking if user wants lifeline, as long as lifeline array is not empty:
                while(lifelines.size() > 0)
                {
                    System.out.println("\nWould you like to use a lifeline? [Y/N] ");
                    Scanner scan = new Scanner(System.in);
                    String input = "";
                    input = scan.nextLine();
                    int choice = 0;
                    int current_options = lifelines.size()-1;
                    
                    //User entered 'Y' for using Lifeline (Yes):
                    if("Y".equalsIgnoreCase(input))
                    {
                        while(current_options != -1) //while lifeline array is not empty
                        {
                            System.out.println("Enter " + current_options + " for " + lifelines.get(current_options).getClass().getName().replaceAll("gameapp.", ""));
                            current_options--; //the arraylist will be read backwards
                        }
                        
                        try
                        {
                                choice = scan.nextInt(); //enter the choice of lifeline type

                                //While the choice chosen is NOT between 0 and the current size of the lifelines array
                                while(!(choice >= 0 && choice < lifelines.size()))
                                {
                                    System.out.println("Please enter a correct input!!!!"); //keep asking for correct input!
                                    choice = scan.nextInt();
                                }

                                //HINT LIFELINE:
                                if("Hint".equals(lifelines.get(choice).getClass().getName().replaceAll("gameapp.", "")))
                                {
                                    String hinty = hint.getAHint(question_counter,contest_questions);
                                    hint.use_lifeline();
                                    System.out.println(hinty);
                                    lifelines.remove(choice); //remove the lifeline from the array
                                    break; //break out of loop once a lifeline has been used
                                }

                                //FIFTY FIFTY LIFELINE:
                                else if("FiftyFifty".equals(lifelines.get(choice).getClass().getName().replaceAll("gameapp.", "")))
                                {
                                    String option1 = "";
                                    String option2 = "";
                                    Character[] options_left = fiftyfifty.use_fiftyfifty(question_counter, contest_questions);
                                    fiftyfifty.use_lifeline(); //decreasing lifeline count

                                    if(null != options_left[0])                            
                                        //option 1:
                                        switch (options_left[0]) 
                                        {
                                            case 'A':
                                                option1 = current_question.getA(question_counter, contest_questions);
                                                break;
                                            case 'B':
                                                option1 = current_question.getB(question_counter, contest_questions);
                                                break;
                                            case 'C':
                                                option1 = current_question.getC(question_counter, contest_questions);
                                                break;
                                            case 'D':
                                                option1 = current_question.getD(question_counter, contest_questions);
                                                break;
                                            default:
                                                break;
                                        }

                                        if(null != options_left[1])
                                        //option2:
                                        switch (options_left[1]) 
                                        {
                                            case 'A':
                                                option2 = current_question.getA(question_counter, contest_questions);
                                                break;
                                            case 'B':
                                                option2 = current_question.getB(question_counter, contest_questions);
                                                break;
                                            case 'C':
                                                option2 = current_question.getC(question_counter, contest_questions);
                                                break;
                                            case 'D':
                                                option2 = current_question.getD(question_counter, contest_questions);
                                                break;
                                            default:
                                                break;
                                        }

                                        System.out.println("Now your options are: ");
                                        System.out.println(option1);
                                        System.out.println(option2);
                                        fiftyfifty.use_lifeline();
                                        lifelines.remove(choice);
                                        break;
                                }

                                //ASK AUDIENCE LIFELINE:
                                else if("AskAudience".equals(lifelines.get(choice).getClass().getName().replaceAll("gameapp.", "")))
                                {
                                    System.out.println("The audience results are in...");
                                    System.out.println("Here's how many times each option was picked:");
                                    audience.useAudience(); 
                                    audience.use_lifeline();
                                    lifelines.remove(choice);
                                    break;
                                }

                                //ASK A FRIEND OR FAMILY MEMBER LIFELINE:
                                else if("AskFriend".equals(lifelines.get(choice).getClass().getName().replaceAll("gameapp.", "")))
                                {
                                    System.out.println(friend.toString());
                                    friend.use_lifeline();
                                    lifelines.remove(choice);
                                    break;
                                }
                            } //end of Try block
                        
                        catch(InputMismatchException e) //when anything else but an integer is entered...throw an exception error
                        {
                            System.out.println("Please enter correct input!");
                        }
                    }
                    
                    //User entered 'N' (declining to use a Lifeline):
                    else if("N".equalsIgnoreCase(input))
                    {
                        System.out.println("Ok...");
                        break;
                    }
                    
                    //User entered something wrong, they cannot use a lifeline on that question anymore:
                    else
                    {
                        System.out.println("Sorry you missed your chance.");
                        break;
                    }
                } //while loop ends here
                
                //Once lifelines array is empty, it will keep reminding the user that they have no more lifelines for the remaining questions:
                if(lifelines.isEmpty() == true)
                {
                    System.out.println("Sorry you've run out of lifelines!");
                }
                
                //Once asking if they want to user a lifeline, player will be prompted for answer:
                System.out.println("What is your answer? ");
                user_answer = read.nextLine().charAt(0);
                Character user_upper = Character.toUpperCase(user_answer);
               
                
                //Checking which input user has entered and if it is correct, incorrect, or wrong input:
                boolean check_input = true;
                second: //inner loop
                while(check_input)
                {
                    //check if user entered a,b,c, or d:
                    if(((user_upper.equals('A') == true)|| (user_upper.equals('B') == true)|| (user_upper.equals('C') == true) || (user_upper.equals('D')) == true))
                    {
                        //program will check if user answer matches actual answer
                        if(user_upper == current_question.getAnswer(question_counter, contest_questions).charAt(10))
                        {
                            System.out.println("\nCorrect!\n");
                            player.LevelUp();
                            player.setBank(player.getValues().get(player.getLevel()-1));
                            System.out.println("Question amount played: $" + player.getBank());
                            System.out.println("Level achieved: " + player.getLevel() + "\n");
                            question_counter++;
                            
                            //Right before the First Safe Haven, print out a message:
                            if(player.getLevel() <= 4)
                            {
                                
                                if(player.getLevel() == 4)
                                {
                                    System.out.println("You are one question away from your FIRST safe haven!");
                                }
                                player.setBank(0);
                            }
                            
                            //First Safe Haven earns player $1000, so if they lose next question, they get to walk away with $1000:
                            else if(player.getLevel() >= 5 && player.getLevel() < 10)
                            {
                                //Remind player they have reached First Safe Haven:
                                if(player.getLevel() == 5)
                                {
                                    System.out.println("Welcome to your FIRST safe haven! You will keep your $1000 if you lose the next question!");
                                }
                                player.setBank(1000); //Bank amount will REMAIN $1000 throughout Level 5 to 9
                            }
                            
                            //Second Safe Haven earns player $32000, so if they lose next question, they get to walk away with $32000:
                            else if(player.getLevel() >= 10 && player.getLevel() < 15)
                            {
                                //Remind player they have reached Second Safe Haven:
                                if(player.getLevel() == 10)
                                {
                                    System.out.println("Welcome to the SECOND safe haven! You will keep your $32,000 if you lose the next question!");
                                }
                                player.setBank(32000); //Bank amount will REMAIN $32000 throughout Level 10 to 14
                            }
                            
                            //Player wins 1 million dollars here:
                            else if(player.getLevel() == 15)
                            {
                                System.out.println("CONGRATULATIONS " + player.getName() +  " YOU ARE NOW A MILLIONAIRE!!!!!");
                                player.setBank(1000000);        
                            }      
                        }
                        
                        //If user input is wrong, they lose game and the game will exit:
                        else if(user_upper != current_question.getAnswer(question_counter, contest_questions).charAt(10))
                        {
                            System.out.println("You have lost the game!");
                            System.out.println("You are going home with: $" + player.getBank() + "!!!");
                            break first; //breaking first, outermost while loop!
                        }
                        
                        check_input = false;//since it is false, it will break after one iteration
                    }
                    
                    else //THIS WILL RUN when the if statement is unsatisfied...while loop will keep asking for input
                    {
                        System.out.println("Incorrect input, please choose a letter from the options on the screen!"); 
                        System.out.println("What is your answer? ");
                        user_answer = read.nextLine().charAt(0);
                        user_upper = Character.toUpperCase(user_answer);
                    }
                }   
            }  
        }
    }
}
