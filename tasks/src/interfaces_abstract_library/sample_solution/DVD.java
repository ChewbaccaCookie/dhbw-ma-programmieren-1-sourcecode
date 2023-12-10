package interfaces_abstract_library.sample_solution;

public class DVD extends LibraryItem implements DigitalItem {
    private final String director;

    public DVD(String title, String director, int quantity) {
        super(title, quantity);
        this.director = director;
    }

    @Override
    public void download() {
        System.out.println("Downloading " + getTitle());
    }

    @Override
    public void play() {
        System.out.println("Playing " + getTitle());
    }

    @Override
    public void stream() {
        System.out.println("Streaming " + getTitle());
    }

    @Override
    public boolean isElectronic() {
        return true;
    }

    public String getDirector() {
        return director;
    }
}
