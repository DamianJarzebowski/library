package model;

public class Book extends Publication{
    private String author;
    private int pages;
    private String isbn;

    //Build constructor

    public Book(String title, String author, int year, int pages, String publisher, String Isbn) {
        this.setTitle(title);
        this.setYear(year);
        this.setPublisher(publisher);
        this.author =  author;
        this.pages = pages;
        this.isbn = Isbn;

    }
    public void printInfo() {
        String info = getTitle() + " " + author + " " + getYear() + " " + pages + " " + getPublisher() + " ";
        if(isbn != null) {
            info += isbn;
        }
        System.out.println(info);
    }

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
