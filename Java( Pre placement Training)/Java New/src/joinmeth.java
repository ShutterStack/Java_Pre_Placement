class MyThread extends Thread{
    public void run(){
        for(int i=1;i<10;i++)
        {
            System.out.println("child thread");
            try{
                Thread.sleep(100);

            }
            catch(InterruptedException ie){}
        }
    }
}

public class joinmeth {
    public static void main(String[] args)throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
        t.join();
        for(int i=1;i<=10;i++)
        {
            System.out.println("main Thread");
        }
    }    
}
