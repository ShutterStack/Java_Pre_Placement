// join() method.
class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread.");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
            }
        }
    }
}

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
        t.join(); // main thread calls child thread to join, and will wait until completing child
                  // thread.
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread.");
        }
    }
}
