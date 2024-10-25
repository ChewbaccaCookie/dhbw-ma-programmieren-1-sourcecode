void main() {
    int[] a = {1, 2, 3};

    // Clone
    int[] b = new int[a.length];

    for (int i = 0; i < a.length; i++) {
        b[i] = a[i];
    }

    System.out.println(Arrays.toString(a));
    System.out.println(Arrays.toString(b));
}