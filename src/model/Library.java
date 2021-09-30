package model;

import java.io.Serializable;

public class Library implements Serializable {

    // Static variables

    private static final int MAX_PUBLICATIONS = 2000;

    // Variables

    private int publicationsNumber = 0;
    private Publication[] publications = new Publication[MAX_PUBLICATIONS];

    // Method for publications (magazines and books)

    private void addPublication(Publication publication) {
        if (publicationsNumber >= MAX_PUBLICATIONS) {
            throw new ArrayIndexOutOfBoundsException("Max publications exceeded " + MAX_PUBLICATIONS);
        }
        publications[publicationsNumber] = publication;
        publicationsNumber++;
    }

    // Methods for books

    public void addBook(Book book) {
        addPublication(book);
    }

    // Methods for magazines

    public void addMagazines(Magazine magazine) {
        addPublication(magazine);
    }

    // Getter do zwracania tablicy publikacji bez wartości null

    public Publication[] getPublications() {
        Publication[] result = new Publication[publicationsNumber];
        for (int i = 0; i < result.length; i++) {
            result[i] = publications[i];
        }
        return result;
    }

}
