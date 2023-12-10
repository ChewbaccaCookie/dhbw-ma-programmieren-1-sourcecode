package interfaces_abstract_library.student_solution;

public class Magazine extends LibraryItem implements PhysicalItem {

    public Magazine(String title, String author, boolean isAvailable) {
        super(title, author, isAvailable);
    }

    @Override
    public boolean isDigital() {
        return false;
    }

    @Override
    public String position() {
        return "Magazin-Ständer";

    }

}
