public class Encapsulation4 {
    public static void main(String[] args) {
        Book b = new Book();

        b.setTitle("Lion king");
        b.setAuthor("Author Justine Korman");
        b.setPages(208); // Try negative for validation test

        b.displayInfo();
    }
}
class Book {
    // Private data members
    private String title;
    private String author;
    private int pages;

    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPages(int pages) {
        if (pages > 0) {
            this.pages = pages;
        } else {
            System.out.println("Invalid number of pages. Setting to 0.");
            this.pages = 0;
        }
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getPages() {
        return pages;
    }

    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
}
