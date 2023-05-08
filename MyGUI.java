import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JButton;


/**
 * GUI class
 */
public class MyGUI extends Frame implements ActionListener {

    JTextField userText;
    JLabel displayText;
    JLabel startLabel;
    JLabel roomLabel;
    JLabel relaLabel;
    JButton roomsButton;
    JButton optionsButton;
    JButton applyButton;
    JButton relationshipButton;
    JButton mapButton;
    String currentCommand;
    public boolean commandState;

    /**
     * Constructor of GUI class 
     */
    public MyGUI() {

        this.commandState = false;
        this.currentCommand = "show rooms";

        userText = new JTextField();
        userText.setBounds(50, 700, 450, 50);

        displayText = new JLabel();
        displayText.setBounds(50, 250, 300, 450);
        displayText.setText("<html><p>Welcome to Who's the Murder! In this game, you are the detective to find out the truth behind a crime.<br><br /> On 2016.5.20, the cosmetic surgery hospital was on fire. The dead body of the dean was found by a cleaner in the dean's office whose upper body is charred.</p></html>");
        displayText.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        //displayText.setHorizontalAlignment(SwingConstants.CENTER);
        displayText.setVerticalAlignment(SwingConstants.TOP);

        roomsButton = new JButton("Show Rooms");
        roomsButton.setBounds(50, 70, 150, 50);
        roomsButton.addActionListener(this);

        optionsButton = new JButton("Show Options");
        optionsButton.setBounds(50, 150, 150, 50);
        optionsButton.addActionListener(this);

        relationshipButton = new JButton("Relationship Diagram");
        relationshipButton.setBounds(250, 70, 170, 50);
        relationshipButton.addActionListener(this);

        mapButton = new JButton("Room Map");
        mapButton.setBounds(250, 150, 170, 50);
        mapButton.addActionListener(this);

        applyButton = new JButton("Apply");
        applyButton.setBounds(600, 800, 150, 50);
        applyButton.addActionListener(this);


        ImageIcon startImage = new ImageIcon("murder.jpeg");

        ImageIcon roomImage = new ImageIcon("room_map.png");
        ImageIcon relaImage = new ImageIcon("relationship.png");

        this.startLabel = new JLabel(startImage); 
        this.startLabel.setBounds(350, 50, 1200, 700);
        this.roomLabel = new JLabel(roomImage); 
        this.roomLabel.setBounds(350, 50, 1200, 700);
        this.relaLabel = new JLabel(relaImage); 
        this.relaLabel.setBounds(350, 50, 1200, 700);
        
        

        add(startLabel);
        add(optionsButton);
        add(userText);
        add(displayText);
        add(roomsButton);
        add(applyButton);
        add(relationshipButton);
        add(mapButton);

        setPreferredSize(new Dimension(1500, 1000));
        setSize(getPreferredSize());
        
        setLayout(null);
        setVisible(true);
       
    }

    /**
     * Litsen to the button click actions and respond
     * @param evt the actions players take
     */
    public void actionPerformed(ActionEvent evt) {
        if(evt.getSource()==optionsButton){
            this.commandState = false;
            displayText.setText("<html><p>Available options: go to(room), go to(appliance), look around, examine(item), grab(item), drop(item), declare(suspect), show report, check backpack</p></html>");
        }
        if(evt.getSource()==roomsButton){
            this.commandState = false;
            displayText.setText("<html><p>Available rooms: cleaner's dorm, nurse station, patient's ward, cleaning room, assistant's office, dean's office, investor's office </p></html>");
           
        }
        if(evt.getSource()==relationshipButton){
            this.commandState = false;
            setVisible(false);
            remove(startLabel);
            remove(roomLabel);
            add(relaLabel);
            setVisible(true);  
        }
        if(evt.getSource()==mapButton){
            this.commandState = false;
            setVisible(false);
            remove(startLabel);
            remove(relaLabel);
            add(roomLabel);
            setVisible(true);  
        }

        if(evt.getSource()==applyButton){
            this.currentCommand = userText.getText();
            this.commandState = true;
            userText.setText(null);
            System.out.print(currentCommand);
            
            
        }
      
    }

    /**
     * change display text Jlabel to new text
     * @param newText
     */
    public void changeText(String newText){
        displayText.setText(newText);
    }

    /**
     * Getter of user's command
     * @return String command content
     */
    public String getCommand(){
        this.currentCommand = userText.getText();
        
        return this.currentCommand;
    }

    /**
     * Getter of command state
     * @return whether users has placed a command/click apply
     */
    public boolean getCommandState(){
        return this.commandState;
    }

    /**
     * Setter of command state, change command state to false
     */
    public void restoreCommandState(){
        this.commandState = false;
    }
    
}
