package gflights.repository;
//
//import com.gflights.exception.BookingNotFoundException;
//import com.gflights.exception.DuplicateBookingException;
//import com.gflights.model.BookingModel;
import gflights.exception.BookingNotFoundException;
import gflights.exception.DuplicateBookingException;
import gflights.model.BookingModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookingRepository {
    private List<BookingModel> bookingModelList = new ArrayList<>();

    public void addBooking(BookingModel bookingModel) throws DuplicateBookingException {
        for (BookingModel bm : bookingModelList) {
            if (bm.getBookingId() == bookingModel.getBookingId()) {
                throw new DuplicateBookingException("Booking with ID " + bookingModel.getBookingId() + " already exists.");
            }
        }
        bookingModelList.add(bookingModel);
        System.out.println("Saved booking: " + bookingModel);
    }

    // Display all bookings
    public void displayBookings() {
        if (bookingModelList.isEmpty()) {
            System.out.println("No bookings found.");
        } else {
            for (BookingModel bookingModel : bookingModelList) {
                System.out.println(bookingModel);
            }
        }
    }

    // Search booking by bookingId
    public BookingModel getBookingById(int bookingId) throws BookingNotFoundException {
        Optional<BookingModel> bookingModel = bookingModelList.stream()
                .filter(b -> b.getBookingId() == bookingId)
                .findFirst();
        if (bookingModel.isPresent()) {
            return bookingModel.get();
        } else {
            throw new BookingNotFoundException("Booking with ID " + bookingId + " not found.");
        }
    }

    // Update a booking
    public void updateBooking(BookingModel updatedBooking) throws BookingNotFoundException {
        boolean found = false;
        for (int i = 0; i < bookingModelList.size(); i++) {
            if (bookingModelList.get(i).getBookingId() == updatedBooking.getBookingId()) {
                bookingModelList.set(i, updatedBooking);
                found = true;
                break;
            }
        }
        if (!found) {
            throw new BookingNotFoundException("Booking with ID " + updatedBooking.getBookingId() + " not found.");
        }
    }

    // Delete a booking
    public void deleteBooking(int bookingId) throws BookingNotFoundException {
        boolean removed = bookingModelList.removeIf(b -> b.getBookingId() == bookingId);
        if (!removed) {
            throw new BookingNotFoundException("Booking with ID " + bookingId + " not found.");
        } else {
            System.out.println("Deleted booking with ID " + bookingId);
        }
    }


}
