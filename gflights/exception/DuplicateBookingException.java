package gflights.exception;

public class DuplicateBookingException extends Exception {
    public DuplicateBookingException() {
        super();
    }

    public DuplicateBookingException(String message) {
        super(message);
    }

    public DuplicateBookingException(String message, Throwable cause) {
        super(message, cause);
    }

    public DuplicateBookingException(Throwable cause) {
        super(cause);
    }
}

