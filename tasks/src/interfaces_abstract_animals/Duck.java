package interfaces_abstract_animals;

public class Duck extends Animal implements Bird, Swimming {
    public Duck(String name, String species) {
        super(name, species);
    }

    private String movementMode = "nothing";
    private int currentHeight = 0;

    private void printMovementMode() {
        System.out.println("Duck is currently: " + movementMode);
    }

    private void switchMovementMode(String newMovementMode) {
        if (newMovementMode.equals(movementMode)) {
            System.out.println("Already " + movementMode);
            return;
        }
        if (newMovementMode.equals("nothing")) {
            movementMode = newMovementMode;
            printMovementMode();
            return;
        }
        switch (movementMode) {
            case "flying":
                printMovementMode();
                System.out.println("You first need to land before you can switch to " + newMovementMode);
                break;
            default:
                movementMode = newMovementMode;
                printMovementMode();
        }
    }

    @Override
    public void fly() {
        switchMovementMode("flying");
    }

    @Override
    public void land() {
        if (!movementMode.equals("flying")) {
            System.out.println("I am not flying!");
            return;
        }
        switchMovementMode("nothing");
        currentHeight = 0;
    }

    @Override
    public void descend() {
        if (!movementMode.equals("flying")) {
            System.out.println("Can´t descend in current mode!");
            return;
        }
        int newHeight = currentHeight - 150;
        if (newHeight <= 0) {
            land();
            return;
        }
        currentHeight = newHeight;
        System.out.println("New height: " + currentHeight);
    }

    @Override
    public void ascend() {
        if (!movementMode.equals("flying")) {
            System.out.println("Can´t ascend in current mode!");
            return;
        }
        if (currentHeight >= Flying.MAX_HEIGHT) {
            System.out.println("Max height already reached!");
            return;
        }
        currentHeight += 150;
        System.out.println("New height: " + currentHeight);
    }

    @Override
    public void walk() {
        switchMovementMode("walking");
    }

    @Override
    public void swim() {
        switchMovementMode("swimming");
    }

    @Override
    public void makeSound() {
        System.out.println("Quak!");
    }

}
