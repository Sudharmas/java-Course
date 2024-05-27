import java.util.Scanner;

class Employe extends person{
    String desig;
    int salary;

    float allowance;

    public static void main(String[] args) {
        Employe obj = new Employe();
        obj.getEmployee();
        obj.putEmployee();
    }

    public void getEmployee(){
        getperson();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter designation of employee:");
        scan.next();
        desig = scan.nextLine();
        System.out.println("Enter salary of employee:");
        salary = scan.nextInt();
        System.out.println("Enter percentage of Allowance for employee:");
        allowance = scan.nextFloat();
    }



    public void putEmployee(){
        putperson();
        System.out.println("Designation of employee:"+desig);
        System.out.println("salary of employee:"+salary);
        allowance = (salary * allowance)/100;
        System.out.println("Allowance of employee:"+allowance);
    }

}