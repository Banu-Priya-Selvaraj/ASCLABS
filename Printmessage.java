import java.util.Scanner;

public class Printmessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + ", Welcome to Java World! ");
        scanner.close();
    }
}
