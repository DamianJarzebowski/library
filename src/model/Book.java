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
        String info = title + " " + author + " " + releaseDate + " " + pages + " " + publisher + " ";
        if(isbn != null) {
            info += isbn;
        }
        System.out.println(info);
    }

}
