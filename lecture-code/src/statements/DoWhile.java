package statements;

public class DoWhile {

    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        // do <Anweisung> while (<Ausdruck>);
        do {
            sum += i;
            System.out.println("sum = " + sum);
            ++i;
        } while (i < 10);
    }
}
