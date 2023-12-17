package code_understanding.exercise3;

public class Person {
    protected String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void greet() {
        System.out.println("Hello, " + name + "!");
    }
}
