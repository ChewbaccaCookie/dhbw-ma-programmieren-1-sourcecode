package statements;

public class If {

    public static void main(String[] args) {
        boolean adult = false;
        int age = 18;

        //if-Anweisung
        if (age >= 18) {
            adult = true;
        }
        System.out.println("adult=" + adult);
    }
}
