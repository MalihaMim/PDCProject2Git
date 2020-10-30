package part2_gui;
import java.util.*;
import java.io.*;
/**
 * @author Jennifer Nou, Student ID: 18022509
 * @author Maliha Mim, Student ID: 18034438
 * 
 * This class will be used to generate a set of 15 random questions - 5 easy, 5 medium and 5 hard questions
 * each time the main game is running. This class reads in questions from 3x pre-made files, the files is then read where
 * each pre-made file (which is filled with different difficulties of questions) saves 5 random questions into another text
 * file. All of the random questions that has been generated will be written into one text file, which will then be applied 
 * into the main application. 
 */
public class Questionnaire extends Question {
    /** 
     * This method will read through the 'easy' questions text file. From this, the questions will be shuffled
     * using the Collections function. With this, the 5 random questions will then be written into the 
     * Contest Questionnaire text file where it will be ready to use for the main game. 
     * 
     * @param easy_file reads in the easy question text file
     * @param easyList to store the 15 Question objects for the easy questions list
     * @param number_list Stores 15 elements 
     * @param a_question Question object to store in the ArrayList
     * 
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void getEasyQuestions() throws FileNotFoundException, IOException {
        File easy_file = new File("easy.txt"); // Create a File object that reads in the hard text file 
        // Setting up Arraylists to store the questions in
        ArrayList<Question> easyList = new ArrayList<Question>(); // Store 15 Question objects
        List<Integer> number_list = new ArrayList<Integer>(); // Array list with 15 elements, numbers 1 to 15    
        
        try {
            FileWriter myWriter = new FileWriter("ContestQuestions.txt"); //Write onto ContestQuestions.txt
           
            //Add to ArrayList: Numbers 1 to 15
            for(int i = 1; i <= 15; i++) {
               number_list.add(i); // Add the numbers to the ArrayList
            }
            
            Collections.shuffle(number_list); //Shuffle the values in random order
            
            // Run the loop 5 times and get the first 5 elements of the ArrayList and their corrosponding attributes
            for(int i = 0; i < 5; i++) {
                Question a_question = new Question(); //create a Question object to store in ArrayList later
                a_question.getQuestion(number_list.get(i),easy_file); // Get question from Questions class
                a_question.getA(number_list.get(i),easy_file); // Get option A
                a_question.getB(number_list.get(i),easy_file); // Get option B
                a_question.getC(number_list.get(i),easy_file); // Get option C
                a_question.getD(number_list.get(i),easy_file); // Get option D
                a_question.getHint(number_list.get(i),easy_file); // Get Hint from Questions class
                a_question.getAnswer(number_list.get(i),easy_file); // Get Answer from Questions class
                
                easyList.add(a_question); //Add completed Question object to the ArrayList
            }
            
            // Writing onto the file (ContestQuestions.txt), from the ArrayList:
            for(int counter = 0; counter < 5; counter++) // From index 0 to 4:
            {
                // Write Question, options A, B, C, D, Answer and Hint onto file
                myWriter.write(easyList.get(counter).getQ() + "\n");
                myWriter.write(easyList.get(counter).getA()+ "\n"); 
                myWriter.write(easyList.get(counter).getB()+ "\n");
                myWriter.write(easyList.get(counter).getC()+ "\n");
                myWriter.write(easyList.get(counter).getD()+ "\n");
                myWriter.write(easyList.get(counter).getAns()+ "\n");
                myWriter.write(easyList.get(counter).getH()+ "\n");
            }
            myWriter.close(); //Closing writer
        } catch(FileNotFoundException e) {
            System.err.println("Error! File could not be found.");
        }
    }
    /** 
     * This method will read through the 'medium' questions text file. From this, the questions will be shuffled
     * using the Collections function. With this, the 5 random questions will then be written into the 
     * Contest Questionnaire text file where it will be ready to use for the main game. 
     * 
     * @param medium_file reads in the medium question text file
     * @param mediumList to store the 15 Question objects for the medium questions list
     * @param number_list Stores 15 elements 
     * @param a_question Question object to store in the ArrayList
     * 
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void getMediumQuestions() throws FileNotFoundException, IOException {
        File medium_file = new File("medium.txt"); // Create a File object that reads in the medium text file 
        // Setting up Arraylists to store the questions in
        ArrayList<Question> mediumList = new ArrayList<Question>(); // Store 15 Question objects
        List<Integer> number_list = new ArrayList<Integer>(); // Array list with 15 elements, numbers 1 to 15    
        
        try {
            // Create a new file
            FileWriter myWriter = new FileWriter("ContestQuestions.txt",true); 
           
            //Add to ArrayList: Numbers 1 to 15
            for(int i = 1; i <= 15; i++) {
               number_list.add(i); // Add to the ArrayList
            }
            
            Collections.shuffle(number_list); //Shuffle the ArrayList in random order
            
            // Run the loop 5 times and get the first 5 elements of the ArrayList and their corrosponding attributes
            for(int i = 0; i < 5; i++) {
                Question a_question = new Question(); // Create a Question object to store in ArrayList later
                a_question.getQuestion(number_list.get(i),medium_file); // Set question
                a_question.getA(number_list.get(i),medium_file); // Get option A
                a_question.getB(number_list.get(i),medium_file); // Get option B
                a_question.getC(number_list.get(i),medium_file); // Get option C
                a_question.getD(number_list.get(i),medium_file); // Get option D
                a_question.getHint(number_list.get(i),medium_file); // Get Hint from Questions class
                a_question.getAnswer(number_list.get(i),medium_file); // Get Answer from Questions class
                
                mediumList.add(a_question); // Add completed Question object to the ArrayList
            }
            
            //Writing onto the file (ContestQuestions.txt), from the ArrayList:
            for(int counter = 0; counter < 5; counter++) // From  array index 0 to 4:
            {
                // Write Question, options A, B, C, D, Answer and Hint onto file
                myWriter.write(mediumList.get(counter).getQ() + "\n"); 
                myWriter.write(mediumList.get(counter).getA()+ "\n"); 
                myWriter.write(mediumList.get(counter).getB()+ "\n");
                myWriter.write(mediumList.get(counter).getC()+ "\n");
                myWriter.write(mediumList.get(counter).getD()+ "\n");
                myWriter.write(mediumList.get(counter).getAns()+ "\n");
                myWriter.write(mediumList.get(counter).getH()+ "\n");
            }
            myWriter.close(); //Closing writer
        } catch(FileNotFoundException e) {
            System.err.println("Error! File could not be found.");
        }
    }
    /** 
     * This method will read through the 'hard' questions text file. From this, the questions will be shuffled
     * using the Collections function. With the ArrayList now being in a shuffled order, the 5 random questions 
     * will then be written into the Contest Questionnaire text file where it will be ready to use for the main game. 
     * 
     * @param hard_file reads in the hard question text file
     * @param hardList to store the 15 Question objects for the hard questions list
     * @param number_list Stores 15 elements 
     * @param a_question Question object to store in the ArrayList
     * 
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void getHardQuestions() throws FileNotFoundException, IOException {
        File hard_file = new File("hard.txt"); // Create a File object that reads in the hard text file 
        // Setting up Arraylists to store the questions in
        ArrayList<Question> hardList = new ArrayList<Question>(); // Store 15 Question objects for storing the 15 hard questions
        List<Integer> number_list = new ArrayList<Integer>(); // Array list that will store 15 elements 
        
        try {
            FileWriter myWriter = new FileWriter("ContestQuestions.txt",true); // Write onto ContestQuestions.txt
           
            // Add to ArrayList: Numbers 1 to 15
            for(int i = 1; i <= 15; i++) {
               number_list.add(i); // Add to ArrayList
            }
            
            Collections.shuffle(number_list); //Shuffle the ArrayList in random order
            
            // Run the loop 5 times and get the first 5 elements of the ArrayList and their corrosponding attributes
            for(int i = 0; i < 5; i++) {
                Question a_question = new Question(); // Create a Question object to store in ArrayList later
                a_question.getQuestion(number_list.get(i),hard_file); // Get question
                a_question.getA(number_list.get(i),hard_file); //Get option A
                a_question.getB(number_list.get(i),hard_file); //Get option B
                a_question.getC(number_list.get(i),hard_file); //Get option C
                a_question.getD(number_list.get(i),hard_file); //Get option D
                a_question.getHint(number_list.get(i),hard_file); //Get Hint
                a_question.getAnswer(number_list.get(i),hard_file); //Get Answer
                
                hardList.add(a_question); //Add completed Question object to the ArrayList
            }
            
            // Writing onto the file (ContestQuestions.txt), from the ArrayList:
            for(int counter = 0; counter < 5; counter++) // From index 0 to 4:
            {
                // Write Question, options A, B, C, D, Answer and Hint onto file
                myWriter.write(hardList.get(counter).getQ() + "\n"); 
                myWriter.write(hardList.get(counter).getA()+ "\n"); 
                myWriter.write(hardList.get(counter).getB()+ "\n");
                myWriter.write(hardList.get(counter).getC()+ "\n");
                myWriter.write(hardList.get(counter).getD()+ "\n");
                myWriter.write(hardList.get(counter).getAns()+ "\n");
                myWriter.write(hardList.get(counter).getH()+ "\n");
            }
            myWriter.close(); //Closing writer
        } catch(FileNotFoundException e) {
            System.err.println("Error! File could not be found.");
        }
    }
}