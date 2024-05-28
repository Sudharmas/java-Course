import java.awt.*;
import java.awt.event.*;
public class program20 {


    public static class EmailRegistrationApp extends Frame implements ActionListener { //Emailregistrationapp is extending the Frame class which is implementing the Actionlistener interface
        private TextField usernameField;
        private Button validateButton;
        private Label resultLabel;

        public EmailRegistrationApp() { //constructor
//            setting properties
            setTitle("Email Registration");
            setSize(400, 200);
            setLayout(new FlowLayout());

            Label usernameLabel = new Label("Enter username:");//creating a variable for a label
            usernameField = new TextField(20);
            validateButton = new Button("Validate");
            resultLabel = new Label("");

            validateButton.addActionListener(this);//when the button is clicked some action is recorded and some operation is performed

//            setting the layout
            add(usernameLabel);
            add(usernameField);
            add(validateButton);
            add(resultLabel);

            setVisible(true);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent we) {
                    dispose();//whenever i click on close symbol ,it should terminate
                }
            });

        }

        public void actionPerformed(ActionEvent e) {
            String username = usernameField.getText();//getting the text from Textfield and storing inside variable username
            if (isValidUsername(username)) {
                resultLabel.setText("Success! Your email id is " + username + "@myemail.com");//after validation setting the value of result to succes....
            } else {
                resultLabel.setText("Failed! Username does not meet the requirements");//if condition dosnot match,then print this line or result = failed....
            }
        }

        private boolean isValidUsername(String username) {//return either true or false
            return username.matches("^[A-Z][a-z,A-Z0-9]{7,}$");//pattern is first letter of username should be capital,second pattern should contain small letters and numbers,thrid pattern is size of usernaame greater than 7
//        if the condtition mathches the pattern then it will true ,else it will return false
        }

        public static void main(String[] args) {
            new EmailRegistrationApp();
        }
    }

}
