package com.game.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static java.awt.Color.*;


public class Frame {

    JFrame window; //new
    Container con;//new
    JPanel titleNameOnPanel, startButtonPanel, screenTextPanel, choiceButtonPanel, screen1ENamePanel, playerClassPanel, playerScoreLocTimePanel, javaScreenPanel, javaButtonPanel;
    JLabel titleNameOnLabel, screen1ENameLabel, javaClassLabel, jsClassLabel, dsClassLabel, liClassLabel, pyClassLabel, capClassLabel, scoreLabel, locationLabel, timeLabel;
    Font titleFont = new Font("Algerian", Font.BOLD, 60);
    Font buttonFont = new Font("Abadi", Font.BOLD, 25);
    JButton startButton, choiceButton1, choiceButton2, choiceButton3, choiceButton4, javaButton;
    JTextArea screenTextArea;
    //CB added for enter name on screen 1.
    JTextField screen1EnterNameTF;


    Scanner userInput = new Scanner(System.in);

    // TextFieldHandler tfHandler = new TextFieldHandler();//tf
    MainScreenHandler mHandler = new MainScreenHandler();
    ChoiceButtonHandler choiceButtonHandler = new ChoiceButtonHandler();
    // ChoiceButtonHandler.JavaButtonHandler javaButtonHandler = new ChoiceButtonHandler.JavaButtonHandler();

    public static void main(String[] args) {
        new Frame();
        // new DigitalWatch();
    }

    public Frame() {

        window = new JFrame();
        window.setSize(1200, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.blue);
        window.setLayout(null);
        window.setVisible(true);
        con = window.getContentPane();

        titleNameOnPanel = new JPanel();
        titleNameOnPanel.setBounds(420, 80, 1000, 100);
        titleNameOnPanel.setBackground(Color.blue);

        titleNameOnLabel = new JLabel("TLG AMAZING MAZE");
        titleNameOnLabel.setForeground(Color.BLACK);
        titleNameOnLabel.setFont(titleFont);


        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(750, 400, 200, 330);
        startButtonPanel.setBackground(Color.blue);

        startButton = new JButton("Submit");
        startButton.setBackground(Color.GREEN);
        startButton.setForeground(Color.BLACK);
        startButton.setFont(buttonFont);
        startButton.addActionListener(mHandler);
        startButton.setFocusPainted(false);

        titleNameOnPanel.add(titleNameOnLabel);
        startButtonPanel.add(startButton);
        con.add(titleNameOnPanel);
        con.add(startButtonPanel);
        // CB adding text field on sc 1. ie add TF to TFP and then add TFP to window via con.add
        screen1ENamePanel = new JPanel();
        screen1ENamePanel.setBounds(700, 300, 300, 50);
        screen1ENamePanel.setBackground(Color.gray);
        screen1ENamePanel.setLayout(new GridLayout(1, 1));
        con.add(screen1ENamePanel);

        screen1EnterNameTF = new JTextField("Enter Name", 26);
        screen1EnterNameTF.setBounds(600, 300, 300, 50);
        screen1EnterNameTF.setEditable(false);
        screen1EnterNameTF.setEnabled(true);
        screen1EnterNameTF.requestFocusInWindow();
        screen1ENamePanel.add(screen1EnterNameTF);
        // sc1SubmitButton.addActionListener(tfHandler);


    }

