# Aufgabe: Code Verständnis 2

## Aufgabenstellung

Ermitteln Sie die Ausgabe des Codes:

```java
public class CodeUnderstanding2 {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        person1.greet();
        System.out.println(person1.getAge());

        person2.greet();
        System.out.println(person2.getAge());

        int sumOfAges = calculateSumOfAges(person1, person2);
        System.out.println("Sum of ages: " + sumOfAges);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Loop iteration " + i);
        }

        Person person3 = new Person("Charlie", 22);
        person3.greet();
        System.out.println(person3.getAge());

        System.out.println("End of the program");
    }

    private static int calculateSumOfAges(Person personA, Person personB) {
        return personA.getAge() + personB.getAge();
    }
}

public class Person {
    private String name;
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
```
