package Interfaces;

public class mainclass {
    public static void main(String[] args) {
//        interface object = new classname();
        common c1 = new circle(5);// we are creating object for interface common which is implemented by circle
        c1.calculate();// calling the calculate function of circle
        common c2 = new cone(5,3);
        c2.calculate(); // calling the calculate function of cone.
    }
}
