package interfaces_abstract_library.student_solution;

import java.util.ArrayList;

public class Library {
    private final ArrayList<LibraryItem> libraryItems = new ArrayList<>();
    private final ArrayList<Member> members = new ArrayList<>();

    public static void main(String[] args) {
        Book harryPotter = new Book("Harry Potter", "J.K Rowling", true, "Regal 6");
        Library dhLibrary = new Library();

        dhLibrary.addItem(harryPotter);

        Member john = new Member("John Doe");
        dhLibrary.addMember(john);

        john.borrowItem(dhLibrary, harryPotter);
        dhLibrary.checkOutItem(harryPotter, john);
    }

    public void addItem(LibraryItem item) {
        this.libraryItems.add(item);
    }

    public void removeItem(LibraryItem item) {
        this.libraryItems.remove(item);
    }

    public void addMember(Member member) {
        this.members.add(member);
    }

    public void removeMember(Member member) {
        this.members.remove(member);
    }

    public void checkOutItem(LibraryItem item, Member member) {
        if (!members.contains(member)) {
            System.out.println("Die Person ist nicht Mitglied dieser Bibliothek!");
            return;
        }
        if (!libraryItems.contains(item)) {
            System.out.println("Dieses Medium ist nicht in dieser Bibliothek!");
            return;
        }

        item.checkOut();
    }

    public void checkInItem(LibraryItem item, Member member) {
        if (!members.contains(member)) {
            System.out.println("Die Person ist nicht Mitglied dieser Bibliothek!");
            return;
        }
        if (!libraryItems.contains(item)) {
            System.out.println("Dieses Medium ist nicht in dieser Bibliothek!");
            return;
        }

        item.checkIn();
    }


}
