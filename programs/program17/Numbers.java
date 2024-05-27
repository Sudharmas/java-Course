import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) throws IOException {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

//        String numbersFileName = "numbers.txt";
//        String evenFileName = "even.txt";
//        String oddFileName = "odd.txt";

        // Write the array of integers to the "numbers" file
//      FileWriter (any variable name) = new FileWriter("filename");
        FileWriter numbersFileWriter = new FileWriter("numbers.txt"); // numbersFileWriter variable is initialized to the filename clalled numbers.txt
        for (int number : numbers) { // for each elements inside numbers array ,write the numbers numbers.txt
            numbersFileWriter.write(number + "\n");//numbers.txt.write()
        }
        numbersFileWriter.close();//closing the numbers.txt file

        // Initialize files for even and odd numbers
        FileWriter evenFileWriter = new FileWriter("even.txt");
        FileWriter oddFileWriter = new FileWriter("odd.txt");

        // Read from "numbers" file and write to "even" and "odd" files
        Scanner scanner = new Scanner(new File("numbers.txt"));// take the input from the file called numbers.txt
        while (scanner.hasNextInt()) { //it will go on executing the loop until the file has nextline or next integer
            int number = scanner.nextInt();//initializing the variable number to the integer present inside the numbers.txt
            if (number % 2 == 0) { // this will return the reminder
                evenFileWriter.write(number + "\n");//writing it to the even.txt file
            }
            else {
                oddFileWriter.write(number + "\n");//writing the number the odd.txt file
            }
        }
        scanner.close();
        evenFileWriter.close();
        oddFileWriter.close();
    }
}
