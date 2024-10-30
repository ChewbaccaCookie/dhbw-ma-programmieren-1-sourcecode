void main() {
    char operator = getOperatorInput();

    double[] numbers = getNumberInput(operator);

    double result = calculate(operator, numbers);

    printCalculation(numbers[0], numbers[1], operator, result);
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


double[] getNumberInput(char operator) {
    Scanner inputScanner = new Scanner(System.in);
    double[] numbers = new double[2];

    System.out.println("Gebe Zahl 1 ein:");
    numbers[0] = inputScanner.nextDouble();

    if (operator != '!') {
        System.out.println("Gebe Zahl 2 ein:");
        numbers[1] = inputScanner.nextDouble();
    }

    return numbers;
}

char getOperatorInput() {
    Scanner inputScanner = new Scanner(System.in);
    System.out.println("Gebe den Operator ein:");
    return inputScanner.nextLine().charAt(0);
}

void printCalculation(double number1, double number2, char operator, double result) {
    System.out.println(number1 + " " + operator + " " + number2 + " = " + result);
}

