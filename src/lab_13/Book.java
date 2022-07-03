package lab_13;

public class Book {
    private int ISBN;
    private String Title;
    private String Author;
    private int Year;

    public Book() {
    }

    public Book(int ISBN, String title, String author, int year) {
        this.ISBN = ISBN;
        Title = title;
        Author = author;
        Year = year;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    public int getYear() {
        return Year;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setYear(int year) {
        Year = year;
    }
}
