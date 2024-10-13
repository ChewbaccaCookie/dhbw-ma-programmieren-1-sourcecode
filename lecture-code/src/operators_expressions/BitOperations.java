void main() {
    //Bitweise Logische Operatoren
    byte isAdult = 15;
    byte isMale = 102;

    System.out.println(~isAdult);
    System.out.println(isAdult & isMale);
    System.out.println(isAdult | isMale);
    System.out.println(isAdult ^ isMale);

    System.out.println("Bitshift operatoren:");

    byte x = 1;
    byte y = -1;

    System.out.println(x << 1);
    System.out.println(y >> 1);
    System.out.println(y >>> 1);
}
