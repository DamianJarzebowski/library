package app;

import model.Book;

public class Library {
    public static void main(String[] args) {

        final String appName = "Biblioteka v0.5";
        System.out.println(appName);

        var cherub = new Book("CHERUB", "Rober Muchamore", 2002, 296,  "PWN", "AB1234");

        var zemsta = new Book("Zemsta", "Aleksander Fredra", 1933, 188, "QQE");

        cherub.printInfo();
        zemsta.printInfo();


    }
}
