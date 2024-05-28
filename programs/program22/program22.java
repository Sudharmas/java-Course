import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class program22 extends JFrame {
    private JTextArea nameTextArea;
    private JRadioButton adultRadioButton, nonAdultRadioButton;
    private JCheckBox videoGamesCheckBox, fashionCheckBox, gymCheckBox;
    private JButton submitButton, clearButton;
    private JLabel resultLabel;

    public UserInputForm() { //constructor
        createUI();//function call
    }

    private void createUI() {
//        setting the properties like title,width,height etc...
        setTitle("Please fill all of the fields below");
        setLayout(new FlowLayout());
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        initializing the textarea
        nameTextArea = new JTextArea("Enter your name please", 1, 20);

       //label for buttons
        adultRadioButton = new JRadioButton("Adult");//initializing the radio buttons
        nonAdultRadioButton = new JRadioButton("Non-Adult");
        ButtonGroup group = new ButtonGroup();//creating a group of radio buttons
        group.add(adultRadioButton);//adding the radio buttons to the group
        group.add(nonAdultRadioButton);


        videoGamesCheckBox = new JCheckBox("Video Games");//initializing the checkboxes
        fashionCheckBox = new JCheckBox("Fashion");
        gymCheckBox = new JCheckBox("Gym");

        submitButton = new JButton("Submit");//initializing 2 buttons submit and clear
        clearButton = new JButton("Clear");

        resultLabel = new JLabel();//initializing the result label

//        setting the layout
        add(nameTextArea);//writing the layout
        add(new JLabel("Select Adult if you are 18 or over please"));
        add(adultRadioButton);
        add(nonAdultRadioButton);
        add(new JLabel("Select your hobbies please"));
        add(videoGamesCheckBox);
        add(fashionCheckBox);
        add(gymCheckBox);
        add(submitButton);
        add(clearButton);
        add(resultLabel);

        submitButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String name = nameTextArea.getText();//getting the string value or name
                String ageCategory = adultRadioButton.isSelected() ? "Adult" : "Non-Adult";//checking which radio button is selected and assigning the selected button value to the age category varible
                String hobbies = "";//empty string
                if (videoGamesCheckBox.isSelected()) hobbies += "Video Games ";// hobbies = Video Games
                if (fashionCheckBox.isSelected()) hobbies += "Fashion ";// hobbies = Video Games Fashion
                if (gymCheckBox.isSelected()) hobbies += "Gym ";// hobbies = Video Games Fashion Gym
                resultLabel.setText("<html>Name: " + name + "<br>Age Category: " + ageCategory + "<br>Hobbies: " + hobbies + "</html>");//setting the text of result label to all the values
            }
        });

        clearButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                nameTextArea.setText("");//set textarea to empty
                group.clearSelection();//unselect all the radio buttons
                videoGamesCheckBox.setSelected(false);//unselect them
                fashionCheckBox.setSelected(false);//unselect them
                gymCheckBox.setSelected(false);//unselect them
                resultLabel.setText("");//setting the result to empty
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                new UserInputForm().setVisible(true);
            }
        });
    }
}
