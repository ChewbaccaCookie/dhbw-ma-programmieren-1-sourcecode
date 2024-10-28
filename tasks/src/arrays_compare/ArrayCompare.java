void main() {
    int[] a = {34, 17, 65};
    int[] b = {34, 17, 65};

    if (a.length != b.length) {
        System.out.println("Arrays sind nicht gleich");
        return;
    }

    for (int i = 0; i < a.length; ++i) {
        if (a[i] != b[i]) {
            System.out.println("Arrays sind nicht gleich");
            return;
        }
    }

    System.out.println("Arrays sind gleich");
}
