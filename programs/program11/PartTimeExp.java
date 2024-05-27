package inheritance;

class PartTimeEmp extends Employee{ // parttimeemp is inheriting the employee , parentclass-employee,child class - parttimeemp
    int hourlywage;
    int hoursWorked;
    PartTimeEmp(int hourlywage,int hoursWorked,int eno,String ename){ // constructor - same name as classname,always inside the class
        super(eno,ename);// sending the values to the constructor of the parent class - Employee
        this.hourlywage = hourlywage;// assign the parameter value to variable inside "this" class.
        // this class is having a variable called hourlywage,assign the value of hourlywage to the hourlywage.
        this.hoursWorked = hoursWorked;
    }

    public void display(){
        super.display();//calling the function inside the parent class.
        int totalsalary = hourlywage*hoursWorked;
        System.out.println("wages per hour is:"+hourlywage);
        System.out.println("Worked hours is:"+hoursWorked);
        System.out.println("Total salary is:"+totalsalary);
    }

    public static void main(String[] args) {
        PartTimeEmp obj = new PartTimeEmp(2000,18,145,"Sudharma");
        obj.display();//function call.
    }
}

//employee
//parttimeemp -obj