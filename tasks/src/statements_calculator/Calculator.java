void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Zahl 1:");
    Double a = scanner.nextDouble();

    System.out.println("Zahl 2:");
    Double b = scanner.nextDouble();

    Scanner stringScanner = new Scanner(System.in);
    System.out.println("Operator:");
    String operator = stringScanner.nextLine();

    double result;
    switch (operator) {
        case "+":
            result = a + b;
            break;
        case "-":
            result = a - b;
            break;
        case "*":
            result = a * b;
            break;
        case "/":
            if (b == 0) {
                System.out.println("Eine Division durch Null ist nicht möglich");
                return;
            }
            result = a / b;
            break;
        case "%":
            result = a % b;
            break;
        default:
            System.out.println("Dieser Operator ist nicht bekannt");
            return;
    }

    System.out.println(a + " " + operator + " " + b + " = " + result);
}
