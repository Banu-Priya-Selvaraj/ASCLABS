

package gflights.ui;

//import gflights.model.BookingModel;
//import gflights.repository.BookingRepository;
//import gflights.util.MainMenuUtil;
//import gflights.util.MenuUtil;
//import gflights.exception.BookingNotFoundException;
//import gflights.exception.DuplicateBookingException;
import gflights.exception.BookingNotFoundException;
import gflights.exception.DuplicateBookingException;
import gflights.model.BookingModel;
import gflights.repository.BookingRepository;
import gflights.util.MainMenuUtil;
import gflights.util.MenuUtil;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookingRepository bookingRepository = new BookingRepository();
        boolean exit = false;

        while (!exit) {
            int choice = MainMenuUtil.displayMainMenu();
            switch (choice) {
                case 1:
                    BookingModel bookingModel = MenuUtil.bookFlights();
                    try {
                        bookingRepository.addBooking(bookingModel);
                    } catch (DuplicateBookingException e) {
                        System.err.println("Error: " + e.getMessage());
                    }
                    break;
                case 2:
                    bookingRepository.displayBookings();
                    break;
                case 3:
                    System.out.print("Enter a Booking ID to Search: ");
                    int searchId = scanner.nextInt();
                    try {
                        BookingModel searchedBooking = bookingRepository.getBookingById(searchId);
                        System.out.println("Found Booking: " + searchedBooking);
                    } catch (BookingNotFoundException e) {
                        System.err.println("Error: " + e.getMessage());
                    }
                    break;
                case 4:
                    System.out.print("Enter a Booking ID to Update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    try {
                        BookingModel existingBooking = bookingRepository.getBookingById(updateId);
                        System.out.println("Current Booking: " + existingBooking);
                        BookingModel updatedBooking = MenuUtil.bookFlights();
                        updatedBooking.setBookingId(updateId);
                        bookingRepository.updateBooking(updatedBooking);
                        System.out.println("Updated Booking: "+ updatedBooking);
                    } catch (BookingNotFoundException e) {
                    System.err.println("Error: " + e.getMessage());
                }
                break;
                case 5:
                    System.out.print("Enter a Booking ID to Delete: ");
                    int deleteId = scanner.nextInt();
                    try {
                        bookingRepository.deleteBooking(deleteId);
                    } catch (BookingNotFoundException e) {
                        System.err.println("Error: " + e.getMessage());
                    }
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting GFlights...");
                    break;
                default:
                    System.out.println("Invalid Choice.Make a choice from 1 to 6");
            }

        }
    }
}


