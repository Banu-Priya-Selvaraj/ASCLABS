package LAB5;

public class ThrowAndThrows {
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (Throwable e) {
            System.out.println("Caught CustomException: " + e.getMessage());
        }
    }

    public static void checkAge(int age) throws Throwable {
        if (age < 18) {
            throw new Throwable("Age less than 18 is not allowed.");
        } else {
            System.out.println("Age is fine.");
        }
    }
}

