package classes.student_management.v3;

import java.util.ArrayList;

public class Student {

    public static int totalAge = 0;
    public static int studentCount = 0;
    public static Student latestCreated;
    public final Student previousStudent;
    public String firstName;
    public String lastName;
    public String studentId;
    public int semester;
    public int age;
    public University university;
    public ArrayList<Lecture> lectures = new ArrayList<>();

    public Student(String firstName, String lastName, String studentId, int semester, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.semester = semester;
        this.age = age;
        this.previousStudent = latestCreated;
        latestCreated = this;

        Student.totalAge += age;
        Student.studentCount++;
    }

    public static double getAverageAge() {
        return (double) totalAge / studentCount;
    }

    public boolean equals(Student student) {
        return this.studentId.equals(student.studentId);
    }

    public Student clone() {
        return new Student(this.firstName, this.lastName, this.studentId, this.semester, this.age);
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public void printInfo() {
        System.out.println("Full Name: " + getFullName());
        System.out.println("student_management.v2.Student ID: " + this.studentId);
        System.out.println("Semester: " + this.semester);
        System.out.println("Age: " + this.age);
    }

    public University getUniversity() {
        return this.university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public void attendLecture(Lecture lecture) {
        lectures.add(lecture);
        lecture.addStudent(this);
    }

    public String toString() {
        return this.getFullName() + " (" + this.studentId + ")";
    }
}