    public void gameScreen() {

        titleNameOnPanel.setVisible(false);
        startButtonPanel.setVisible(false);
        screen1ENamePanel.setVisible(false);

        //DigitalWatch digitalWatch = new DigitalWatch();
        screenTextPanel = new JPanel();
        screenTextPanel.setBounds(450, 150, 700, 200);
        screenTextPanel.setBackground(Color.blue);
        con.add(screenTextPanel);

        screenTextArea = new JTextArea("Welcome aboard with our amazing team at TLG!! \nEnjoy this fun ride to Amazon OJT!! \n\n Fasten Your Seatbelt!!!");
        screenTextArea.setBounds(400, 300, 700, 100);
        screenTextArea.setBackground(Color.blue);
        screenTextArea.setForeground(Color.BLACK);
        screenTextArea.setFont(buttonFont);
        screenTextArea.setLineWrap(true);
        screenTextPanel.add(screenTextArea);

        javaButtonPanel = new JPanel();
        javaButtonPanel.setBounds(950, 600, 200, 50);
        javaButtonPanel.setBackground(yellow);
        javaButtonPanel.setLayout(new GridLayout(1, 1));
        con.add(javaButtonPanel);

        javaButton = new JButton("Enter Java");

        javaButton.setBackground(Color.red);
        javaButton.setForeground(green);
        javaButton.setFont(buttonFont);
        javaButton.setFocusPainted(false);
        // javaButton.addActionListener(javaButtonHandler);
        javaButton.setActionCommand("j1");
        javaButtonPanel.add(javaButton);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(830, 350, 400, 200);
        choiceButtonPanel.setBackground(green);
        choiceButtonPanel.setLayout(new GridLayout(4, 1));
        con.add(choiceButtonPanel);

        choiceButton1 = new JButton("Instructions");
        choiceButton1.setBackground(Color.gray);
        choiceButton1.setForeground(Color.red);
        choiceButton1.setFont(buttonFont);
        choiceButton1.setFocusPainted(false);
        choiceButton1.addActionListener(choiceButtonHandler);
        choiceButton1.setActionCommand("c1");
        choiceButtonPanel.add(choiceButton1);

        choiceButton2 = new JButton("GameMap");
        choiceButton2.setBackground(Color.darkGray);
        choiceButton2.setForeground(Color.red);
        choiceButton2.setFont(buttonFont);
        choiceButton2.setFocusPainted(false);
        choiceButton2.addActionListener(choiceButtonHandler);
        choiceButton2.setActionCommand("c2");
        choiceButtonPanel.add(choiceButton2);

        choiceButton3 = new JButton("Play");
        choiceButton3.setBackground(Color.gray);
        choiceButton3.setForeground(Color.red);
        choiceButton3.setFont(buttonFont);
        choiceButton3.setFocusPainted(false);
        choiceButton3.addActionListener(choiceButtonHandler);
        choiceButton3.setActionCommand("c3");
        choiceButtonPanel.add(choiceButton3);

        choiceButton4 = new JButton("Quit");
        choiceButton4.setBackground(Color.darkGray);
        choiceButton4.setForeground(Color.red);
        choiceButton4.setFont(buttonFont);
        choiceButton4.setFocusPainted(false);
        choiceButton4.addActionListener(choiceButtonHandler);
        choiceButton4.setActionCommand("c4");
        choiceButtonPanel.add(choiceButton4);

        playerClassPanel = new JPanel();
        playerClassPanel.setBounds(550, 700, 1000, 80);
        playerClassPanel.setBackground(Color.darkGray);
        playerClassPanel.setLayout(new GridLayout(1, 3));
        con.add(playerClassPanel);

        javaClassLabel = new JLabel("Java");
        javaClassLabel.setFont(buttonFont);
        javaClassLabel.setForeground(green);
        playerClassPanel.add(javaClassLabel);

        jsClassLabel = new JLabel("JavaScript");
        jsClassLabel.setFont(buttonFont);
        jsClassLabel.setForeground(green);
        playerClassPanel.add(jsClassLabel);

        dsClassLabel = new JLabel("Algorithms");
        dsClassLabel.setFont(buttonFont);
        dsClassLabel.setForeground(green);
        playerClassPanel.add(dsClassLabel);

        liClassLabel = new JLabel("Linux");
        liClassLabel.setFont(buttonFont);
        liClassLabel.setForeground(green);
        playerClassPanel.add(liClassLabel);

        pyClassLabel = new JLabel("Python");
        pyClassLabel.setFont(buttonFont);
        pyClassLabel.setForeground(green);
        playerClassPanel.add(pyClassLabel);

        capClassLabel = new JLabel("Capstone");
        capClassLabel.setFont(buttonFont);
        capClassLabel.setForeground(green);
        playerClassPanel.add(capClassLabel);

        playerScoreLocTimePanel = new JPanel();
        playerScoreLocTimePanel.setBounds(700, 40, 700, 80);
        playerScoreLocTimePanel.setBackground(Color.GRAY);
        playerScoreLocTimePanel.setLayout(new GridLayout(1, 3));
        con.add(playerScoreLocTimePanel);

        scoreLabel = new JLabel("Score:");
        scoreLabel.setFont(buttonFont);
        scoreLabel.setForeground(green);
        playerScoreLocTimePanel.add(scoreLabel);

        locationLabel = new JLabel("Location:");
        locationLabel.setFont(buttonFont);
        locationLabel.setForeground(green);
        playerScoreLocTimePanel.add(locationLabel);

        timeLabel = new JLabel("Time:");
        timeLabel.setFont(buttonFont);
        timeLabel.setForeground(green);
        playerScoreLocTimePanel.add(timeLabel);


    }

/*
    public void javaClassScreen() {

        titleNameOnPanel.setVisible(false);
        startButtonPanel.setVisible(false);
        screen1ENamePanel.setVisible(false);

        //DigitalWatch digitalWatch = new DigitalWatch();
        screenTextPanel = new JPanel();
        screenTextPanel.setBounds(450, 150, 700, 200);
        screenTextPanel.setBackground(Color.blue);
        con.add(screenTextPanel);

        screenTextArea = new JTextArea("Welcome to Java class with your instructor JAY!! \nEnjoy this fun ride to Amazon OJT!! ");
        screenTextArea.setBounds(400, 300, 700, 100);
        screenTextArea.setBackground(Color.blue);
        screenTextArea.setForeground(Color.BLACK);
        screenTextArea.setFont(buttonFont);
        screenTextArea.setLineWrap(true);
        screenTextPanel.add(screenTextArea);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(800, 350, 400, 200);
        choiceButtonPanel.setBackground(green);
        choiceButtonPanel.setLayout(new GridLayout(4, 1));
        con.add(choiceButtonPanel);

        choiceButton1 = new JButton("Instructions");
        choiceButton1.setBackground(Color.gray);
        choiceButton1.setForeground(Color.red);
        choiceButton1.setFont(buttonFont);
        choiceButton1.setFocusPainted(false);
        choiceButton1.addActionListener(choiceButtonHandler);
        choiceButton1.setActionCommand("c1");
        choiceButtonPanel.add(choiceButton1);

        choiceButton2 = new JButton("GameMap");
        choiceButton2.setBackground(Color.darkGray);
        choiceButton2.setForeground(Color.red);
        choiceButton2.setFont(buttonFont);
        choiceButton2.setFocusPainted(false);
        choiceButton2.addActionListener(choiceButtonHandler);
        choiceButton2.setActionCommand("c2");
        choiceButtonPanel.add(choiceButton2);

        choiceButton3 = new JButton("Play");
        choiceButton3.setBackground(Color.gray);
        choiceButton3.setForeground(Color.red);
        choiceButton3.setFont(buttonFont);
        choiceButton3.setFocusPainted(false);
        choiceButton3.addActionListener(choiceButtonHandler);
        choiceButton3.setActionCommand("c3");
        choiceButtonPanel.add(choiceButton3);

        choiceButton4 = new JButton("Quit");
        choiceButton4.setBackground(Color.darkGray);
        choiceButton4.setForeground(Color.red);
        choiceButton4.setFont(buttonFont);
        choiceButton4.setFocusPainted(false);
        choiceButton4.addActionListener(choiceButtonHandler);
        choiceButton4.setActionCommand("c4");
        choiceButtonPanel.add(choiceButton4);

        playerClassPanel = new JPanel();
        playerClassPanel.setBounds(600, 40, 300, 80);
        playerClassPanel.setBackground(Color.darkGray);
        playerClassPanel.setLayout(new GridLayout(1, 3));
        con.add(playerClassPanel);

        playerScoreLocTimePanel = new JPanel();
        playerScoreLocTimePanel.setBounds(1000, 40, 300, 80);
        playerScoreLocTimePanel.setBackground(Color.GRAY);
        playerScoreLocTimePanel.setLayout(new GridLayout(1, 3));
        con.add(playerScoreLocTimePanel);

    }
*/

