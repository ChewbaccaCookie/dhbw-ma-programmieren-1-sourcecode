package statements;

public class ForLoop {

    public static void main(String[] args) {
        int sum = 0;
        // for(<Init>; <Ausdruck>; <Update>) <Anweisung>
        for (int i = 0; i < 10; ++i) {
            sum += i;
            System.out.println("sum = " + sum);
        }
    }
}
