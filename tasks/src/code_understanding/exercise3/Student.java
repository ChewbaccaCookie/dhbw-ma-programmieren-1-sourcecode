package code_understanding.exercise3;

public class Student extends Person {
    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void displayInfo() {
        System.out.println(name + " is a student with ID " + studentId + ".");
    }
}
