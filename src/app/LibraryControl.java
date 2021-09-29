package app;
import exception.NoSuchOptionException;
import io.ConsolePrinter;
import io.DataReader;
import model.Book;
import  model.Library;
import model.Magazine;
import model.Publication;

import java.util.InputMismatchException;

class LibraryControl {

    private ConsolePrinter printer = new ConsolePrinter();
    private DataReader dataReader = new DataReader(printer);
    private Library library = new Library();

    public void controlLoop() {
        Option option;

        do {
            printOptions();
            option = getOption();
            switch (option) {
                case ADD_BOOK:
                    addBook();
                    break;
                case ADD_MAGAZINE:
                    addMagazine();
                    break;
                case PRINT_BOOKS:
                    printBooks();
                    break;
                case PRINT_MAGAZINES:
                    printMagazines();
                    break;
                case EXIT:
                    exit();
                    break;
                default:
                    System.out.println("nie ma takiej opcji, wprowadź ponownie.");
            }
        } while (option != Option.EXIT);
    }

    // Method a securing  exception to enter a value other than one of the available option

    private Option getOption() {
        boolean optionOK = false;
        Option option = null;
        while (!optionOK) {
            try {
                option = Option.createFromInt(dataReader.getInt());
                optionOK = true;
            } catch (NoSuchOptionException e) {
                printer.printLine(e.getMessage());
            } catch (InputMismatchException e) {
                printer.printLine("Wprowadzono wartośc, która nie jest liczbą, podaj ponownie");
            }
        }
        return option;
    }

    private void printMagazines() {
        Publication[] publications = library.getPublications();
        printer.printMagazines(publications);    }

    private void addMagazine() {
        try {
        Magazine magazine = dataReader.readAndCreateMagazine();
        library.addMagazines(magazine);
        } catch (InputMismatchException e) {
            printer.printLine("Nie udało się utworzyć magazynu niepoprawne dane.");
        } catch (ArrayIndexOutOfBoundsException e) {
            printer.printLine("Osiągnięto limit pojemnosci, nie można dodać kolejnego magazynu.");
        }

    }

    private void exit() {
        printer.printLine("Koniec programu, papa!");
        dataReader.close();
    }

    private void printBooks() {
        Publication[] publications = library.getPublications();
        printer.printBooks(publications);
    }

    private void addBook() {
        try {
            Book book = dataReader.readAndCreateBook();
            library.addBook(book);
        } catch (InputMismatchException e) {
            printer.printLine("Nie udało się utworzyć książki niepoprawne dane.");
        } catch (ArrayIndexOutOfBoundsException e) {
            printer.printLine("Osiągnięto limit pojemnosci, nie można dodać kolejnej książki.");
        }
    }

    private void printOptions() {
        printer.printLine("Wybierz opcje");
        for (Option option : Option.values()) {
            printer.printLine(option.toString());
        }
    }
}
