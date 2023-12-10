package arrays_scalar;

public class ScalarProduct {
    public static void main(String[] args) {
        int[] v1 = {1,2,3};
        int[] v2 = {4,5,6};

        int scalarProduct = 0;
        for (int i = 0; i < v1.length; i++) {
            scalarProduct += v1[i] * v2[i];
        }

        System.out.println("v1*v2 = " + scalarProduct);
    }
}
