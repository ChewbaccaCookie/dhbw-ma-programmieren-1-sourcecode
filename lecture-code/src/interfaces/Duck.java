package interfaces;

public class Duck implements Bird, Swimming {
    @Override
    public void fly() {
        System.out.println("Fly...");
    }

    @Override
    public void land() {
        System.out.println("Land...");
    }

    @Override
    public void ascend() {
        System.out.println("Ascend...");
    }

    @Override
    public void descend() {
        System.out.println("Descend...");
    }

    @Override
    public void walk() {
        System.out.println("Walk...");
    }

    @Override
    public void swim() {
        System.out.println("Swim...");
    }

    public static void main(String[] args) {
        Duck duck = new Duck();
        Bird bird = new Duck();
        Flying flyingAnimal = new Duck();
        Swimming swimmingAnimal = new Duck();
        Walking walkingAnimal = new Duck();

        duck.walk();
        duck.fly();
        duck.ascend();
        duck.descend();
        duck.land();
        duck.swim();

        bird.walk();
        bird.fly();
        bird.ascend();
        bird.descend();
        bird.land();
        // bird.swim(); - Geht nicht

        // flyingAnimal.walk(); - geht nicht
        flyingAnimal.fly();
        flyingAnimal.ascend();
        flyingAnimal.descend();
        flyingAnimal.land();
        // flyingAnimal.swim(); - Geht nicht

        // swimmingAnimal.walk(); - geht nicht
        // swimmingAnimal.fly(); - geht nicht
        // swimmingAnimal.ascend(); - geht nicht
        // swimmingAnimal.descend(); - geht nicht
        // swimmingAnimal.land(); - geht nicht
        swimmingAnimal.swim();

        walkingAnimal.walk();
        // walkingAnimal.fly(); - geht nicht
        // walkingAnimal.ascend(); - geht nicht
        // walkingAnimal.descend(); - geht nicht
        // walkingAnimal.land(); - geht nicht
        // walkingAnimal.swim(); - geht nicht
    }
}
