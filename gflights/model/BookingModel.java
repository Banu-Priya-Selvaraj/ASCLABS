package gflights.model;


public class BookingModel {
    private int bookingId;
    private String source;
    private String Destination;
    private String ticketClass;
    private int noOfPassengers;
    private boolean roundTrip;

    public BookingModel(){}

    public BookingModel(int bookingId,String source,String Destination,String ticketClass,int noOfPassengers,boolean roundTrip){
        this.bookingId=bookingId;
        this.source=source;
        this.Destination=Destination;
        this.ticketClass=ticketClass;
        this.noOfPassengers=noOfPassengers;
        this.roundTrip=roundTrip;
    }

    public int getBookingId(){
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public String getTicketClass() {
        return ticketClass;
    }

    public void setTicketClass(String ticketClass) {
        this.ticketClass = ticketClass;
    }

    public int getNoOfPassengers() {
        return noOfPassengers;
    }

    public void setNoOfPassengers(int noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }

    public boolean isRoundTrip() {
        return roundTrip;
    }

    public void setRoundTrip(boolean roundTrip) {
        this.roundTrip = roundTrip;
    }
    @Override
    public String toString(){
        return "BookingModel{" +
                "bookingId=" + bookingId +
                ", source='" + source + '\'' +
                ", destination='" + Destination + '\'' +
                ", ticketClass='" + ticketClass + '\'' +
                ", noOfPassengers=" + noOfPassengers +
                ", roundTrip=" + roundTrip +
                '}';
    }
}
