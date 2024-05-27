package Interfaces;

class circle implements common{ // circle is implementing the common or circle is implementing the properties of common interface
    int radius;
    double area;
    circle(int radius){ //constructor
        this.radius = radius;//this.radius = radius ,parameter name and variable name
//        this keyword says that the variable inside "this class" should be assigned to some value.
    }

    public void calculate(){
        area = (pi*radius*radius);
        System.out.println("area of circle is:"+area);
    }
}

// while inheriting a class we use "extends" keyword,which means we are extending or inheriting a class
//parent
//child
//grandchild

// in interfaces we use "implements" keyword,which means we are implementing a class based on an interface.

//property - vehicle - door,seat,window
//class1 - car - door,seat,window,black glasses,turbo engines
//class2 - bus