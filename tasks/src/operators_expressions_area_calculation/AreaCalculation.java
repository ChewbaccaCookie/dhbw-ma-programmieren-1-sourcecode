package operators_expressions_area_calculation;

public class AreaCalculation {

    public static void main(String[] args) {
        double length = 5;
        double width = 10;
        double radius = 6;
        final double PI = 3.141;

        double areaRectangle;
        double areaCircle;
        areaRectangle = length * width;
        areaCircle = radius * radius * PI;

        System.out.println("areaRectangle = " + areaRectangle);

        System.out.println("areaCircle = " + areaCircle);

        double ratio = (areaCircle / areaRectangle) * 100;

        System.out.println("ratio = " + ratio + "%");
    }
}
