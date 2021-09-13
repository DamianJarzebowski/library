package io;

import java.util.Scanner;

import model.Book;

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
        int releaseDate = scan.nextInt();
        scan.nextLine();
        System.out.println("Ilość stron: ");
        int pages = scan.nextInt();
        scan.nextLine();

        return new Book(title, author, releaseDate, pages, publisher, isbn);
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
