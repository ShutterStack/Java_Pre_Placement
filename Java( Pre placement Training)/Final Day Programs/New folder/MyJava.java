public class MyJava {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "\t");
            Thread.sleep(1000);
        }
    }
}
