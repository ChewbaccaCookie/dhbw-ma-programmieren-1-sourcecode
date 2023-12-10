package interfaces_abstract_library.student_solution;

import java.util.ArrayList;

public class Member implements LibraryUser {
    private final String name;
    private final ArrayList<LibraryItem> borrowHistory = new ArrayList<>();

    public Member(String name) {
        this.name = name;
    }

    @Override
    public void register(Library library) {
        library.addMember(this);
    }

    @Override
    public void borrowItem(Library library, LibraryItem item) {
        library.checkOutItem(item, this);
    }

    @Override
    public void returnItem(Library library, LibraryItem item) {
        library.checkInItem(item, this);
    }
}