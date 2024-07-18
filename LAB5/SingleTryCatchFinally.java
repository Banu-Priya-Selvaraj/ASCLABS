package LAB5;

// Single try..catch..finally block
public class SingleTryCatchFinally {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block, it always executes.");
        }
    }
}

