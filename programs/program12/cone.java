package Interfaces;

public class cone implements common{ // cone is implementing the common interface,its is implementing the properties of common
    int radius,height;
    double volume;
    cone(int radius,int height){ //constructor
        this.radius = radius;
        this.height = height;
    }
    public void calculate(){
        volume = (pi*radius*radius*height)/3;
        System.out.println("Volume of cone is:"+volume);
    }
}
//if both the function names are same,it will throw an error
//but here both circle and cone are having same function names,it is not giving an error,because we not overriding the methods ,we are just implementing the methods.
// interface ia used to implement something