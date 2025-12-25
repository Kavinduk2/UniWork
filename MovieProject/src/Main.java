import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("--- Movie Database Entry ---");

        while (running) {
            try {
                // --- 1. Get Director Details ---
                System.out.println("\n--- Enter Director Details ---");
                System.out.print("First Name: ");
                String dName = scanner.nextLine();
                
                System.out.print("Surname: ");
                String dSurname = scanner.nextLine();
                
                Director director = new Director(dName, dSurname);

                System.out.println("Date of Birth (DD MM YYYY): ");
                System.out.print("Day: ");
                int day = scanner.nextInt();
                System.out.print("Month: ");
                int month = scanner.nextInt();
                System.out.print("Year: ");
                int year = scanner.nextInt();

            Date dob = new Date(day, month, year);
                director.setDOb(dob);

                System.out.print("Number of Directed Movies: ");
                int directedCount = scanner.nextInt();
                director.setNumDirectedMovies(directedCount);
                
                // Consume newline left by nextInt()
                scanner.nextLine(); 

                // --- 2. Get Movie Details ---
                System.out.println("\n--- Enter Movie Details ---");
                System.out.print("Movie Title: ");
                String title = scanner.nextLine();

                System.out.print("Category (e.g., Fantasy, Sci-Fi): ");
                String category = scanner.nextLine();

                Movie movie = new Movie(title, category, director);

                System.out.print("Number of Awards: ");
                int awards = scanner.nextInt();
                movie.setNumAwards(awards);
                
                // Consume newline
                scanner.nextLine();

                // --- 3. Output Results ---
                printMovieInfo(movie);

                // --- 4. Loop Check ---
                System.out.print("\nAdd another movie? (y/n): ");
                String choice = scanner.nextLine();
                if (choice.equalsIgnoreCase("n")) {
                    running = false;
                    System.out.println("Exiting database...");
                }

            } catch (Exception e) {
                System.out.println("Invalid input! Please ensure numbers are entered for dates/counts.");
                scanner.nextLine(); // Clear buffer
            }
        }
        scanner.close();
    }

    // Helper method to display all info in one place
    private static void printMovieInfo(Movie m) {
        System.out.println("\n=================================");
        System.out.println("         MOVIE RECORD            ");
        System.out.println("=================================");
        System.out.println("Title:       " + m.getTitle());
        System.out.println("Category:    " + m.getCategory());
        System.out.println("Awards:      " + m.getNumAwards());
        System.out.println("---------------------------------");
        System.out.println("DIRECTOR INFO:");
        // Assuming Director class has a proper toString() or getName() method
        System.out.println("Name:        " + m.getDirector().getName() + " " + m.getDirector().getSurname());
        System.out.println("Dob:         " + m.getDirector().getDate()); // Assuming getter for Date exists
        System.out.println("Dir. Movies: " + m.getDirector().getNumDirectedMovies()); // Assuming getter exists
        System.out.println("=================================");
    }
}
