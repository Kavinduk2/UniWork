package Shape;

import java.util.Scanner;

public class TestCylinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("--- Cylinder Calculator ---");

        while (running) {
            try {
                // 1. Get User Input
                System.out.print("\nEnter Radius: ");
                double radius = scanner.nextDouble();

                System.out.print("Enter Height: ");
                double height = scanner.nextDouble();

                // Consume the leftover newline character from nextDouble()
                scanner.nextLine(); 

                System.out.print("Enter Color: ");
                String color = scanner.nextLine();

                // 2. Create the Cylinder object
                // Assumes you have a constructor: Cylinder(double r, double h, String c)
                Cylinder currentCylinder = new Cylinder(radius, height, color);

                // 3. Print Details using the helper method
                printCylinderInfo(currentCylinder);

                // 4. Ask to continue
                System.out.print("\nDo you want to calculate another? (y/n): ");
                String choice = scanner.nextLine();
                if (choice.equalsIgnoreCase("n")) {
                    running = false;
                    System.out.println("Exiting program...");
                }

            } catch (Exception e) {
                System.out.println("Invalid input! Please enter numbers for radius and height.");
                scanner.nextLine(); // Clear the invalid input from scanner buffer
            }
        }
        
        scanner.close();
    }

    // Helper method to optimize code and avoid repetition
    private static void printCylinderInfo(Cylinder c) {
        System.out.println("------------------------------");
        System.out.println("Shape.Cylinder Details:");
        System.out.println("Color:      " + c.getColor());
        System.out.println("Radius:     " + c.getRadius());
        System.out.println("Height:     " + c.getHeight());
        // Depending on your Cylinder class implementation:
        // getArea() usually returns Surface Area in Cylinder context
        // getBaseArea() (if implemented) returns the Circle area
        System.out.println("Base Area:  " + c.getBaseArea()); 
        System.out.println("Surf. Area: " + c.getArea());
        System.out.println("Volume:     " + c.getVolume());
        System.out.println("------------------------------");
    }
}
