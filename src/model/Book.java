package model;

public class Book extends Publication{

    // Variables

    private String author;
    private int pages;
    private String isbn;

    // Constructor

    public Book(String title, String publisher, int year, String author, int pages, String isbn) {
        super(title, publisher, year);
        this.author = author;
        this.pages = pages;
        this.isbn = isbn;
    }

    // Methods

    @Override
    public void printInfo() {
        String info = getTitle() + " " + author + " " + getYear() + " " + pages + " " + getPublisher() + " ";
        if(isbn != null) {
            info += isbn;
        }
        System.out.println(info);
    }

    // Getters and Setters

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
