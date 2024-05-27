import java.io.*;
import java.util.Scanner;

public class PersonData {
    public static void main(String[] args) throws IOException {
        // Write to the file using FileWriter

        FileWriter writer = new FileWriter("persons.txt");//new writer variable initialized to filename called persons.txt
        writer.write(new Person("Alice", 30, "Dubai") + "\n");//calling the constructor and printing the values to person.txt
        writer.write(new Person("Bob", 25, "Abu Dhabi") + "\n");
        writer.write(new Person("Emily", 35, "Dubai") + "\n");
        writer.write(new Person("william", 24, "Canada") + "\n");
        writer.write(new Person("george", 23, "USA") + "\n");
        writer.write(new Person("Sandy", 34, "Nethrlands") + "\n");
        writer.write(new Person("Bobby", 27, "Dubai") + "\n");
        writer.write(new Person("Cruze", 29, "Dubai") + "\n");
        writer.write(new Person("David", 35, "UAE")+ "\n");
        writer.write(new Person("Sam", 29, "Abu Dhabi") + "\n");

        writer.close();
//
//entire data is in persons.txt
// Read from the file using FileReader and Scanner
//        FileReader is a inbuilt class in java which is used to read a file
        FileReader reader = new FileReader("persons.txt");// all data is present in persons.txt
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNextLine()) { //it is checking whether there is next line present inside the file
            String line = scanner.nextLine();//line -> initilaized to line which is next to cursor
//            line = sudharma,25,UAE
            String[] data = line.split(",");//data = [ sudharma 25 UAE ]
//            initializing a array named data , sudharma,30,india ->split this values to single values { sudharma , 30 , india }
            if (data[2].trim().equals("Dubai")||data[2].trim().equals("Abu Dhabi")||data[2].trim().equals("UAE")) {
                System.out.println(line);
            }
        }
        scanner.close();
        reader.close();
    }

    static class Person {
        String name;
        int age;
        String emirate;

        public Person(String name, int age, String emirate) { //constructor
            this.name = name;
            this.age = age;
            this.emirate = emirate;
        }//first step call the constructor and initialize values

        public String toString() { // second step is directly executed and the name,age,emirate is printed on person.txt file
            return name + ", " + age + ", " + emirate;// sudharma,30,india
        }
    }
}
