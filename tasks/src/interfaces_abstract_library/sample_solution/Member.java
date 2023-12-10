package interfaces_abstract_library.sample_solution;

import java.util.ArrayList;

public class Member implements LibraryUser {
    private final String name;
    private final ArrayList<LibraryItem> borrowHistory;
    private Library library;

    public Member(String name) {
        this.name = name;
        this.borrowHistory = new ArrayList<>();
    }

    @Override
    public void register(Library library) {
        if (this.library != null) {
            System.out.println(name + " already registered in a library.");
            return;
        }
        this.library = library;
        library.registerMember(this);
        System.out.println(name + " registered as a library member.");
    }

    @Override
    public void unregister() {
        library.unregisterMember(this);
        library = null;
        System.out.println(name + " unregistered as a library member.");
    }

    @Override
    public void borrowItem(LibraryItem item) {
        if (item.isAvailable()) {
            item.checkOut();
            borrowHistory.add(item);
            System.out.println(name + " borrowed " + item.getTitle() + ".");
        } else {
            System.out.println(item.getTitle() + " is not available for borrowing.");
        }
    }

    @Override
    public void returnItem(LibraryItem item) {
        if (borrowHistory.contains(item)) {
            item.checkIn();
            borrowHistory.remove(item);
            System.out.println(name + " returned " + item.getTitle() + ".");
        } else {
            System.out.println(name + " did not borrow " + item.getTitle() + ".");
        }
    }

    public String getName() {
        return name;
    }
}
