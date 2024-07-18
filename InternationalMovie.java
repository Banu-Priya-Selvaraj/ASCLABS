public class InternationalMovie extends Movie {
    private String country;
    private String language;

    // Constructor with mandatory fields and international attributes
    public InternationalMovie(String movieName, String producedBy, String country, String language) {
        super(movieName, producedBy); // Call to the Movie constructor
        this.country = country;
        this.language = language;
    }

    // Constructor with all fields
    public InternationalMovie(String movieName, String producedBy, String directedBy, int duration, int year, String category, String country, String language) {
        super(movieName, producedBy, directedBy, duration, year, category); // Call to the Movie constructor
        this.country = country;
        this.language = language;
    }

    // Method to display international movie details
    public void displayInternationalMovieDetails() {
        displayMovieDetails(); // Call the superclass method
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
    }
    public String showDetails() {
        String details = super.showDetails();
        details += "Country: " + country + "\n";
        details += "Language: " + language + "\n";
        return details;
    }
}

