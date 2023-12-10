package interfaces_abstract_animals;

public class Animals {
    public static void main(String[] args) {
        Duck duck = new Duck("Harry", "Ente");
        Fish fish = new Fish("Harry", "Ente");

        duck.eat();
        fish.swim();

        duck.ascend();
        duck.descend();
        duck.fly();
        duck.ascend();
        duck.descend();
        duck.swim();
        duck.land();
        duck.swim();
        duck.walk();
        duck.fly();
        duck.ascend();
        duck.ascend();
        duck.ascend();
        duck.ascend();
        duck.ascend();
        duck.ascend();
        duck.ascend();
        duck.land();
        duck.fly();
        duck.descend();
        duck.walk();

        duck.makeSound();
        duck.sleep();
        fish.makeSound();
        fish.sleep();
    }
}
