package lab_13_v1;

import java.io.Serializable;

public class Book implements Serializable {
    private int ISBN;
    private String Title;
    private String Author;
    private int Year;

    public Book() {
    }

    public Book(int isbn, String title, String author, int year) {
        ISBN = isbn;
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

    @Override
    public String toString() {
        return "Book{" +
                "ISBN=" + ISBN +
                ", Title='" + Title + '\'' +
                ", Author='" + Author + '\'' +
                ", Year=" + Year +
                '}';
    }
}
