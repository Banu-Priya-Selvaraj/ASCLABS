package LAB5;

public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            try {
                int result = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Caught ArithmeticException: " + e.getMessage());
            }

            int[] arr = new int[5];
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block, it always executes.");
        }
    }
}

