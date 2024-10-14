void main() {
    String a = "Hallo";
    String b = "Hallo";
    String c = new String("Hallo");

    System.out.println(a == b);
    System.out.println(a == c);
    System.out.println(a.equals(b));
    System.out.println(a.equals(c));
}