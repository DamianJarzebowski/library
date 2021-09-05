public class Book {
    String title;
    String author;
    int releaseDate;
    int pages;
    String publisher;
    String isbn;

    //Build constructor
    Book(String title, String Author, int ReleaseDate, int Pages, String Publisher, String Isbn) {
        this.title = title;
        author =  Author;
        releaseDate = ReleaseDate;
        pages = Pages;
        publisher = Publisher;
        isbn = Isbn;
    }

    void printInfo() {
        System.out.println(title + " " + author + " " + releaseDate + " " + pages + " " + publisher + " " + isbn);
    }

}
