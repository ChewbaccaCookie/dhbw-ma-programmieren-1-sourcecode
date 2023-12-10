package interfaces_abstract_library.sample_solution;

public class Book extends LibraryItem implements PhysicalItem {
    private final String author;
    private final String position;

    public Book(String title, String author, int quantity, String position) {
        super(title, quantity);
        this.author = author;
        this.position = position;
    }

    @Override
    public String position() {
        return position;
    }

    @Override
    public boolean isElectronic() {
        return false;
    }

    public String getAuthor() {
        return author;
    }
}
