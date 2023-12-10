package classes_instructor;

import java.util.ArrayList;

public class University {

    public String name;
    public ArrayList<Student> students = new ArrayList<>();
    public Location location;
    public int foundedYear;

    public University(String name, Location location, int foundedYear) {
        this.name = name;
        this.location = location;
        this.foundedYear = foundedYear;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
        student.setUniversity(this);
    }

    public void removeStudent(Student student) {
        students.remove(student);
        student.setUniversity(null);
    }

    public String toString() {
        return this.name + " (" + this.location + ")";
    }
}

