void main() {
    ArrayList<String> names = new ArrayList<String>();

    names.add("Hans");
    names.add("Peter");

    System.out.println("names[0] = " + names.get(0));
    System.out.println("names.length = " + names.size());

    names.set(0, "Klaus");
    System.out.println("names[0] = " + names.get(0));

    names.remove(0);
    System.out.println("names.length = " + names.size());
    System.out.println("names[0] = " + names.get(0));
}