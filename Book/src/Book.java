
public class Book implements Comparable<Book> {
    private String title;
    private double price;
    private int yearPublished;
    private String author;

    public Book(String title, int yearPublished, String author){
        this.title = title;
        this.yearPublished = yearPublished;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", yearPublished=" + yearPublished +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book b){
        return this.yearPublished - b.yearPublished;
    }




}
