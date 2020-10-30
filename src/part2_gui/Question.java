package part2_gui;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;


/**
 * @author Maliha Mim, Student ID: 18034438
 * @author Jennifer Nou, Student ID: 18022509
 */

public class Question
{
    //Attributes of a Question:
    private String question;
    private String a;
    private String b;
    private String c;
    private String d;
    private String hint;
    private String answer;
    
   
    public static BufferedReader br;
   
    
    /**
     * 
     * @return String holding the Question
     */
    public String getQ()
    {
        return question;
    }
    
    /**
     *
     * @return String holding the option A
     */
    public String getA()
    {
        return a;
    }
    
    /**
     *
     * @return String holding the option B
     */
    public String getB()
    {
        return b;
    }
    
    /**
     *
     * @return String holding the option C
     */
    public String getC()
    {
        return c;
    }
     
     /**
     *
     * @return String holding the option D
     */
    public String getD()
    {
        return d;
    }
    
     /**
     *
     * @return String holding the Hint for that Question
     */
    public String getH()
    {
        return hint;
    } 
     
     /**
     *
     * @return String holding the Answer
     */
    public String getAns()
    {
        return answer;
    }
    
     /**
      * enter the question number that you want in the function as parameter, and the File, and it will retrieve the question string
     * @return the question as a String type
     */
    
    public String getQuestion(int question_num,File file_name) throws FileNotFoundException, IOException
    {
        br = new BufferedReader(new FileReader(file_name)); //Should be the Questionnaire file
        String q = ""; //String variable to store the question we want
        int line_num = (question_num-1)*7; //gets the line number that all the questions are on
        q = Files.readAllLines(Paths.get(file_name.getName())).get(line_num); //reads at specific line number
        this.question = q; //(SETTER)
        return question; //return String
    }

     /**
      * enter the question number that you want in the function as parameter, and the File, and it will retrieve the option A string
     * @return the option A as a String type
     */
    public String getA(int question_num,File file_name) throws IOException 
    {
        br = new BufferedReader(new FileReader(file_name));
        String a = ""; 
        int line_num = ((question_num-1)*7)+1;
        a = Files.readAllLines(Paths.get(file_name.getName())).get(line_num);
        this.a = a; //(SETTER)
        return a; 
    }

   /**
      * enter the question number that you want in the function as parameter, and the File, and it will retrieve the option B string
     * @return the option B as a String type
     */ 
   public String getB(int question_num,File file_name) throws IOException 
    {
        br = new BufferedReader(new FileReader(file_name)); 
        String b = ""; 
        int line_num = ((question_num-1)*7)+2;
        b = Files.readAllLines(Paths.get(file_name.getName())).get(line_num);
        this.b = b; //(SETTER)
        return b; 
    }

    /**
      * enter the question number that you want in the function as parameter, and the File, and it will retrieve the option C string
     * @return the option C as a String type
     */
    public String getC(int question_num,File file_name) throws IOException {
        br = new BufferedReader(new FileReader(file_name));
        String c = ""; 
        int line_num = ((question_num-1)*7)+3;
        c = Files.readAllLines(Paths.get(file_name.getName())).get(line_num);
        this.c = c; //(SETTER)
        return c; 
    }

    /**
      * enter the question number that you want in the function as parameter, and the File, and it will retrieve the option D string
     * @return the option D as a String type
     */
    public String getD(int question_num,File file_name) throws FileNotFoundException, IOException {
        br = new BufferedReader(new FileReader(file_name));
        String read_d = ""; 
        int line_num; 
        line_num  = ((question_num - 1) * 7) + 4;
        read_d = Files.readAllLines(Paths.get(file_name.getName())).get(line_num);
        this.d = read_d; //(SETTER)
        return d;
    }

    /**
      * enter the question number that you want in the function as parameter, and the File, and it will retrieve the Hint string
     * @return the hint as a String type
     */
    public String getHint(int question_num, File file_name) throws IOException 
    {
        br = new BufferedReader(new FileReader(file_name));
        String hint = ""; 
        int line_num = ((question_num-1)*7)+6;
        hint = Files.readAllLines(Paths.get(file_name.getName())).get(line_num);
        this.hint = hint; //(SETTER)
        return hint;
    }

    /**
      * enter the question number that you want in the function as parameter, and the File, and it will retrieve the Answer string
     * @return the answer as a String type
     */
    public String getAnswer(int question_num,File file_name) throws IOException 
    {
        br = new BufferedReader(new FileReader(file_name));
        String an_answer = ""; 
        int line_num = ((question_num-1)*7)+5;
        an_answer = Files.readAllLines(Paths.get(file_name.getName())).get(line_num);
        this.answer = an_answer; //(SETTER)
        return answer;
    }
}
