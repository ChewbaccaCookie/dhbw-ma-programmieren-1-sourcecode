package interfaces_abstract_library.sample_solution;

public interface LibraryUser {
    void register(Library library);

    void unregister();

    void borrowItem(LibraryItem item);

    void returnItem(LibraryItem item);
}
