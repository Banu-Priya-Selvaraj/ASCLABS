public class SpecialMovie extends Movie {
    private String soundEffects;
    private String visualEffects;

    // Constructor with mandatory fields and additional attributes
    public SpecialMovie(String movieName, String producedBy, String soundEffects, String visualEffects) {
        super(movieName, producedBy);
        this.soundEffects = soundEffects;
        this.visualEffects = visualEffects;
    }

    // Constructor with all fields and additional attributes
    public SpecialMovie(String movieName, String producedBy, String directedBy, int duration, int year, String category, String soundEffects, String visualEffects) {
        super(movieName, producedBy, directedBy, duration, year, category);
        this.soundEffects = soundEffects;
        this.visualEffects = visualEffects;
    }

    // Method to display information

    public void displaySpecialMovie() {
        displayMovieDetails();
        System.out.println("Sound Effects: " + soundEffects);
        System.out.println("Visual Effects: " + visualEffects);
    }
    public String showDetails() {
        String details = super.showDetails();
        details += "Sound Effects: " + soundEffects + "\n";
        details += "Visual Effects: " + visualEffects + "\n";
        return details;
    }
}

