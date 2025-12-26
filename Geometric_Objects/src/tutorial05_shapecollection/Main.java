import java.util.Scanner;

public class GeometricShapeCollection implements ShapeCollection {
    private Scanner scanner = new Scanner(System.in);
    // ... other variables like your array of shapes

    public boolean runMenu() {
        System.out.println("\n--- Shape Collection Menu ---");
        System.out.println("1. Add a Shape");
        System.out.println("2. View All Shapes");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");

        // Get user input
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                addShape(); // Call a method to handle adding
                return false; // Keep the loop running
            case "2":
                displayShapes(); 
                return false;
            case "3":
                System.out.println("Exiting program...");
                return true;  // This sets 'exit' to true in Main, stopping the loop
            default:
                System.out.println("Invalid choice. Please try again.");
                return false;
        }
    }
}
