package operators_expressions;

public class BitOperations {

    public static void main(String[] args) {
        //Bitweise Logische Operatoren
        byte isAdult = 15;
        byte isMale = 102;

        System.out.println(~isAdult); // -16
        System.out.println(isAdult & isMale); // 6
        System.out.println(isAdult | isMale); // 111
        System.out.println(isAdult ^ isMale); // 105

        // Bitshift operatoren
        byte x = 1;
        byte y = -1;

        System.out.println(x << 1); // 2
        System.out.println(y >> 1); // -1
        System.out.println(y >>> 1); // 2147483647
    }
}
