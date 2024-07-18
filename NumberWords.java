import java.util.HashMap;
import java.util.Scanner;

public class NumberWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Zero", 0);
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        map.put("Five", 5);
        map.put("Six", 6);
        map.put("Seven", 7);
        map.put("Eight", 8);
        map.put("Nine", 9);

        for (String i : map.keySet()) {
            System.out.println(i+map.get(i));
        }
    }
}
