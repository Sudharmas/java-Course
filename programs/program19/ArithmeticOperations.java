import java.awt.*;
import java.awt.event.*;

public class ArithmeticOperations extends Frame implements ActionListener { // arithmeticoperations is inherting th Frame class which is implementing the ActionListener interface
    TextField number1, number2, result;
    Button add, subtract, multiply, divide;

    public ArithmeticOperations() { //constructor
        // Create components
//        variable = new textfield/button/checkbox......etc..
        number1 = new TextField();
        number2 = new TextField();
        result = new TextField();
        result.setEditable(false); // Result field should not be editable
        add = new Button("+");
        subtract = new Button("-");
        multiply = new Button("*");
        divide = new Button("/");

        // Set layout and add components
        setLayout(new FlowLayout());
//        setting the layout,or you are designing the layout such that where should be the boxes and buttons should be present
        add(number1);
        add(number2);
        add(add);
        add(subtract);
        add(multiply);
        add(divide);
        add(result);

        // Add action listeners
        add.addActionListener(this);// the actionlistener is listening to "this" operation or button press
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);

        // Set Frame properties
        setTitle("Arithmetic Operations");
        setSize(400, 200);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();//whenever i click on close symbol ,it should terminate
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        double num1, num2, res = 0;
        String op = ae.getActionCommand();


            num1 = Double.parseDouble(number1.getText());//whatever the value inside number1 textfield covert or parse into double data type
            num2 = Double.parseDouble(number2.getText());

            switch (op) {
                case "+": res = num1 + num2; break;
                case "-": res = num1 - num2; break;
                case "*": res = num1 * num2; break;
                case "/": res = num1 / num2; break;
            }

            result.setText(String.valueOf(res));//converting the valueof res to text and after that printing inside result box

    }

    public static void main(String[] args) {
        new ArithmeticOperations();
    }
}
