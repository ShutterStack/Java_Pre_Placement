// yield() method.
class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread.");
            Thread.yield(); // if no yield(), there may be more number of times main thread will be
                            // executed.
        }
    }
}

public class YieldExample {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread.");
        }
    }
}
