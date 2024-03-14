public class FinalDemo {
    final int MAX=12;
    FinalDemo(){
        MAX=10;
        System.out.println(MAX);
    }
    public static void main(String[] args) {
        FinalDemo demo = new FinalDemo();

    }
}
