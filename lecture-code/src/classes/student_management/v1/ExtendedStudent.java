package classes.student_management.v1;

public class ExtendedStudent {

    public static int totalAge = 0;
    public static int studentCount = 0;
    public static ExtendedStudent latestCreated;
    public final ExtendedStudent previousStudent;
    public String firstName;
    public String lastName;
    public String studentId;
    public int semester;
    public int age;

    public ExtendedStudent(String firstName, String lastName, String studentId, int semester, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.semester = semester;
        this.age = age;
        this.previousStudent = latestCreated;
        latestCreated = this;

        ExtendedStudent.totalAge += age;
        ExtendedStudent.studentCount++;
    }

    public static void main(String[] args) {
        ExtendedStudent john = new ExtendedStudent("John", "Doe", "s123456", 2, 20);
        ExtendedStudent jane = new ExtendedStudent("Jane", "Doe", "s789012", 3, 21);
        ExtendedStudent jim = new ExtendedStudent("Jim", "Doe", "s345678", 1, 19);

        john.printInfo();
        jane.printInfo();
        jim.printInfo();

        System.out.println("Average age: " + ExtendedStudent.getAverageAge());
        System.out.println("John age: " + jane.previousStudent.age);
    }

    public static double getAverageAge() {
        return (double) totalAge / studentCount;
    }

    public boolean equals(ExtendedStudent student) {
        return this.studentId.equals(student.studentId);
    }

    public ExtendedStudent clone() {
        return new ExtendedStudent(this.firstName, this.lastName, this.studentId, this.semester, this.age);
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public void printInfo() {
        System.out.println("Full Name: " + getFullName());
        System.out.println("Student ID: " + this.studentId);
        System.out.println("Semester: " + this.semester);
        System.out.println("Age: " + this.age);
    }
}
