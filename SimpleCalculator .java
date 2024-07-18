import java.util.Scanner;

class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");

        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            }else {
                System.out.println("Error: Division by zero is not allowed.");
                scanner.close();
                return;
            }
        } else {
            System.out.println("Invalid operator. Please choose a valid operation.");
            scanner.close();
            return;
        }
        System.out.println("Result: " + num1  + operator + num2 + " = " + result);


    }
}
