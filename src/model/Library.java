package model;

import exception.PublicationAlreadyExistsException;
import exception.UserAlreadyExistsEception;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Library implements Serializable {

    private Map<String, Publication> publications = new HashMap<>();
    private Map<String, LibraryUser> users = new HashMap<>();

    public Map<String, LibraryUser> getUsers() {
        return users;
    }

    public Map<String, Publication> getPublications() {
        return publications;
    }
    // Method for publications (magazines and books)

    public void addPublication(Publication publication) {
        if(publications.containsKey(publication.getTitle()))
            throw new PublicationAlreadyExistsException(
                    "Publikacja o takim tytule już istnieje " + publication.getTitle()
            );
        publications.put(publication.getTitle(), publication);
    }

    public void addUser(LibraryUser user) {
        if (users.containsKey(user.getPesel())) {
            throw new UserAlreadyExistsEception("Użytkownik ze wskazanym peselem już istnieje" + user.getPesel());
        }
        users.put(user.getPesel(), user);
    }

    public boolean removePublication(Publication pub) {
        if (publications.containsValue(pub)) {
            publications.remove(pub.getTitle());
            return true;
        } else {
            return false;
        }
    }

}
