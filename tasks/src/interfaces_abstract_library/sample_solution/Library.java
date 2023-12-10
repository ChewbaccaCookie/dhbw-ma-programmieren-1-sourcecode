package interfaces_abstract_library.sample_solution;

import java.util.ArrayList;

public class Library {
    private final ArrayList<LibraryItem> items;
    private final ArrayList<Member> registeredMembers;

    public Library() {
        this.items = new ArrayList<>();
        this.registeredMembers = new ArrayList<>();
    }

    public static void main(String[] args) {
        // Create the library
        Library library = new Library();

        // Create library items
        Book book = new Book("The Art of Java", "John Doe", 1, "Shelf B");
        DVD dvd = new DVD("Java: The Movie", "Jane Smith", 1);
        Magazine magazine = new Magazine("Java Monthly", "Programming", 1, "Magazine Rack");

        // Add items to the library
        library.addItem(book);
        library.addItem(dvd);
        library.addItem(magazine);

        // Create library members
        Member member1 = new Member("Alice");
        Member member2 = new Member("Bob");

        // Register members in the library
        member1.register(library);
        member2.register(library);

        // Demonstrate borrowing and returning library items
        member1.borrowItem(book);
        member1.borrowItem(dvd);
        member2.borrowItem(magazine);

        // Display the availability of items
        System.out.println("Availability of Book: " + book.isAvailable());
        System.out.println("Availability of DVD: " + dvd.isAvailable());
        System.out.println("Availability of Magazine: " + magazine.isAvailable());

        // Attempt to borrow an unavailable item
        member2.borrowItem(book);

        // Display the position of physical items in the library
        System.out.println("Position of Book: " + book.position());
        System.out.println("Position of Magazine: " + magazine.position());

        // Demonstrate checking in items
        library.checkInItem(book);
        library.checkInItem(dvd);

        // Display the availability after check-in
        System.out.println("Availability of Book after check-in: " + book.isAvailable());
        System.out.println("Availability of DVD after check-in: " + dvd.isAvailable());
    }

    public void addItem(LibraryItem item) {
        items.add(item);
        System.out.println(item.getTitle() + " added to the library.");
    }

    public void removeItem(LibraryItem item) {
        if (items.remove(item)) {
            System.out.println(item.getTitle() + " removed from the library.");
        } else {
            System.out.println(item.getTitle() + " not found in the library.");
        }
    }

    public void checkOutItem(LibraryItem item) {
        item.checkOut();
    }

    public void checkInItem(LibraryItem item) {
        item.checkIn();
    }

    public void registerMember(Member member) {
        registeredMembers.add(member);
    }

    public void unregisterMember(Member member) {
        if (registeredMembers.remove(member)) {
            System.out.println(member.getName() + " unregistered as a library member.");
        } else {
            System.out.println(member.getName() + " is not registered as a library member.");
        }
    }
}
