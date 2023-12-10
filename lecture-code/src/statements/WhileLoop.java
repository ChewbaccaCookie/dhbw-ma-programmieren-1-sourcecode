package statements;

public class WhileLoop {

    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        // while(<Ausdruck>) <Anweisung oder Block>
        while (i < 10) {
            sum += i;
            System.out.println("sum = " + sum);
            i++;
        }
    }
}
