package abstractclass;

//triangle is also child of shape,because it is inheriting the shape.
class triangle extends shape {
    triangle(int a,int b){
        super(a,b);// just send a and b.sending a and b to parent class(shape).
    }

    void area(){
        double area = (0.5)*a*b;
        System.out.println("Area of Triangle:"+area);
    }
}

