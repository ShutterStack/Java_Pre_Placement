class MyClass extends Thread
{
    public void run()
    {
        try{
            for(int i=0;i<5;i++){
                System.out.println("Child Thread");
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("InterruptedException is occured");
        }
    }
}


class sleepfun {
    public static void main(String[] args)throws InterruptedException {
        MyClass thread = new MyClass();
        thread.start();
        thread.interrupt();
        for(int i=0;i<5;i++){
            System.out.println("Main Thread");
            Thread.sleep(1000);
        }

        
    }
}
