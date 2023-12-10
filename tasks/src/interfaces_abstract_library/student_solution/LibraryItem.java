package interfaces_abstract_library.student_solution;

public abstract class LibraryItem {
    protected String author;
    protected String title;
    protected boolean availability;

    public LibraryItem(String title, String author, boolean availability) {
        this.title = title;
        this.author = author;
        this.availability = availability;
    }

    public void checkOut() {
        if (this.availability) {
            this.availability = false;
            System.out.println("Das item wurde ausgegeben.");
        } else {
            System.out.println("Das ausgewählte Item ist nicht verfügbar.");
        }
    }

    public void checkIn() {
        this.availability = true;
    }

    public boolean isAvailable() {
        return this.availability;
    }

    public abstract boolean isDigital();

}
