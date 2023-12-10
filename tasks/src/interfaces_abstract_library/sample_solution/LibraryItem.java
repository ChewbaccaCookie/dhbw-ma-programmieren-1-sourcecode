package interfaces_abstract_library.sample_solution;

public abstract class LibraryItem {
    private final String title;
    private int quantity; // Anzahl der Exemplare in der Bibliothek

    public LibraryItem(String title, int quantity) {
        this.title = title;
        this.quantity = quantity;
    }

    public void checkOut() {
        if (isAvailable()) {
            quantity--;
            System.out.println(title + " checked out successfully.");
        } else {
            System.out.println(title + " is not available for checkout.");
        }
    }

    public void checkIn() {
        quantity++;
        System.out.println(title + " checked in successfully.");
    }

    public boolean isAvailable() {
        return quantity > 0;
    }

    public abstract boolean isElectronic();

    public String getTitle() {
        return title;
    }
}
