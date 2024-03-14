class MyThread extends Thread{
    public void main(){
        for(int i=1;i<=10;i++)
        {
            System.out.println("child Thread");
            Thread.yield();
        }
    }
}

class yeildmeth {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        for(int i=1;i<=10;i++)
        {
            System.out.println("main thread");
        }
    }
    
}
