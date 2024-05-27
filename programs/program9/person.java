import java.util.Scanner;

public class person {
    String name;
    int age;
    String adress;
    String phone;

    Scanner scan = new Scanner(System.in);

    public void getperson(){
        System.out.println("Enter name of person:");
        name = scan.next();
        System.out.println("Enter age of person:");
        age = scan.nextInt();
        System.out.println("Enter adress of person:");
        scan.nextLine();
        adress = scan.nextLine();
        System.out.println("Enter phone no of person:");
        phone = scan.next();
    }

    public void putperson(){
        System.out.println("Name of person:"+name);
        System.out.println("Age of person:"+age);
        System.out.println("Adress of person:"+adress);
        System.out.println("Phone no of person:"+phone);
    }
}
