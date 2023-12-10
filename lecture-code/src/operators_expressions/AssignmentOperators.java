package operators_expressions;

public class AssignmentOperators {

    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        int z = 0;

        //Zuweisungsoperator
        x = x + 1;
        z = (y = (x + 1));
        System.out.println(x); // 6
        System.out.println(y); // 7
        System.out.println(z); // 7

        //Verbundoperator
        x += (y + z);
        System.out.println(x); // 20
        System.out.println(y); // 7
        System.out.println(z); // 7
    }
}
