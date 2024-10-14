void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please confirm with 'y' or 'n'");

    String input = scanner.nextLine();

    if (!input.equals("y") && !input.equals("n")) {
        System.out.println("Invalid input");
        return;
    }

    System.out.println("You entered: " + input);
}