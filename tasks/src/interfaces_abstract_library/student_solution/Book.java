package interfaces_abstract_library.student_solution;

public class Book extends LibraryItem implements PhysicalItem {
    private final String bookPosition;

    public Book(String title, String author, boolean isAvailable, String bookPosition) {
        super(title, author, isAvailable);
        this.bookPosition = bookPosition;
    }

    @Override
    public boolean isDigital() {
        return false;
    }

    @Override
    public String position() {
        return bookPosition;
    }
}
