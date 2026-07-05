package bootcamp.hibernate_practical.exception;

public class BookNotAvailableException extends RuntimeException {
    public BookNotAvailableException(Long id) {
        super("Book to be borrowed with id " + id + " is not available");
    }
}
