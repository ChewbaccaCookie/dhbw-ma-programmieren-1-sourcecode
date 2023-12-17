package code_understanding.exercise3;

public class CodeUnderstanding3 {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25);
        Student student1 = new Student("Bob", 30, "S12345");

        person1.greet();
        System.out.println(person1.getAge());

        student1.greet();
        System.out.println(student1.getAge());
        student1.displayInfo();

        int sumOfAges = calculateSumOfAges(person1, student1);
        System.out.println("Sum of ages: " + sumOfAges);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Loop iteration " + i);
        }

        Student student2 = new Student("Charlie", 22, "S67890");
        student2.greet();
        System.out.println(student2.getAge());
        student2.displayInfo();

        System.out.println("End of the program");
    }

    private static int calculateSumOfAges(Person personA, Person personB) {
        return personA.getAge() + personB.getAge();
    }
}
