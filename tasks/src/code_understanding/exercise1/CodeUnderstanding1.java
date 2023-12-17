package code_understanding.exercise1;
public class CodeUnderstanding1 {
    public static void main(String[] args) {
        int numberA = 15;
        int numberB = 10;
        String[] fruits = {"Apple", "Orange", "Banana"};
        boolean isSunny = true;

        System.out.println("Sum of numberA and numberB: " + (numberA + numberB));

        if (fruits.length % 2 == 0) {
            System.out.println("The number of fruits is even.");
        } else {
            System.out.println("The number of fruits is odd.");
        }

        for (String fruit : fruits) {
            System.out.println("Length of " + fruit + ": " + fruit.length());
        }

        int i = 0;
        while (i < numberA) {
            System.out.println("While loop iteration " + (i + 1));
            i++;
        }

        do {
            System.out.println("Do-while loop iteration " + i);
            i--;
        } while (i > 0);

        if (numberA > numberB && isSunny) {
            System.out.println("NumberA is greater than numberB and it's sunny.");
        } else {
            System.out.println("Conditions not met.");
        }

        int product = calculateProduct(numberA, numberB);
        System.out.println("Product of numberA and numberB: " + product);

        System.out.println("End of the program");
    }

    private static int calculateProduct(int a, int b) {
        return a * b;
    }
}
