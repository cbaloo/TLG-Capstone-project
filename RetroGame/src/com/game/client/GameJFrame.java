package com.game.client;

import com.game.accesory.MessageArt;
import com.game.person.Player;
import com.game.room.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import static java.awt.Color.*;


public class GameJFrame {

    JFrame window; //new
    Container con;//new
    JPanel titleNameOnPanel, startButtonPanel, screenTextPanel, choiceButtonPanel, screen1ENamePanel, playerClassPanel, playerScoreLocTimePanel, javaScreenPanel, javaButtonPanel, mapPanel;
    JLabel titleNameOnLabel, screen1ENameLabel, javaClassLabel, jsClassLabel, dsClassLabel, liClassLabel, pyClassLabel, capClassLabel, scoreLabel, locationLabel, timeLabel, scoreValueLabel, locationValueLabel;

    Font titleFont = new Font("Algerian", Font.BOLD, 60);
    Font buttonFont = new Font("Abadi", Font.BOLD, 25);
    Font normalFont= new Font("Times New Roman", Font.PLAIN, 15);
    JButton startButton, choiceButton1, choiceButton2, choiceButton3, choiceButton4, javaButton;
    JTextArea screenTextArea, mapTextArea;

    JTextField screen1EnterNameTF;

    int currentScore; //
    String currentLocation;
    String name;
    Player player;
    Room lobby=new Lobby();
//    private List<Room> roomList = new ArrayList(Arrays.asList(
//            new Lobby(),
//            new RoomJava(),
//            new RoomJS(),
//            new RoomAlgorithm(),
//            new RoomLinux(),
//            new RoomPython(),
//            new RoomCapstone()
//    ));

    // TextFieldHandler tfHandler = new TextFieldHandler();//tf
    MainScreenHandler mHandler = new MainScreenHandler();
//    ChoiceButtonHandler choiceButtonHandler = new ChoiceButtonHandler();
    // ChoiceButtonHandler.JavaButtonHandler javaButtonHandler = new ChoiceButtonHandler.JavaButtonHandler();

    public static void main(String[] args) {
        new GameJFrame();
        // new DigitalWatch();
    }

    public GameJFrame() {

        window = new JFrame();
        window.setSize(1200, 1000);
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
        startButtonPanel.setBounds(800, 400, 200, 100);
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

        screen1ENamePanel = new JPanel();
        screen1ENamePanel.setBounds(710, 300, 300, 50);
        screen1ENamePanel.setBackground(Color.gray);
        screen1ENamePanel.setLayout(new GridLayout(1, 1));
        con.add(screen1ENamePanel);

        screen1EnterNameTF = new JTextField("Jack",26);
        screen1EnterNameTF.setBounds(600, 300, 300, 50);
        screen1EnterNameTF.setEditable(true);
        screen1EnterNameTF.setEnabled(true);
        screen1EnterNameTF.requestFocusInWindow();
        screen1ENamePanel.add(screen1EnterNameTF);

    }

