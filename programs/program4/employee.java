import java.util.Scanner;

public class employee {

        String id;// abc123
        String name;//sudharma
        int salary;//2000000
        String designation;//softdev.engineer
        int allowance;//2000

        Scanner scan = new Scanner(System.in);
//        public/private/protected void/int/String/char function_name
        public void getemployee(){
            System.out.println("Enter Name of Employee");
            name = scan.nextLine();
            System.out.println("Enter ID of Employee");
            id = scan.nextLine();
            System.out.println("Enter Designation of Employee");
            designation = scan.nextLine();
            System.out.println("Enter Salary of Employee");
            salary = scan.nextInt();//  6000
        }

        public void calculate(){
            if(salary<=5000){//  6000<=5000
                allowance = (salary*10)/100;
            } else if (salary>5000 && salary<=10000) { // if both conditions are true,the && will return true. 6000>5000 && 6000<=10000
                allowance = (salary*15)/100;//(6000*15)/100 = 90000/100 = 900;
            }else if (salary>10000 && salary<=20000) {
                allowance = (salary*20)/100;
            }else if (salary>20000) {
                allowance = (salary*25)/100;
            }
        }
//        (10000*10) /100;
        public void putstudent(){
            System.out.println("Name of the employee:"+name);
            System.out.println("ID of the employee:"+id);
            System.out.println("designation of the employee:"+designation);
            System.out.println("salary of the employee:"+salary);
            System.out.println("allowance of the employee:"+allowance);
        }

}


