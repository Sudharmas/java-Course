package abstractclass;

//rectangle is child of shape,because rectangle is inheriting the shape
class rectangle extends shape {
    rectangle(int a,int b){
        super(a,b);// just sending a and b .sending a and b to parent class.
    }

    void area(){
        int area = a*b;// 5 * 5
        System.out.println("Area of rectangle:"+area);
    }
}

//rectangle - tea
// a b area()