    public void enterNameOnScreen1(){
        name=screen1EnterNameTF.getText();
        try{
            player=new Player(name);//TODO: Validation required
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public void gameScreen() {

        titleNameOnPanel.setVisible(false);
        startButtonPanel.setVisible(false);
        screen1ENamePanel.setVisible(false);
//        welcomeMsgPanel.setVisible(false);

        screenTextPanel = new JPanel();
        screenTextPanel.setBounds(450, 150, 1000, 350);
        screenTextPanel.setBackground(blue);
        con.add(screenTextPanel);

        screenTextArea = new JTextArea("--------------------------------------------" +
                "\nHEY " + name.toUpperCase() + "! " +
                "\n\nWELCOME TO THE TLG LEARNING FACILITY IN BELLEVUE, WA!" +
                "\nCONGRATULATIONS!!! YOU ARE A BRAND SPANKING NEW SDE APPRENTICE. " +
                "\nBE READY FOR AN EXCITING RIDE TO AMAZON. " +
                "\n\nWARNING!!! BEFORE ENTERING BUCKLE UP WITH LOADS OF ENTHUSIASM. " +
                "\nTO GET TO OJT YOU HAVE TO GO THROUGH THE GATEKEEPERS: TLG INSTRUCTORS AND STAFF." +
                "\n\nGOOD LUCK AND GODSPEED."+"\n\n"+lobby.getMessage());
        screenTextArea.setBounds(screenTextPanel.getBounds());
        screenTextArea.setBackground(blue);
        screenTextArea.setForeground(Color.BLACK);
        screenTextArea.setFont(normalFont);
        screenTextArea.setLineWrap(true);
        screenTextPanel.add(screenTextArea);

        mapPanel = new JPanel();
        mapPanel.setBounds(450, 600, 1200, 200);
        mapPanel.setBackground(blue);
        con.add(mapPanel);

        mapTextArea= new JTextArea(MessageArt.mapLobbyText.toString());
        mapTextArea.setBounds(mapPanel.getBounds());
        mapTextArea.setBackground(blue);
        mapTextArea.setForeground(black);
        mapTextArea.setFont(normalFont);
        mapPanel.add(mapTextArea);

        javaButtonPanel = new JPanel();
        javaButtonPanel.setBounds(950, 800, 200, 50);
        javaButtonPanel.setBackground(yellow);
        javaButtonPanel.setLayout(new GridLayout(1, 1));
        con.add(javaButtonPanel);

        javaButton = new JButton("Enter Java");
        javaButton.setBackground(Color.red);
        javaButton.setForeground(green);
        javaButton.setFont(buttonFont);
        javaButton.setFocusPainted(false);

        javaButton.setActionCommand("j1");
        javaButtonPanel.add(javaButton);

//        choiceButtonPanel = new JPanel();
//        choiceButtonPanel.setBounds(830, 350, 400, 200);
//        choiceButtonPanel.setBackground(green);
//        choiceButtonPanel.setLayout(new GridLayout(4, 1));
//        con.add(choiceButtonPanel);

//        choiceButton1 = new JButton("Instructions");
//        choiceButton1.setBackground(Color.gray);
//        choiceButton1.setForeground(Color.red);
//        choiceButton1.setFont(buttonFont);
//        choiceButton1.setFocusPainted(false);
//        choiceButton1.addActionListener(choiceButtonHandler);
//        choiceButton1.setActionCommand("c1");
//        choiceButtonPanel.add(choiceButton1);

//        choiceButton2 = new JButton("GameMap");
//        choiceButton2.setBackground(Color.darkGray);
//        choiceButton2.setForeground(Color.red);
//        choiceButton2.setFont(buttonFont);
//        choiceButton2.setFocusPainted(false);
//        choiceButton2.addActionListener(choiceButtonHandler);
//        choiceButton2.setActionCommand("c2");
//        choiceButtonPanel.add(choiceButton2);

//        choiceButton3 = new JButton("Timer");
//        choiceButton3.setBackground(Color.gray);
//        choiceButton3.setForeground(Color.red);
//        choiceButton3.setFont(buttonFont);
//        choiceButton3.setFocusPainted(false);
//        choiceButton3.addActionListener(choiceButtonHandler);
//        choiceButton3.setActionCommand("c3");
//        choiceButtonPanel.add(choiceButton3);

//        choiceButton4 = new JButton("Quit");
//        choiceButton4.setBackground(Color.darkGray);
//        choiceButton4.setForeground(Color.red);
//        choiceButton4.setFont(buttonFont);
//        choiceButton4.setFocusPainted(false);
//        choiceButton4.addActionListener(choiceButtonHandler);
//        choiceButton4.setActionCommand("c4");
//        choiceButtonPanel.add(choiceButton4);

//        playerClassPanel = new JPanel();
//        playerClassPanel.setBounds(550, 700, 1000, 80);
//        playerClassPanel.setBackground(Color.blue);
//        playerClassPanel.setLayout(new GridLayout(1, 3));
//        con.add(playerClassPanel);

//        javaClassLabel = new JLabel("Java");
//        javaClassLabel.setFont(buttonFont);
//        javaClassLabel.setForeground(green);
//        playerClassPanel.add(javaClassLabel);

//        jsClassLabel = new JLabel("JavaScript");
//        jsClassLabel.setFont(buttonFont);
//        jsClassLabel.setForeground(green);
//        playerClassPanel.add(jsClassLabel);
//
//        dsClassLabel = new JLabel("Algorithms");
//        dsClassLabel.setFont(buttonFont);
//        dsClassLabel.setForeground(green);
//        playerClassPanel.add(dsClassLabel);
//
//        liClassLabel = new JLabel("Linux");
//        liClassLabel.setFont(buttonFont);
//        liClassLabel.setForeground(green);
//        playerClassPanel.add(liClassLabel);
//
//        pyClassLabel = new JLabel("Python");
//        pyClassLabel.setFont(buttonFont);
//        pyClassLabel.setForeground(green);
//        playerClassPanel.add(pyClassLabel);
//
//        capClassLabel = new JLabel("Capstone");
//        capClassLabel.setFont(buttonFont);
//        capClassLabel.setForeground(green);
//        playerClassPanel.add(capClassLabel);

        playerScoreLocTimePanel = new JPanel();
        playerScoreLocTimePanel.setBounds(700, 40, 700, 80);
        playerScoreLocTimePanel.setBackground(Color.blue);
        playerScoreLocTimePanel.setLayout(new GridLayout(1, 4));
        con.add(playerScoreLocTimePanel);

        scoreLabel = new JLabel("SCORE:");
        scoreLabel.setFont(buttonFont);
        scoreLabel.setForeground(green);
        playerScoreLocTimePanel.add(scoreLabel);

        scoreValueLabel = new JLabel();
        scoreValueLabel.setFont(buttonFont);
        scoreValueLabel.setForeground(green);
        playerScoreLocTimePanel.add(scoreValueLabel);

        locationLabel = new JLabel("LOCATION:");
        locationLabel.setFont(buttonFont);
        locationLabel.setForeground(green);
        playerScoreLocTimePanel.add(locationLabel);

        locationValueLabel = new JLabel();
        locationValueLabel.setFont(buttonFont);
        locationValueLabel.setForeground(green);
        playerScoreLocTimePanel.add(locationValueLabel);

        currentScoreLocation();

    }

    public void currentScoreLocation() {
        currentScore = Integer.parseInt(player.getStatus().get("SCORE"));
        currentLocation =player.getStatus().get("LOCATION");
        scoreValueLabel.setText("" + currentScore);
        locationValueLabel.setText(currentLocation);

    }



//    public void gameInstructions() {
//        System.out.println("Instructions:\n" +
//                "Once you are in the game you can't move backwards.\n" +
//                "You need to pass each class to reach to your final destination!!\n" +
//                "Be ready for some guitar lessons from Jay!!\n" +
//                "Have a laugh with Nelly!!\n" +
//                "Get ready for fun with Tom and his hijack stories!!\n" +
//                "Explore Linux/ AWS with JOHN!!\n" +
//                "Be a part of 'Python Gang' with Zack...I mean Zach!!\n" +
//                "Be agile with Rennie!! Mind you he is the product owner!!\n" +
//                "Last but not the least: \"BE YOURSELF!!!\"\n");
//    }

//    public void displayMap() throws FileNotFoundException {
//
//        File file = new File("\"C:\\\\StudentWork\\\\Capstone01\\\\RetroGame\\\\src\\\\com\\\\game\\\\testtlg.txt\"");
//        Scanner scanner = new Scanner(file, StandardCharsets.UTF_8.name());
//        String content = null;
//        try (scanner) {
//            content = scanner.useDelimiter("\\A").next();
//
//            //   } catch(IOException e){
//            //       e.printStackTrace();
//        }
//        // System.out.println(content);
//        System.out.println(content);
//    }



    public class MainScreenHandler implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent event) {

            enterNameOnScreen1();
            gameScreen();
            currentScoreLocation();

        }
    }

//    public class ChoiceButtonHandler implements ActionListener {
//
//
//        @Override
//        public void actionPerformed(ActionEvent event) {
//
//            String typeChoice = event.getActionCommand();
//
//            if (typeChoice.equals("c1")) {
//
//                gameInstructions();
//
//
//            } else if (typeChoice.equals("c2")) {
//
//                try {
//                    displayMap();
//                } catch (FileNotFoundException e) {
//                    e.printStackTrace();
//                }
//
//            } else if (typeChoice.equals("c3"))
//                new DigitalWatch();
//
//
//        }
//
//
//    }



}
