package part2_gui;

import java.awt.Color;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Maliha Mim, Student ID: 18034438
 * @author Jennifer Nou, Student ID: 18022509
 
 * This class will create a new jFrame that allows players to play the game and move through the questions and choose answers and lifelines.
 */
public class QuestionFrame extends javax.swing.JFrame 
{
    PlayFrame pf = new PlayFrame(); //create a playframe class to access player
    ArrayList<Integer> cash_prizes = new ArrayList<Integer>(Arrays.asList(100,200,300,500,1000,2000,4000,8000,16000,32000,
            64000,125000,250000,500000,1000000));
    
    File contest_questions = new File("ContestQuestions.txt"); // Create a File object
    //Questionnaire questionnaire = new Questionnaire(); // Loads the questions
  
    int question_counter = 1;   
    int option_chosen;
    /**
     * Creates new form QuestionFrame
     */
    public QuestionFrame() 
    {
        initComponents();
    }
    
    //Changes the amount in the text field, updating as the levels go up
    public void changeAmount()
    {
        jTextField1.setText(DisplayPlayingFor());
    }
    
    //Returns what cash amount the player is playing for
    public String DisplayPlayingFor()
    {
        String n = pf.getName(); //store name in variable
        pf.CreatePlayer(n);
        int lvl = cash_prizes.get(pf.GetPlayer().getLevel()); //get amount at level:
        String amount = Integer.toString(lvl);
        return amount;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(240, 196, 151));

        jLabel1.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("Playing for: $");

        jLabel2.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("Question 1:");

        jLabel4.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setText("Q: ");

        jTextField1.setEditable(false);

