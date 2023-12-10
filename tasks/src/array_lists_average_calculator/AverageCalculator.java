package array_lists_average_calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();

        while(true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            numbers.add(Double.parseDouble(input));
        };

        double average = 0;
        for(int i = 0; i < numbers.size(); i++) {
            average += numbers.get(i);
        }
        average /= numbers.size();

        System.out.println("Durchschnitt: " + average);
    }

}
