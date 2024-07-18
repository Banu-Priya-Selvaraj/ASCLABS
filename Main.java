public class Main {
    public static void main(String[] args) {
        // Create an array of Movie objects
        Movie[] movies = new Movie[3];

        // Instantiate objects of Movie, SpecialMovie, and InternationalMovie
        Movie movie1 = new Movie("Inception", "Emma Thomas");
        movie1.setMovieDetails("Christopher Nolan", 148, 2010, "Sci-Fi");

        SpecialMovie movie2 = new SpecialMovie("Avatar", "James Cameron", "Dolby Atmos", "3D CGI");
        movie2.setMovieDetails("James Cameron", 162, 2009, "Sci-Fi");

        InternationalMovie movie3 = new InternationalMovie("Parasite", "Kwak Sin-ae", "South Korea", "Korean");
        movie3.setMovieDetails("Bong Joon-ho", 132, 2019, "Thriller");

        // Store the objects in the array
        movies[0] = movie1;
        movies[1] = movie2;
        movies[2] = movie3;

        // Iterate through the array and display details of each movie
        for (Movie movie : movies) {
            System.out.println(movie.showDetails());
        }

        // Display the count of movie objects created
        System.out.println("Total movies created: " + Movie.getMoviesCount());
    }
}











//public class Main {
//    public static void main(String[] args) {
//        // Creating and displaying a SpecialMovie object
//        //Movie movies=Movie[3]
//        SpecialMovie specialMovie = new SpecialMovie("Avatar", "James Cameron", "Dolby Atmos", "3D CGI");
//        specialMovie.setMovieDetails("James Cameron", 162, 2009, "Sci-Fi");
//        specialMovie.displaySpecialMovie();
//        System.out.println(specialMovie.showDetails());
//
//        // Creating and displaying an InternationalMovie object
//        InternationalMovie internationalMovie = new InternationalMovie("Parasite", "Kwak Sin-ae", "South Korea", "Korean");
//        internationalMovie.setMovieDetails("Bong Joon-ho", 132, 2019, "Thriller");
//        internationalMovie.displayInternationalMovieDetails();
//        System.out.println(internationalMovie.showDetails());
//
//        // Display the count of movie objects created
//        System.out.println("Total movies created: " + Movie.getMoviesCount());
//    }
//}

