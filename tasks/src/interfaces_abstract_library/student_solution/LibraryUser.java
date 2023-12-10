package interfaces_abstract_library.student_solution;

public interface LibraryUser {
    void register(Library library);

    void borrowItem(Library library, LibraryItem item);

    void returnItem(Library library, LibraryItem item);
}
