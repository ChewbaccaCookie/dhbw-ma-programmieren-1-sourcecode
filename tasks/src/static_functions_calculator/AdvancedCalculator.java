void main() {
    double result = 0;
    boolean useLastResult = false;

    while (true) {
        char operator = getOperatorInput();
        if (operator == 'q') {
            System.out.println("Der Taschenrechner wird beendet");
            return;
        }

        if (operator == 'c') {
            useLastResult = false;
            result = 0;
            System.out.println("Der Taschenrechner wurde zurückgesetzt");
            continue;
        }

        if (operator != '+' && operator != '-' && operator != '/' && operator != '*' && operator != '%' && operator != '!') {
            System.out.println("Dieser Operator ist nicht erlaubt. Versuchen Sie es erneut!");
            continue;
        }

        double[] numbers = getNumberInput(operator, useLastResult, result);

        result = calculate(operator, numbers);

        printCalculation(numbers[0], numbers[1], operator, result);
        useLastResult = true;
    }
}

double calculate(char operator, double[] numbers) {
    double result = 0;
    switch (operator) {
        case '+':
            result = add(numbers[0], numbers[1]);
            break;
        case '-':
            result = subtract(numbers[0], numbers[1]);
            break;
        case '*':
            result = multiply(numbers[0], numbers[1]);
            break;
        case '/':
            result = divide(numbers[0], numbers[1]);
            break;
        case '%':
            result = mod(numbers[0], numbers[1]);
            break;
        case '!':
            result = faculty(numbers[0]);
            break;
        default:
            System.out.println("Dieser operator ist nicht erlaubt");

    }
    return result;
}

double add(double zahl1, double zahl2) {
    return zahl1 + zahl2;
}

double subtract(double zahl1, double zahl2) {
    return zahl1 - zahl2;
}

double multiply(double zahl1, double zahl2) {
    return zahl1 * zahl2;
}

double divide(double zahl1, double zahl2) {
    if (zahl2 == 0) {
        System.out.println("Durch 0 darf nicht geteilt werden.");
        return 0;
    }
    return zahl1 / zahl2;
}

double mod(double zahl1, double zahl2) {
    return zahl1 % zahl2;
}

double faculty(double zahl) {
    int fact = 1;
    for (int i = 1; i <= zahl; i++) {
        fact = fact * i;
    }
    return fact;
}


double[] getNumberInput(char operator, boolean useResult, double result) {
    Scanner inputScanner = new Scanner(System.in);
    double[] numbers = new double[2];

    if (useResult) {
        numbers[0] = result;
    } else {
        System.out.println("Gebe Zahl 1 ein:");
        numbers[0] = inputScanner.nextDouble();
    }

    if (operator != '!') {
        System.out.println("Gebe Zahl 2 ein:");
        numbers[1] = inputScanner.nextDouble();
    }

    return numbers;
}

char getOperatorInput() {
    Scanner inputScanner = new Scanner(System.in);
    System.out.println("Gebe den Operator ein (c um das vorherige Ergebnis zu löschen, q um das Programm zu beenden):");
    return inputScanner.nextLine().charAt(0);
}

void printCalculation(double number1, double number2, char operator, double result) {
    System.out.println(number1 + " " + operator + " " + number2 + " = " + result);
}
