package inheritance;

public class Employee {
    int eno;
    String ename;
    Employee(int eno,String ename){  //contructor - will take values from child class and initialize them
        this.eno = eno;
        this.ename = ename;
    }
    public void display(){
        System.out.println("Employee number is :"+eno);//12345
        System.out.println("Employee name is :"+ename);// ravi
    }
}

