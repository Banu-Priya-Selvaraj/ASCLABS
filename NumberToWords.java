import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int number = scanner.nextInt();
        numberToWords(number);
    }
    public static void numberToWords(int number) {
        String[] digitWords = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int units = number % 10;
        System.out.println(digitWords[hundreds] + " " + digitWords[tens] + " " + digitWords[units]);
    }
}
