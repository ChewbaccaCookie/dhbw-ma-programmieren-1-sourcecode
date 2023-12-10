package interfaces_abstract_animals;

public abstract class Animal {
    protected String name;
    protected String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public void eat() {
        System.out.println("Yum! Yum! Yum!");
    }

    public void sleep() {
        System.out.println("Gute Nacht!");
    }

    public abstract void makeSound();
}
