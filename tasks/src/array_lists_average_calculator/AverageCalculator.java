void main() {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Double> numbers = new ArrayList<>();

    while (true) {
        String input = scanner.nextLine();
        if (input.equals("")) {
            break;
        }
        numbers.add(Double.parseDouble(input));
    }

    double average = 0;
    for (int i = 0; i < numbers.size(); i++) {
        average += numbers.get(i);
    }
    average /= numbers.size();

    System.out.println("Durchschnitt: " + average);
}
