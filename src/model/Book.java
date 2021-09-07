package model;

public class Book {
    private String title;
    private String author;
    private int releaseDate;
    private int pages;
    private String publisher;
    private String isbn;

    //Build constructor

    public Book(String title, String Author, int ReleaseDate, int Pages, String Publisher, String Isbn) {
        this(title, Author, ReleaseDate, Pages, Publisher);
        isbn = Isbn;
    }
    public Book(String title, String author, int releaseDate, int pages, String publisher) {
        this.title = title;
        this.author =  author;
        this.releaseDate = releaseDate;
        this.pages = pages;
        this.publisher = publisher;
}
    public void printInfo() {
        System.out.println(title + " " + author + " " + releaseDate + " " + pages + " " + publisher + " " + isbn);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
