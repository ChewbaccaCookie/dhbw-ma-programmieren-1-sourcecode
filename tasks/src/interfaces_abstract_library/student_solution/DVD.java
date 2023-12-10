package interfaces_abstract_library.student_solution;

public class DVD extends LibraryItem implements PhysicalItem, DigitalItem {
    public DVD(String title, String author, boolean availability) {
        super(title, author, availability);
    }

    @Override
    public void download() {
        System.out.println("Downloading...");
    }

    @Override
    public void play() {
        System.out.println("Play whatever");
    }

    @Override
    public void stream() {
        System.out.println("Streaming...");
    }

    @Override
    public boolean isDigital() {
        return true;
    }

    @Override
    public String position() {
        return "DVD-Schrank";
    }
}
