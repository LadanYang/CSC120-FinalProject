import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.List;
import java.util.Scanner;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyGUI extends Frame implements ActionListener {

    JTextField userText;
    JLabel displayText;
    JLabel startLabel;
    JButton roomsButton;
    JButton optionsButton;
    JButton applyButton;
    JButton relationshipButton;
    String currentCommand;
    public boolean commandState;

    public MyGUI() {

        this.commandState = false;
        this.currentCommand = "show rooms";

        userText = new JTextField();
        userText.setBounds(50, 500, 450, 50);

        displayText = new JLabel();
        displayText.setBounds(50, 350, 700, 200);
        displayText.setText("<html><p>Welcome to Who's the Murder! In this game, you are the detective to find out the truth behind a crime.</p></html>");
        displayText.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        //displayText.setHorizontalAlignment(SwingConstants.CENTER);
        displayText.setVerticalAlignment(SwingConstants.TOP);

        roomsButton = new JButton("Show Rooms");
        roomsButton.setBounds(600, 100, 150, 50);
        roomsButton.addActionListener(this);

        optionsButton = new JButton("Show Options");
        optionsButton.setBounds(600, 150, 150, 50);
        optionsButton.addActionListener(this);

        relationshipButton = new JButton("Relationship Diagran");
        relationshipButton.setBounds(600, 200, 150, 50);
        relationshipButton.addActionListener(this);

        applyButton = new JButton("Apply");
        applyButton.setBounds(600, 500, 150, 50);
        applyButton.addActionListener(this);

        ImageIcon startImage = new ImageIcon("murder_games.jpeg");
        //ImageIcon relaImage = new ImageIcon("relationship.png");
        this.startLabel = new JLabel(startImage); 
        //JLabel startLabel = new JLabel(startImage); 
        this.startLabel.setBounds(50, 50, 500, 300);
        

        add(startLabel);
        add(optionsButton);
        add(userText);
        add(displayText);
        add(roomsButton);
        add(applyButton);
        add(relationshipButton);

        setPreferredSize(new Dimension(800, 600));
        setSize(getPreferredSize());
        
        setLayout(null);
        setVisible(true);
       
    }

    public void actionPerformed(ActionEvent evt) {
        if(evt.getSource()==optionsButton){
            this.commandState = false;
            displayText.setText("<html><p>Available options: go to(appliance), walk to(room), look around, examine(item), grab(item), drop(item), declare(suspect), show report, check backpack</p></html>");
        }
        if(evt.getSource()==roomsButton){
            this.commandState = false;
            displayText.setText("<html><p>Available rooms: cleaner's dorm, nurse station, patient's ward, cleaning room, assistant dean's office, dean's office, investor's office </p></html>");
           
        }
        // if(evt.getSource()==relationshipButton){
        //     this.commandState = false;
        //     ImageIcon relaImage = new ImageIcon(new ImageIcon("relationship.png").getImage().getScaledInstance(500, 20, Image.SCALE_DEFAULT));
            
        //     //ImageIcon relaImage = new ImageIcon("relationship.png");
        //     JLabel relaLabel = new JLabel(relaImage); 
        //     relaLabel.setBounds(50, 50, 500, 300);
        //     //relaLabel.setIcon(imageIcon);
        //     remove(startLabel);
        //     add(relaLabel);
        //     setVisible(true);
            
        //     // remove(startLabel);
        //     // imageLabel.setIcon(relaImage);
           
        // }
        if(evt.getSource()==applyButton){
            this.currentCommand = userText.getText();
            this.commandState = true;
            userText.setText(null);
            System.out.print(currentCommand);
            
            //return userInput;
            
        }
      
    }

    public void changeText(String newText){
        displayText.setText(newText);
    }

    public String getCommand(){
        this.currentCommand = userText.getText();
        
        return this.currentCommand;
    }
    public boolean getCommandState(){
        return this.commandState;
    }
    public void restoreCommandState(){
        this.commandState = false;
    }
    
}