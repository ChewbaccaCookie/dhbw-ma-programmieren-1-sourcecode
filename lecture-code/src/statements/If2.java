void main() {
    int age = 18;
    boolean adult = false;
    char gender = 'F';
    char status = 'C';
    if (age >= 18) {
        adult = true;
        status = 'B';
        if (age >= 30 && gender == 'M') {
            status = 'A';
        }
    }
    System.out.println("adult=" + adult);
    System.out.println("status=" + status);
}
