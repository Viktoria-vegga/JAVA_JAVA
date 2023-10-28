package pr4;

public class Book {
    private String author;
    private String title;
    private int year;

    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public static void main(String[] args) {
        Book book = new Book("John Doe", "Sample Book", 2023);
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Year: " + book.getYear());

        book.setYear(2024);
        System.out.println("Updated Year: " + book.getYear());
    }
}