String[] getInput() {
    String[] inputs = new String[3];
    Scanner scanner = new Scanner(System.in);

    System.out.println("Zahl 1:");
    inputs[0] = scanner.nextLine();

    System.out.println("Operator:");
    inputs[1] = scanner.nextLine();

    if (inputs[1].equals("!")) {
        // Hier wird ein Platzhalterwert gesetzt, welcher aber nicht weiter verwendet wird.
        inputs[2] = "-1";
        return inputs;
    }

    System.out.println("Zahl 2:");
    inputs[2] = scanner.nextLine();

    return inputs;
}

double add(double summand1, double summand2) {
    return summand1 + summand2;
}

double subtract(double minuend, double subtrahend) {
    return minuend - subtrahend;
}

double multiply(double faktor1, double faktor2) {
    return faktor1 * faktor2;
}

double divide(double dividend, double divisor) {
    return dividend / divisor;
}

double mod(double dividend, double divisor) {
    return dividend % divisor;
}

int faculty(int zahl) {
    for (int i = zahl - 1; i > 0; i--) {
        zahl *= i;
    }
    return zahl;
}

void output(double result) {
    System.out.println("Ergebnis:");
    System.out.println(result);
}

void main() {
    String[] inputs = getInput();
    double result;

    double a = Double.parseDouble(inputs[0]);
    double b = Double.parseDouble(inputs[2]);
    switch (inputs[1]) {
        case "+":
            result = add(a, b);
            break;
        case "-":
            result = subtract(a, b);
            break;
        case "*":
            result = multiply(a, b);
            break;
        case "/":
            if (b == 0) {
                System.out.println("Eine Division durch Null ist nicht möglich");
                return;
            }
            result = divide(a, b);
            break;
        case "%":
            result = mod(a, b);
            break;
        case "!":
            if (a < 0) {
                System.out.println("Fakultät kann nur von positiven Zahlen bestimmt werden.");
                return;
            }
            result = faculty((int) a);
            break;
        default:
            System.out.println("Dieser Operator ist nicht bekannt");
            return;
    }
    output(result);
}
