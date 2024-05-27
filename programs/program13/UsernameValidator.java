import java.util.Scanner;

// Custom exception class
class UsernameException extends Exception { // USernameException is inheriting the Exception class,you are creating your own exception by inheriting the exception class
    public UsernameException(String message) { //constructor
        super(message); // sending the values to parent class,parent class - Exception
    }
}

public class UsernameValidator {
    // Method to validate username
    public static void validateUsername(String username) throws UsernameException {
        if (username.length() < 8) {
            throw new UsernameException("Username must be at least 8 characters long.");
        }
        if (!username.matches(".*[a-zA-Z].*") || !username.matches(".*[0-9].*")) {//whether the username has letters from a-z and A-Z or whether the username has numbers from 0-9
            throw new UsernameException("Username must contain both alphabets and digits.");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// take input from the user

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        try {
            validateUsername(username);//function call
            System.out.println("Username is valid.");
        }
        catch (UsernameException e) {
            System.out.println("Invalid username: " + e.getMessage());
        }
    }
}
