//Program to illustrate method overloading (area of 3 shapes)

public class methodoverloading {

    public static void main(String[] args) {
        triangle t = new triangle();
        rectangle r =  new rectangle();
        square s = new square();

        int area1 = t.area(5,4);
        int area2 = r.area(5,3);
        int area3 = s.area(5);

        System.out.println("area of triangle  is "+area1);
        System.out.println("area of rectangle  is "+area2);
        System.out.println("area of square  is "+area3);

    }
}

class triangle{
    public int area(int b, int h){
        return (b*h)/2;// 0.5*b*h;
    }
}

class rectangle{
    public int area(int l, int b){
        return l*b;
    }
}

class square{
    public int area(int a){
        return a*a;
    }
}

//change the number of parameters inside function declaration
//data type should be change,if one data type is int another functions data type should be float or double or string or char