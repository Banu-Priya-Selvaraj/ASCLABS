package LAB5;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LearningModule lm = new LearningModule();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        try {
            String learningCode = lm.getLearningCode(name, age);
            System.out.println("Learning Code: " + learningCode);
        }
        catch (WrongInputException e) {
            System.err.println("Error: " + e.getMessage());
        }

    }
}

