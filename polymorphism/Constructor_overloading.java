public class Constructor_overloading {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("The Apple");
        Book b3 = new Book("lion king", "Author Justine Korman");
        Book b4 = new Book("Java ", "James Gosling", 499.99);

        b1.displayInfo();
        b2.displayInfo();
        b3.displayInfo();
        b4.displayInfo();
    }
}

class Book {
    String title;
    String author;
    double price;

    // Constructor 1 - No parameters
    public Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Constructor 2 - Only title
    public Book(String title) {
        this.title = title;
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Constructor 3 - Title and Author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }

    // Constructor 4 - Title, Author, and Price
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: ₹" + price);
    }
}
