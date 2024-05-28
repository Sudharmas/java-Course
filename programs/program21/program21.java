import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class program21 extends JFrame { //currencyconverter inheriting the JFrame class
    private JRadioButton usdButton, eurButton, inrButton;
    private JTextField inputField;
    private JLabel resultLabel;
    private ButtonGroup currencyGroup;
    private double usdToInr = 74.85;
    private double eurToInr = 88.25;

    public CurrencyConverter() { //constructor
//        setting the properties
        setTitle("Currency Converter");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        inputField = new JTextField(10);//initializing a textfield to take input  and  length of textfield should be 10 columns


        usdButton = new JRadioButton("USD");//initializing a button
        eurButton = new JRadioButton("EUR");// initializing a button
        inrButton = new JRadioButton("INR",true);// initializing a button,true means the value is selected by default

        currencyGroup = new ButtonGroup();//gather all buttons into a single group
        currencyGroup.add(usdButton);
        currencyGroup.add(eurButton);
        currencyGroup.add(inrButton);

//        setting layouts
        add(inputField);
        add(usdButton);
        add(eurButton);
        add(inrButton);

        JButton convertButton = new JButton("Convert");
        convertButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                double amount = Double.parseDouble(inputField.getText());//get the text value from inputfield and parse or convert the text into double value or number
                double convertedAmount = 0;
                if (usdButton.isSelected()) {//isselected is inbuilt function which checks whether the button is selected
                    convertedAmount = amount * usdToInr;
                } else if (eurButton.isSelected()) {
                    convertedAmount = amount * eurToInr;
                } else if (inrButton.isSelected()) {
                    convertedAmount = amount; // print the actual value of INR
                }
                resultLabel.setText("Converted Amount: " + convertedAmount);//set that text or answer resultlabel
            }
        });
        add(convertButton);//add last line to the output

        resultLabel = new JLabel("Converted Amount: ");
        add(resultLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new CurrencyConverter();
    }
}
