package classes.student_management.v2;

import java.util.ArrayList;

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

        System.out.println(dhbw);

        ArrayList<Student> students = dhbw.getStudents();
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
}
