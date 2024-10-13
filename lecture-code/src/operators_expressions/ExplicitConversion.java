void main() {
    float f = 987.654f;
    System.out.println(f);

    //Konvertierung mit Genauigkeitsverlust
    int i = (int) f;
    byte b = (byte) i;
    System.out.println(i);
    System.out.println(b);

    //Konvertierung ohne Genauigkeitsverlust
    b = (byte) (b + 1);
    f = (float) i / 13;
    System.out.println(b);
    System.out.println(f);

    //Stringkonvertierung
    String strB = Byte.toString(b);
    String strF = Float.toString(f);
    String strI = Integer.toString(i);
    // ...
}