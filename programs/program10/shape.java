package abstractclass;//this is a folder name ,in java we call folders as packages

abstract class shape {
    int a,b;
    shape(int a,int b){
        this.a=a;
        this.b = b;
    }
    void area(){};
}

// abstract class is like a container for variables and methods and we can use those methods and variables in any other classes by extending them
// shape - container - abstract class
// a , b and area - variables and methods
// sugar - keep in a jar
// tea - use sugar
// coffee - use sugar
// payasa - use sugar
// sambar - do not use sugar