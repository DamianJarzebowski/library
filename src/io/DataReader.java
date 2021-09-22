package io;

import java.util.Scanner;

import model.Book;
import model.Magazine;

public class DataReader {
    private Scanner scan = new Scanner(System.in);


    public Book readAndCreateBook() {
        System.out.println("Tytuł: ");
        String title = scan.nextLine();
        System.out.println("Autor: ");
        String author = scan.nextLine();
        System.out.println("Wydawnictwo: ");
        String publisher = scan.nextLine();
        System.out.println("ISBN: ");
        String isbn = scan.nextLine();
        System.out.println("Rok wydania: ");
        int year = getInt();
        System.out.println("Ilość stron: ");
        int pages = getInt();
        return new Book(title, publisher, year, pages, publisher, isbn);
    }

    public Magazine readAndCreateMagazine() {
        System.out.println("Tytuł: ");
        String title = scan.nextLine();
        System.out.println("Wydawnictwo: ");
        String publisher = scan.nextLine();
        System.out.println("Język");
        String language = scan.nextLine();
        System.out.println("ISBN: ");
        String isbn = scan.nextLine();
        System.out.println("Rok wydania: ");
        int year = getInt();
        System.out.println("Miesiąc");
        int month = getInt();
        System.out.println("Dzień");
        int day = getInt();
        return new Magazine(title, publisher, language, year, month, day);
    }

    public int getInt() {
        int number = scan.nextInt();
        scan.nextLine();
        return number;
    }

    public void close() {
        scan.close();
    }
}
