package operators_expressions;

public class ExplicitConversion {

    public static void main(String[] args) {
        float f = 987.654f;
        System.out.println(f); // 987.654

        //Konvertierung mit Genauigkeitsverlust
        int i = (int) f;
        byte b = (byte) i;
        System.out.println(i); // 987
        System.out.println(b); // -37

        //Konvertierung ohne Genauigkeitsverlust
        b = (byte) (b + 1);
        f = (float) i / 13;
        System.out.println(b); // -36
        System.out.println(f); // 75.92308
    }
}
