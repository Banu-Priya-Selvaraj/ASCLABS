public class Movie {
    private String movieName;
    private String producedBy;
    private String directedBy;
    private int duration; // duration in minutes
    private int year;
    private String category;
    private static int moviesCount = 0; // Static variable to keep track of the number of movies
    private final String movieId; // Read-only variable

    // Constructor with mandatory fields
    public Movie(String movieName, String producedBy) {
        if (movieName == null || producedBy == null) {
            throw new IllegalArgumentException("Movie name and produced by are mandatory fields.");
        }
        this.movieName = movieName;
        this.producedBy = producedBy;
        moviesCount++; // Increment the movies count whenever a new Movie object is created
        this.movieId = generateMovieId(); // Initialize movieId
    }

    // Constructor with all fields
    public Movie(String movieName, String producedBy, String directedBy, int duration, int year, String category) {
        this(movieName, producedBy); // Call to the mandatory fields constructor
        this.directedBy = directedBy;
        this.duration = duration;
        this.year = year;
        this.category = category;
    }

    // Method to generate movieId
    private String generateMovieId() {
        return movieName + "_" + moviesCount;
    }

    // Method to accept information
    public void setMovieDetails(String directedBy, int duration, int year, String category) {
        this.directedBy = directedBy;
        this.duration = duration;
        this.year = year;
        this.category = category;
    }

    // Method to display information
    public void displayMovieDetails() {
        System.out.println(showDetails());
    }

    // Static method to get the value of moviesCount
    public static int getMoviesCount() {
        return moviesCount;
    }

    // Getter method for movieId
    public String getMovieId() {
        return movieId;
    }

    // Method to concatenate and return details as a string
    public String showDetails() {
        StringBuilder details = new StringBuilder();
        details.append("Movie Name: ").append(movieName).append("\n");
        details.append("Produced By: ").append(producedBy).append("\n");
        details.append("Movie ID: ").append(movieId).append("\n");
        if (directedBy != null) {
            details.append("Directed By: ").append(directedBy).append("\n");
        }
        if (duration != 0) {
            details.append("Duration: ").append(duration).append(" minutes\n");
        }
        if (year != 0) {
            details.append("Year: ").append(year).append("\n");
        }
        if (category != null) {
            details.append("Category: ").append(category).append("\n");
        }
        return details.toString();
    }
}





//public abstract class Movie {
//    private String movieName;
//    private String producedBy;
//    private String directedBy;
//    private int duration; // duration in minutes
//    private int year;
//    private String category;
//    private static int moviesCount = 0;
//    private final String movieId; // Read-only variable
//
//    // Constructor with mandatory fields
//    public Movie(String movieName, String producedBy) {
//        if (movieName == null || producedBy == null) {
//            throw new IllegalArgumentException("Movie name and produced by are mandatory fields.");
//        }
//        this.movieName = movieName;
//        this.producedBy = producedBy;
//        moviesCount++;
//        this.movieId = generateMovieId();
//    }
//
//
//    // Constructor with all fields
//    public Movie(String movieName, String producedBy, String directedBy, int duration, int year, String category) {
//        this(movieName, producedBy); // Call to the mandatory fields constructor
//        this.directedBy = directedBy;
//        this.duration = duration;
//        this.year = year;
//        this.category = category;
//    }
//
//    // Method to accept information
//    public void setMovieDetails(String directedBy, int duration, int year, String category) {
//        this.directedBy = directedBy;
//        this.duration = duration;
//        this.year = year;
//        this.category = category;
//
//    }
//
//    // Method to generate movieId
//    private String generateMovieId() {
//        return movieName + "_" + moviesCount;
//    }
//    public String showDetails(){
//        StringBuilder details = new StringBuilder();
//        details.append("Movie Name: ").append(movieName).append("\n");
//        details.append("Produced By: ").append(producedBy).append("\n");
//        details.append("Movie ID: ").append(movieId).append("\n");
//    }
//
//
//    // Method to display information
//    public void displayMovieDetails() {
//        System.out.println("Movie Name: " + movieName);
//        System.out.println("Produced By: " + producedBy);
//        System.out.println("Movie ID: " + movieId);
//        if (directedBy != null) {
//            System.out.println("Directed By: " + directedBy);
//        }
//        if (duration != 0) {
//            System.out.println("Duration: " + duration + " minutes");
//        }
//        if (year != 0) {
//            System.out.println("Year: " + year);
//        }
//        if (category != null) {
//            System.out.println("Category: " + category);
//        }
//        if (moviesCount != 0) {
//            System.out.println("Count_of_movies:" + moviesCount);
//        }
//        //return showDetails().toString()
//    }
//
//    public static int getMoviesCount() {
//        return moviesCount;
//    }
//
//    public String getMovieId() {
//        return movieId;
//    }
//
//}
//
////    // Method to display information
////    public abstract void displaySpecialMovie();
////}
////
////     Main method for testing
////    public static void main(String[] args) {
////        //Creating an object with mandatory fields
////        Movie movie1 = new Movie("Harry Potter", "Warner Bros");
////        movie1.setMovieDetails("David Yates", 148, 2000, "Sci-Fi");
////        movie1.displayMovieDetails();
////
////        // Creating an object with all fields
////        Movie movie2 = new Movie("The Dark Knight", "Christopher Nolan", "Christopher Nolan", 152, 2008, "Action");
////        movie2.displayMovieDetails();
////
////        System.out.println("Total Movies Created:" + Movie.getMoviesCount());
////
////    }
////
////    // Method to display information
////    public abstract void displaySpecialMovie();
////}
//
//
