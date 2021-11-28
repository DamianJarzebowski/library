package io;

import java.util.Scanner;

import model.Book;
import model.LibraryUser;
import model.Magazine;

public class DataReader {
    private Scanner scan = new Scanner(System.in);
    private ConsolePrinter printer;

    // Konstruktor do wstrzyknięcia obiektu printer

    public DataReader(ConsolePrinter printer) {
        this.printer = printer;
    }

    public Book readAndCreateBook() {
        printer.printLine("Tytuł: ");
        String title = scan.nextLine();
        printer.printLine("Autor: ");
        String author = scan.nextLine();
        printer.printLine("Wydawnictwo: ");
        String publisher = scan.nextLine();
        printer.printLine("ISBN: ");
        String isbn = scan.nextLine();
        printer.printLine("Rok wydania: ");
        int year = getInt();
        printer.printLine("Ilość stron: ");
        int pages = getInt();
        return new Book(title, publisher, year, author, pages, isbn);
    }

    public Magazine readAndCreateMagazine() {
        printer.printLine("Tytuł: ");
        String title = scan.nextLine();
        printer.printLine("Wydawnictwo: ");
        String publisher = scan.nextLine();
        printer.printLine("Język");
        String language = scan.nextLine();
        printer.printLine("ISBN: ");
        String isbn = scan.nextLine();
        printer.printLine("Rok wydania: ");
        int year = getInt();
        printer.printLine("Miesiąc");
        int month = getInt();
        printer.printLine("Dzień");
        int day = getInt();
        return new Magazine(title, publisher, year, month, day, language);
    }

    public LibraryUser createLibraryUser() {
        printer.printLine("Imię");
        String firstName = scan.nextLine();
        printer.printLine("Nazwisko");
        String lastName = scan.nextLine();
        printer.printLine("Pesel");
        String pesel = scan.nextLine();
        return new LibraryUser(firstName, lastName, pesel);
    }

    public int getInt() {
        try {
            return scan.nextInt();
        } finally {
            scan.nextLine();
        }
    }

    public void close() {
        scan.close();
    }

    // Method for load String

    public String getString() {
        return scan.nextLine();
    }

}
