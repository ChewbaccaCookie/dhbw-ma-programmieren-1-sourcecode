package classes_student;

public class Student {

    public String firstName;
    public String lastName;
    public String studentId;
    public int semester;
    public int age;

    public Student(String firstName, String lastName, String studentId, int semester, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.semester = semester;
        this.age = age;
    }

    public static void main(String[] args) {
        Student student1 = new Student("John", "Doe", "s123456", 2, 20);
        Student student2 = new Student("Jane", "Doe", "s789012", 3, 21);
        Student student3 = new Student("Jim", "Doe", "s345678", 1, 19);

        student1.printInfo();
        student2.printInfo();
        student3.printInfo();
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

