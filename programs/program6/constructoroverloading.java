public class constructoroverloading {

    public static void main(String[] args) {

        class1 obj1 = new class1();
        obj1.arithmatic();

        class1 obj2 = new class1();
        obj2.arithmatic();

        class1 obj3 = new class1(5,5);
        obj3.arithmatic();
    }
}


class class1{
    int a,b;
    class1(){ //constructor
        a = b = 1;
    }

    public void constructor1(int a,int b){
        System.out.println("variables used inside this class is "+a +" & "+b );
    }

    class1(int var){ //constructor var = 5
        a = var;
        b = var;
    }

    public void constructor2(int a,int b){
        System.out.println("variables used inside this class is "+a +"&"+ b);
    }

    class1(int x,int y){ //constructor
        a = x;
        b = y;
    }

    public void constructor3(int a,int b){
        System.out.println("variables used inside this class is "+a +" & "+ b );
    }


    public void arithmatic(){
        System.out.println("a + b =" + (a+b));
        System.out.println("a - b =" + (a-b));
        System.out.println("a * b =" + (a*b));
        System.out.println("a / b =" + (a/b));
//        int z = 10;
//        System.out.println("z = " + z);
    }
}

// class1   a = b =1
//class1    a = b = var;
//class1    a = x and b = y
//constructor1   a and b
//constructor1   a and b
//constructor1   a and b
