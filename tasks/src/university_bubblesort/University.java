package university_bubblesort;

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

    public ArrayList<Student> sortStudentsByAge() {
        ArrayList<Student> copiedStudents = (ArrayList<Student>) students.clone();
        int n = copiedStudents.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (copiedStudents.get(j).age > copiedStudents.get(j + 1).age) {
                    Student temp = copiedStudents.get(j);
                    copiedStudents.set(j, copiedStudents.get(j + 1));
                    copiedStudents.set(j + 1, temp);
                }
            }
        }

        return copiedStudents;
    }

    public String toString() {
        return this.name + " (" + this.location + ")";
    }
}