        jTextField2.setEditable(false);
        jTextField2.setText("jTextField2");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 153, 153));
        jButton1.setText("Option C");
        jButton1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton1FocusLost(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 153, 153));
        jButton4.setText("Option D");
        jButton4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton4FocusLost(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setOpaque(false);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/fifty.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/phone.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                askFriendLifelineMouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/hinthint.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hintLifelineMouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/aud.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                audienceLifelineMouseClicked(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 153, 153));
        jButton2.setText("Option A");
        jButton2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton2FocusLost(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 153, 153));
        jButton3.setText("Option B");
        jButton3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton3FocusLost(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 102, 102));
        jButton5.setText("Enter");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(162, 162, 162)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(162, 162, 162)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(373, 373, 373))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(221, 221, 221))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(239, 239, 239))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        changeAmount();
        try{
            changeQuestion();
        }
        catch(IOException e)
        {
            System.out.print("Wrong input, get out");
        }
        try {
            changeC();
        }

        catch(IOException e) {
            System.out.print("Wrong input! " + e.getMessage());
        }
        try {
            changeD();
        }

        catch(IOException e) {
            System.out.print("Wrong input! " + e.getMessage());
        }
        try {
            changeA();
        }

        catch(IOException e) {
            System.out.print("Wrong input! " + e.getMessage());
        }
        try {
            changeB();
        }

        catch(IOException e) {
            System.out.print("Wrong input! " + e.getMessage());
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Enter button 
    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        try {
            //Re-setting all answer options to enabled:
            jButton2.setEnabled(true);
            jButton3.setEnabled(true);
            jButton1.setEnabled(true);
            jButton4.setEnabled(true);
          
            //Moving to the next question when the user gets it correct
            if(compareAnswer() == 0) {
               jTextField3.setText("");
               pf.GetPlayer().LevelUp();
              
               try {
                   int lvl = cash_prizes.get(pf.GetPlayer().getLevel()); //get amount at level:
                   String amount = Integer.toString(lvl);
                   jTextField1.setText(amount);
                   changeQuestion(); //Changing question
                   //Changing to corresponding answer options
                   changeA(); 
                   changeB();
                   changeC();
                   changeD();
                   
                   question_counter++; //updating the question counter
                   jLabel2.setText("Question " + question_counter + ":"); //Updating question number on GUI
                   
                   //Once questionnaire gets to last question, the user wins!
                   if (question_counter > 15) {
                        this.dispose();
                        QuestionFrame qf = new QuestionFrame();
                        qf.setVisible(false);
                        WinnerFrame wf = new WinnerFrame();
                        wf.setVisible(true); //Changing to winner frame
                    }
               }
               catch(IndexOutOfBoundsException e) {
                    this.dispose();
                    QuestionFrame qf = new QuestionFrame();
                    qf.setVisible(false);
                    WinnerFrame wf = new WinnerFrame();
                    wf.setVisible(true);
                }
            }
            else if(compareAnswer() == 1)
            {
                 this.dispose();
                QuestionFrame qf = new QuestionFrame();
                qf.setVisible(false);
                WrongAnswer wa = new WrongAnswer();
                wa.setVisible(true);
            }
        } catch (IOException ex) {
            Logger.getLogger(QuestionFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5MouseClicked
    //For when the user unclicks an option:
    // Option A button
    private void jButton2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton2FocusLost
        jButton2.setBackground(Color.WHITE);
        jButton2.setForeground(Color.PINK);
    }//GEN-LAST:event_jButton2FocusLost
    // Option B button
    private void jButton3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton3FocusLost
        jButton3.setBackground(Color.WHITE);
        jButton3.setForeground(Color.PINK);
    }//GEN-LAST:event_jButton3FocusLost
    // Option C button
    private void jButton1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton1FocusLost
        jButton1.setBackground(Color.WHITE);
        jButton1.setForeground(Color.PINK);
    }//GEN-LAST:event_jButton1FocusLost
    // Option D buttons
    private void jButton4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton4FocusLost
        jButton4.setBackground(Color.WHITE);
        jButton4.setForeground(Color.PINK);
    }//GEN-LAST:event_jButton4FocusLost
    //For when the user clicks an option:
    //Option A button 
    private void jButton2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton2FocusGained
        jButton2.setBackground(Color.PINK);
        jButton2.setForeground(Color.WHITE);
        jButton2.setOpaque(true);
        option_chosen = 1;
    }//GEN-LAST:event_jButton2FocusGained
    // Option B button
    private void jButton3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton3FocusGained
        jButton3.setBackground(Color.PINK);
        jButton3.setForeground(Color.WHITE);
        jButton3.setOpaque(true);
         option_chosen = 2;
    }//GEN-LAST:event_jButton3FocusGained
    // Option C button
    private void jButton1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton1FocusGained
        // TODO add your handling code here:
        jButton1.setBackground(Color.PINK);
        jButton1.setForeground(Color.WHITE);
        jButton1.setOpaque(true);
         option_chosen = 3;
    }//GEN-LAST:event_jButton1FocusGained
    // Option D button
    private void jButton4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton4FocusGained
        // TODO add your handling code here:
        jButton4.setBackground(Color.PINK);
        jButton4.setForeground(Color.WHITE);
        jButton4.setOpaque(true);
        option_chosen = 4;
    }//GEN-LAST:event_jButton4FocusGained
    // Fifty Fifty lifeline
    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        //Disable all buttons and only enable the ones that give you 2 random options (along with correct option)
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton1.setEnabled(false);
        jButton4.setEnabled(false);
        
        int question_counter = (pf.GetPlayer().getLevel())+1;
        FiftyFifty ff = new FiftyFifty();
        try {
            Character[] options_left = ff.use_fiftyfifty(question_counter, contest_questions);
            
            //First option:
            if(options_left[0] == 'A')
            {
                jButton2.setEnabled(true);
                
            }
            else if(options_left[0] == 'B')
            {
                jButton3.setEnabled(true);
                
            }
            else if(options_left[0] == 'C')
            {
                jButton1.setEnabled(true);
                
            }
            else if(options_left[0] == 'D')
            {
                jButton4.setEnabled(true);
            }
            
            //second option:
            if(options_left[1] == 'A')
            {
                jButton2.setEnabled(true);
                
            }
            else if(options_left[1] == 'B')
            {
                jButton3.setEnabled(true);
                
            }
            else if(options_left[1] == 'C')
            {
                jButton1.setEnabled(true);
                
            }
            else if(options_left[1] == 'D')
            {
                jButton4.setEnabled(true);
            }
            
            jLabel5.setEnabled(false); // Set the 50/50 lifeline to block
            
            MouseListener[] mListener = jLabel5.getMouseListeners();
            for (MouseListener ml : mListener) {
            jLabel5.removeMouseListener(ml);
            }
        } catch (IOException ex) {
            Logger.getLogger(QuestionFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel5MouseClicked
    // Hint lifeline
    private void hintLifelineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hintLifelineMouseClicked
        jTextField3.setVisible(true);
        Hint hint = new Hint();
        int question_counter = (pf.GetPlayer().getLevel() + 1);
        jTextField3.setVisible(true);
        
        try {
            String h =  hint.getAHint(question_counter, contest_questions);
            jTextField3.setText(h);
        } catch (IOException ex) {
            Logger.getLogger(QuestionFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        jLabel7.setEnabled(false);
        
        MouseListener[] mListener = jLabel7.getMouseListeners();
        for (MouseListener ml : mListener) {
            jLabel7.removeMouseListener(ml);
        }
    }//GEN-LAST:event_hintLifelineMouseClicked
    // Ask Friend lifeline
    private void askFriendLifelineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_askFriendLifelineMouseClicked
        // TODO add your handling code here:
        AskFriend friend = new AskFriend();
        int question_counter = (pf.GetPlayer().getLevel()) + 1;
        jTextField3.setVisible(true);
        jTextField3.setVisible(true);
        jTextField3.setText(friend.toString());
        jLabel6.setEnabled(false);
        
        MouseListener[] mListener = jLabel6.getMouseListeners();
        for (MouseListener ml : mListener) {
            jLabel6.removeMouseListener(ml);
        }
    }//GEN-LAST:event_askFriendLifelineMouseClicked
    // Audience lifeline
    private void audienceLifelineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_audienceLifelineMouseClicked
        AskAudience audience = new AskAudience();
        int question_counter = (pf.GetPlayer().getLevel()) + 1;
        
        jTextField3.setVisible(false);
        jTextField3.setVisible(true);
        jTextField3.setText(askAudience());
        jLabel8.setEnabled(false);
        
        MouseListener[] mListener = jLabel8.getMouseListeners();
        for (MouseListener ml : mListener) {
            jLabel8.removeMouseListener(ml);
        }
    }//GEN-LAST:event_audienceLifelineMouseClicked
    //Set the option that was chosen by the user in a variable
    public char setChosen() throws IOException
    {
        char chosen_ans = 0;
        if(option_chosen == 1) //1 corresponds to option A...
        {
            chosen_ans = 'A';
        }
        else if(option_chosen == 2)
        {
            chosen_ans = 'B';
        }
         else if(option_chosen == 3)
        {
            chosen_ans = 'C';
        }
         else if(option_chosen == 4)
        {
            chosen_ans = 'D';
        }
        return chosen_ans;
    }
 
    //Get the answer of the current question:
     public String getAnswer() throws IOException
    {
        int question_counter = (pf.GetPlayer().getLevel())+1; //Question starts from 1:
        Question current_question = new Question(); //create a new Question object to manipulate 
        String ans = current_question.getAnswer(question_counter, contest_questions);
        return ans;
    }
  
    public int compareAnswer() throws IOException
    {
        char ans = getAnswer().charAt(10);
        char user_ans = setChosen();
        int value = 0; //true
        if(user_ans == ans)
        {
            value = 0;
        }
        else if(user_ans != ans)
        {
            value = 1;
        }
        return value;
    }
    public String loadQuestion() throws IOException
    {
        int question_counter = pf.GetPlayer().getLevel() + 1; //Question starts from 1:
        
        Question current_question = new Question(); //create a new Question object to manipulate 
        
        String q = current_question.getQuestion(question_counter, contest_questions);
        return q;
    }
    
    public String loadA() throws IOException
    {
        int question_counter = pf.GetPlayer().getLevel() + 1; //Question starts from 1:
        Question current_question = new Question(); //create a new Question object to manipulate 
        String a = current_question.getA(question_counter, contest_questions);
        return a;
    }
    
    public void changeA() throws IOException
    {
        jButton2.setText(loadA());
    }
    
    public String loadB() throws IOException
    {
        int question_counter = pf.GetPlayer().getLevel() + 1; //Question starts from 1:
        Question current_question = new Question(); //create a new Question object to manipulate 
        String b = current_question.getB(question_counter, contest_questions);
        return b;
    }
    
    public void changeB() throws IOException
    {
        jButton3.setText(loadB());
    }
    
    public String loadC() throws IOException
    {
        int question_counter = pf.GetPlayer().getLevel() + 1; //Question starts from 1:
        Question current_question = new Question(); //create a new Question object to manipulate 
        String c = current_question.getC(question_counter, contest_questions);
        return c;
    }
    
    public void changeC() throws IOException
    {
        jButton1.setText(loadC());
    }
    
    public String loadD() throws IOException
    {
        int question_counter = pf.GetPlayer().getLevel() + 1; //Question starts from 1:
        Question current_question = new Question(); //create a new Question object to manipulate 
        String d = current_question.getD(question_counter, contest_questions);
        return d;
    }
    
    public void changeD() throws IOException
    {
        jButton4.setText(loadD());
    }
    
    public void changeQuestion() throws IOException
    {
        jTextField2.setText(loadQuestion());
    }
    
    public static void main(String args[]) 
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuestionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuestionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuestionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuestionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new QuestionFrame().setVisible(true);
            }
        } );
    }
    
    public String askAudience() {
        int guess = 0;
        int count_a = 0; // Counts how many time 'A' was chosen
        int count_b = 0; // Counts how many time 'B' was chosen
        int count_c = 0; // Counts how many time 'C' was chosen
        int count_d = 0; // Counts how many time 'D' was chosen
        Random rand = new Random();
        for(int audience = 0; audience < 50; audience++) { // Audience has been set to 50 people
            guess = rand.nextInt(5); // Randomly picks an option 
            if(guess == 1) {
                count_a++;
            }
            else if(guess == 2) {
                count_b++;
            }
            else if(guess == 3) {
                count_c++;
            }
            else if(guess == 4) {
                count_d++;
            }
        }
        return "Results: " + count_a + " chose A, " + count_b + " chose B, "+ 
                count_c + " chose C, " + count_d + " chose D";
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
