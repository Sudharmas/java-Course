class CustomThread extends Thread { //Thread is a inbuilt java package
     String threadName;

    public CustomThread(String name) { // constructor
        threadName = name;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(threadName + " is running with priority " + getPriority());
            try {
                Thread.sleep(1000);
//                sleep(200) -> the thread will sleep for 200 milliseconds
            }
            catch (InterruptedException e) {
                System.out.println(threadName + " interrupted." );
            }
        }
    }
}


public class MultiThreadExample {
    public static void main(String[] args) {
//        classaname oobjvar = new classname();
        CustomThread thread1 = new CustomThread("Thread 1");//creating objects and calling constructors
        CustomThread thread2 = new CustomThread("Thread 2");//creating objects
        CustomThread thread3 = new CustomThread("Thread 3");//creating objects

//        assigning priorities for thread1 ,thread2, thread3
        thread1.setPriority(Thread.MIN_PRIORITY); //  MIN_PRIORITY = 1 ; \
        // meaning -> setpriority is inbuilt function which is used to set the priority.
//        inside Thread there is a priority called as  MIN_PRIORITY = 1,and initialize the priority to minumum priority
//        therefore set the priority for thread1 as minimum value
        thread2.setPriority(Thread.NORM_PRIORITY); // NORM_PRIORITY = 5;
        thread3.setPriority(Thread.MAX_PRIORITY); // MAX_PRIORITY = 10;


        thread1.start(); //starting the thread, start() is a inbuilt function which will start the thread,therefore it will go to the run() function
        thread2.start(); //starting the thread
        thread3.start(); //starting the thread
    }
}
