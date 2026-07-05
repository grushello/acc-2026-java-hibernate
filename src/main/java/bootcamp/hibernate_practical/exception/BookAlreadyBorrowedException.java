package bootcamp.hibernate_practical.exception;

public class BookAlreadyBorrowedException extends IllegalStateException {
    public BookAlreadyBorrowedException(Long id) {
        super("Book already borrowed with id: " + id);
    }
}
