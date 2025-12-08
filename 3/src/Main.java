public class Main {
    public static void main(String[] args) {

        Director director = new Director("James", "Cameron");
        Date dob = new Date(16, 8, 1954);
        director.setDOb(dob);

        director.setNumDirectedMovies(23);
        System.out.println(director); // Director's toString()
// Test Movie's constructor and toString()
        Movie movie = new Movie("Avatar", "Fantasy",director);
        System.out.println(movie); // Movie's toString()
// Test Setters and Getters
        movie.setNumAwards(23);
        System.out.println(movie); // Movie’s toString()
        System.out.println("title is: " + movie.getTitle());
        System.out.println("category is: " + movie.getCategory ());
        System.out.println("name of director is: " + movie.getDirector().getName());
        System.out.println("surname of director is: " + movie.getDirector().getSurname());
        System.out.println("number of awards is " + movie.getNumAwards());

    }
}