class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;//incrementing the value of count
    }

    public int getCount() {
        return count;//returning the value of count
    }
}

class CounterThread extends Thread { //inheriting the Thread class
    private Counter counter;//initializing a variable of type Counter which is our classname

    public CounterThread(Counter counter) { //constructor
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.increment();//calling the function and incrementing the value of count inside the function
            System.out.println(Thread.currentThread().getName() + " incremented count to: " + counter.getCount());//counter.getcount() will call the function getcount() which is inside the Counter class
//            currentThread().getName() -> it will give you the name of current thread which is being executed,or which is running
        }
    }
}

public class synchronize {
    public static void main(String[] args) {
        Counter counter = new Counter();//creating a object for Counter class

        CounterThread t1 = new CounterThread(counter);//creating the objects for counterThread class
        CounterThread t2 = new CounterThread(counter);

        t1.start();
        t2.start();
    }
}
