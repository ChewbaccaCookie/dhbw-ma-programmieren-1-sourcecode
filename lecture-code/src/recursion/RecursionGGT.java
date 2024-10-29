int ggtRecursive(int z1, int z2) {
    if (z2 == 0) {
        return z1;
    } else {
        return ggtRecursive(z2, z1 % z2);
    }
}

void main() {
    Scanner input = new Scanner(System.in);
    System.out.println("Geben Sie eine Ganzzahl z1 ein:");

    int z1 = input.nextInt();
    System.out.println("Geben Sie eine Ganzzahl z2 ein:");

    int z2 = input.nextInt();
    int ggt = ggtRecursive(z1, z2);

    System.out.println("GGT (rekursiv) = " + ggt);
}