    public void gameInstructions() {
        System.out.println("Instructions:\n" +
                "Once you are in the game you can't move backwards.\n" +
                "You need to pass each class to reach to your final destination!!\n" +
                "Be ready for some guitar lessons from Jay!!\n" +
                "Have a laugh with Nelly!!\n" +
                "Get ready for fun with Tom and his hijack stories!!\n" +
                "Explore Linux/ AWS with JOHN!!\n" +
                "Be a part of 'Python Gang' with Zack...I mean Zach!!\n" +
                "Be agile with Rennie!! Mind you he is the product owner!!\n" +
                "Last but not the least: \"BE YOURSELF!!!\"\n");
    }

    public void displayMap() throws FileNotFoundException {

        File file = new File("C:\\Users\\chand\\Documents\\testtlg.txt");
        Scanner scanner = new Scanner(file, StandardCharsets.UTF_8.name());
        String content = null;
        try (scanner) {
            content = scanner.useDelimiter("\\A").next();

            //   } catch(IOException e){
            //       e.printStackTrace();
        }
        // System.out.println(content);
        System.out.println(content);
    }


/*
   public class TextFieldHandler implements ActionListener {

        String txtField = screen1EnterNameTF.getText();

        @Override
        public void actionPerformed(ActionEvent event) {

            tfLabel.setVisible(true);
            tfLabel.setText(screen1EnterNameTF.getText());

        }

*/           /* String s = event.getActionCommand();
            if (s.equals("submit")) {
                // set the text of the label to the text of the field
                tfLabel.setText(screen1EnterNameTF.getText());

                // set the text of field to blank
                screen1EnterNameTF.setText("  ");
*/


    public class MainScreenHandler implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent event) {

            gameScreen();

        }
    }

    public class ChoiceButtonHandler implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent event) {

            String typeChoice = event.getActionCommand();

            if (typeChoice.equals("c1")) {

                gameInstructions();


            } else if (typeChoice.equals("c2")) {

                try {
                    displayMap();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

            } else if (typeChoice.equals("c3"))
                new DigitalWatch();


        }

      /*  public static JavaButtonHandler implements ActionListener {


            @Override
            public void actionPerformed(ActionEvent event) {

                String javaChoice = event.getActionCommand();

                if (javaChoice.equals("j1")) {

                    System.out.println("You are in Java Class");


                }

       */
    }



}



