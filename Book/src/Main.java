

import java.util.*;


public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        HashMap<Book, Integer> hmap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        boolean exiting = false;

        while (!exiting) {
            System.out.println("Press 1 if you want to add a book ");
            System.out.println("Press  2 if you want to print the list of bokks sorted by year");
            System.out.println("press 3 to exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter the title of the book");
                    String title = scanner.nextLine();
                    System.out.println("Enter the author name");
                    String authorName = scanner.nextLine();
                    System.out.println("Enter the published year");
                    int yearPublished = scanner.nextInt();
                    System.out.println("Enter the price of the book");
                    double price = scanner.nextDouble();

                    Book book = new Book(title, yearPublished, authorName);

                    books.add(book);
                    break;
                case 2:

                    Collections.sort(books);
                    System.out.println(books.toString());
                    break;

                case 3:
                    for (int i = 0; i < books.size(); i++){
                        System.out.println("Enter the number of the shelf " +
                                "where to place the book" +books.get(i).getTitle());
                        int numShelf = scanner.nextInt();
                        scanner.nextLine();

                        hmap.put(books.get(i), numShelf);
                    }
                    break;

                case 4:
                    System.out.println("Insert the number of the shelf");
                    int selectedShelf = scanner.nextInt();
                    System.out.println("The book in shelf "+ selectedShelf + " are:");

                    for(Map.Entry<Book, Integer> entry : hmap.entrySet()){
                        if(entry.getValue().equals(selectedShelf))
                            System.out.println(entry.getKey());
                    }
                    break;


                case 5:
                    exiting = true;
                    break;

                default:
                    System.out.println("please enter a valid number");
                    break;
            }


        }
    }

}