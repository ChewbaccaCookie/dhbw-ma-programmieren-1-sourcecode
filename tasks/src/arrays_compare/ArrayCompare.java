package arrays_compare;

public class ArrayCompare {
    public static void main(String[] args) {
        int[] a1 = {1,2,3};
        int[] a2 = {1,2,3};

        if(a1.length != a2.length) {
            System.out.println("Arrays sind nicht gleich");
            return;
        }

        for(int i = 0; i < a1.length; ++i) {
            if(a1[i] != a2[i]) {
                System.out.println("Arrays sind nicht gleich");
                return;
            }
        }

        System.out.println("Arrays sind gleich");
    }
}
