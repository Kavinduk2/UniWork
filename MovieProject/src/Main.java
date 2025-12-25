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

            
