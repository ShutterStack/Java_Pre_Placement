// daemon thread.
class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Daemon Thread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}

public class DaemonExample {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.setDaemon(true); // setting daemon nature to Thread.
        t.start();
        // main thread logic.
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}