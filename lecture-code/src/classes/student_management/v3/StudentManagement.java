package classes.student_management.v3;

public class StudentManagement {

    public static void main(String[] args) {
        Location dhbwLocation = new Location("Coblitzallee", "1-9", "68163", "Mannheim");
        University dhbw = new University("DHBW Mannheim", dhbwLocation, 1974);

        Student john = new Student("John", "Doe", "s123456", 2, 20);
        Student jane = new Student("Jane", "Doe", "s789012", 3, 21);
        Student jim = new Student("Jim", "Doe", "s345678", 1, 19);

        dhbw.addStudent(john);
        dhbw.addStudent(jane);
        dhbw.addStudent(jim);

        Lecture programming = new Lecture("Programming", new Instructor("Max", "Mustermann"));
        john.attendLecture(programming);
        jim.attendLecture(programming);

        // Print all students of programming
        System.out.println(programming.getStudents());
        // Print the instructor
        System.out.println(programming.getInstructor());
    }
}
