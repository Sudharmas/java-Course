import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the month in 3 letters(first 3 letters in lower case)");
        while(true){
            System.out.println(" january-jan february-feb march-mar \n april-apr may-may june-jun \n july-jul august-aug september-sep \n october-oct november-nov december-dec");
            System.out.println("Type exit to exit the program");
//            String s = "hello";
//            enter a string : sudharma
//            scan.nextInt();
            String s = scan.nextLine();
            switch (s){
                case "jan"://true
                case "feb"://false
                case "mar"://false
                    System.out.println("the months are in the first quadrant");
                    break;
                case "apr":
                case "may":
                case "jun":
                    System.out.println("the months are in the second quadrant");
                    break;
                case "jul":
                case "aug":
                case "sep":
                    System.out.println("the months are in the third quadrant");
                    break;
                case "oct":
                case "nov":
                case "dec":
                    System.out.println("the months are in the fourth quadrant");
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("enter the correct month name");
                    break;
            }

        }

    }
}
