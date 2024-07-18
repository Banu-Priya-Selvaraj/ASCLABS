import java.util.Arrays;

public class Exception extends Throwable {
    public static void main(String[] args) {
        String test="Hello";
        String uppercase=test.toUpperCase();
        System.out.println(uppercase);
        called();
        System.out.println("Finished the program");

    }
    private static void called(){
    }
}
