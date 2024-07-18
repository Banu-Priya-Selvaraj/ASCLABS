package gflights.util;



//import com.gflights.model.BookingModel;
import gflights.model.BookingModel;

import java.util.Scanner;

public class MenuUtil {
    public static BookingModel bookFlights() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Booking Id: ");
        int bookingId = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        System.out.print("Enter Source: ");
        String source = scanner.nextLine();

        String destination;
        while (true) {
            System.out.print("Enter Destination: ");
            destination = scanner.nextLine();
            if (!source.equalsIgnoreCase(destination)) {
                break;
            } else {
                System.out.println("Source and Destination cannot be the same. Please enter a different destination.");
            }
        }
        System.out.print("Enter Ticket Class: ");
        String ticketClass = scanner.nextLine();

        System.out.print("Enter Number of Passengers: ");
        int noOfPassengers = scanner.nextInt();

        System.out.print("Is it a Round Trip (true/false): ");
        boolean roundTrip = scanner.nextBoolean();

        return new BookingModel(bookingId, source, destination, ticketClass, noOfPassengers, roundTrip);
    }
}
