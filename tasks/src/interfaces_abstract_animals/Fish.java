package interfaces_abstract_animals;

public class Fish extends Animal implements Swimming {
    public Fish(String name, String species) {
        super(name, species);
    }

    private boolean isSwimming = false;

    @Override
    public void swim() {
        isSwimming = !isSwimming;
        if (isSwimming) {
            System.out.println("Fish is swimming!");
        } else {
            System.out.println("Fish is not swimming!");
        }
    }

    @Override
    public void makeSound() {
        System.out.println("Blub");
    }

}
