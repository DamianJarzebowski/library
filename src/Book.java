public class Book {
    String title;
    String author;
    int releaseDate;
    int pages;
    String publisher;
    String isbn;

    //Build constructor

    Book(String title, String Author, int ReleaseDate, int Pages, String Publisher, String Isbn) {
        this(title, Author, ReleaseDate, Pages, Publisher);
        isbn = Isbn;
    }
    Book(String title, String author, int releaseDate, int pages, String publisher) {
        this.title = title;
        this.author =  author;
        this.releaseDate = releaseDate;
        this.pages = pages;
        this.publisher = publisher;
}
    void printInfo() {
        System.out.println(title + " " + author + " " + releaseDate + " " + pages + " " + publisher + " " + isbn);
    }

}
