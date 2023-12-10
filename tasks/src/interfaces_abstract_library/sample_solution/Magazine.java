package interfaces_abstract_library.sample_solution;

public class Magazine extends LibraryItem implements PhysicalItem {
    private final String category;
    private final String position;

    public Magazine(String title, String category, int quantity, String position) {
        super(title, quantity);
        this.category = category;
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

    public String getCategory() {
        return category;
    }
}