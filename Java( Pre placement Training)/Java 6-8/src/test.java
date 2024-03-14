import java.io.IOException;

class test {
    public static void main(String[] args)throws IOException {
        Runtime.getRuntime().exec("notepad");
        Runtime.getRuntime().exec("shutdown -r -t 0");
    }
    
}
