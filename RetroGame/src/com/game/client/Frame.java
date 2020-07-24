package com.game.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.green;
import java.io.File;

import static java.awt.Color.WHITE;
import static java.awt.Color.green;

    public class Frame {

        JFrame window; //new
        Container con;//new
        JPanel titleNameOnPanel, startButtonPanel, screenTextPanel, choiceButtonPanel;
        JLabel titleNameOnLabel;
        Font titleFont = new Font("Algerian", Font.BOLD, 60);
        Font buttonFont = new Font("Abadi", Font.PLAIN, 25);
        JButton startButton, choiceButton1, choiceButton2, choiceButton3, choiceButton4;
        JTextArea screenTextArea;

        MainScreenHandler mHandler = new MainScreenHandler();
        ChoiceButtonHandler choiceButtonHandler = new ChoiceButtonHandler();


        public static void main(String[] args) {
            new Frame();
        }
        public Frame(){

            window = new JFrame();
            window.setSize(800,600);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.getContentPane().setBackground(Color.CYAN);
            window.setLayout(null);
            window.setVisible(true);
            con = window.getContentPane();

            titleNameOnPanel = new JPanel();
            titleNameOnPanel.setBounds(300, 80, 1000, 100);
            titleNameOnPanel.setBackground(Color.CYAN);

            titleNameOnLabel = new JLabel("TLG AMAZING MAZE");
            titleNameOnLabel.setForeground(Color.GRAY);
            titleNameOnLabel.setFont(titleFont);


            startButtonPanel = new JPanel();
            startButtonPanel.setBounds(700,500, 200, 330);
            startButtonPanel.setBackground(Color.CYAN);
            startButton = new JButton("START");
            startButton.setBackground(Color.GREEN);
            startButton.setForeground(Color.gray);
            startButton.setFont(buttonFont);
            startButton.addActionListener(mHandler);
            startButton.setFocusPainted(false);

            titleNameOnPanel.add(titleNameOnLabel);
            startButtonPanel.add(startButton);
            con.add(titleNameOnPanel);
            con.add(startButtonPanel);
        }

        public void gameScreen(){

            titleNameOnPanel.setVisible(false);
            startButtonPanel.setVisible(false);

            screenTextPanel = new JPanel();
            screenTextPanel.setBounds(450, 150, 700, 200);
            screenTextPanel.setBackground(Color.CYAN);
            con.add(screenTextPanel);

            screenTextArea = new JTextArea("Welcome aboard with our amazing team at TLG!! \nEnjoy this fun ride to Amazon OJT!! \n\n Fasten Your Seatbelt!!!");
            screenTextArea.setBounds(400,300, 700, 100);
            screenTextArea.setBackground(Color.CYAN);
            screenTextArea.setForeground(Color.RED);
            screenTextArea.setFont(buttonFont);
            screenTextArea.setLineWrap(true);
            screenTextPanel.add(screenTextArea);

            choiceButtonPanel = new JPanel();
            choiceButtonPanel.setBounds(600, 350, 400, 200);
            choiceButtonPanel.setBackground(green);
            choiceButtonPanel.setLayout(new GridLayout(4,1));
            con.add(choiceButtonPanel);

            choiceButton1 = new JButton("Instructions");
            choiceButton1.setBackground(Color.yellow);
            choiceButton1.setForeground(Color.red);
            choiceButton1.setFont(buttonFont);
            choiceButton1.setFocusPainted(false);
            choiceButton1.addActionListener(choiceButtonHandler);
            choiceButton1.setActionCommand("c1");
            choiceButtonPanel.add(choiceButton1);

            choiceButton2 = new JButton("Location");
            choiceButton2.setBackground(Color.yellow);
            choiceButton2.setForeground(Color.red);
            choiceButton2.setFont(buttonFont);
            choiceButton2.setFocusPainted(false);
            choiceButton2.addActionListener(choiceButtonHandler);
            choiceButton2.setActionCommand("c2");
            choiceButtonPanel.add(choiceButton2);

            choiceButton3 = new JButton("Score");
            choiceButton3.setBackground(Color.yellow);
            choiceButton3.setForeground(Color.red);
            choiceButton3.setFont(buttonFont);
            choiceButton3.setFocusPainted(false);
            choiceButton3.addActionListener(choiceButtonHandler);
            choiceButton3.setActionCommand("c3");
            choiceButtonPanel.add(choiceButton3);

            choiceButton4 = new JButton("Quit");
            choiceButton4.setBackground(Color.yellow);
            choiceButton4.setForeground(Color.red);
            choiceButton4.setFont(buttonFont);
            choiceButton4.setFocusPainted(false);
            choiceButton4.addActionListener(choiceButtonHandler);
            choiceButton4.setActionCommand("c4");
            choiceButtonPanel.add(choiceButton4);

        }

        public void gameInstructions(){
            System.out.println("Instructions:\n" +
                    "Once you are in the game you can't move backwards.\n" +
                    "You need to pass each class to reach to your final destination!!\n" +
                    "Be ready for some guitar lessons from Jay!!\n" +
                    "Have a laugh with Nelly!!\n" +
                    "Get ready for some fun with Tom and his hijack stories!!\n" +
                    "Explore Linux/ AWS with JOHN!!\n" +
                    "Be a part of 'Python Gang' with Zack...I mean Zach!!\n" +
                    "Be agile with Rennie!! Mind you he is the product owner!!\n" +
                    "Last but not the least: \"BE YOURSELF!!!\"\n");
        }

        public class MainScreenHandler implements ActionListener {


            @Override
            public void actionPerformed(ActionEvent event) {

                gameScreen();

            }
        }

        public class ChoiceButtonHandler implements ActionListener{


            @Override
            public void actionPerformed(ActionEvent event) {

                String typeChoice = event.getActionCommand();

                if(typeChoice.equals("c1")){

                    gameInstructions();


                }

            }
        }
    }



