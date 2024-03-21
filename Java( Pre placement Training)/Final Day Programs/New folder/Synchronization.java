class A {
    public static synchronized void print(String name) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Batting = " + name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread1 extends Thread {
    public void run() {
        A.print("Sachin");
    }
}

class MyThread2 extends Thread {
    public void run() {
        A.print("Dhoni");
    }
}

class MyThread3 extends Thread {
    public void run() {
        A.print("Virat");
    }
}

class MyThread4 extends Thread {
    public void run() {
        A.print("Jarjish");
    }
}

public class Synchronization {
    public static void main(String args[]) {
        new MyThread1().start();
        new MyThread2().start();
        new MyThread3().start();
        new MyThread4().start();
    }
}
