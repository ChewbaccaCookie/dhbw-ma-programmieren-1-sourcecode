package classes.student_management.v3;

import java.util.ArrayList;

public class Lecture {

    public String name;
    public Instructor instructor;
    public ArrayList<Student> students = new ArrayList<>();

    public Lecture(String name, Instructor instructor) {
        this.name = name;
        this.instructor = instructor;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public Instructor getInstructor() {
        return instructor;
    }
}
