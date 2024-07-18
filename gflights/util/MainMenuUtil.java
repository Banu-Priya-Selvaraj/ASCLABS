package gflights.util;


import java.util.Scanner;

public class MainMenuUtil {
    public static int displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to GFlights...");
        System.out.println("1. Book Flights");
        System.out.println("2. Display bookings");
        System.out.println("3. Search bookings by bookingId");
        System.out.println("4. Update bookings");
        System.out.println("5. Delete a booking");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        return choice;
    }
}

