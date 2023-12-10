package recursion_binary_search;

class BinarySearch {
    // Rekursive Methode zur binären Suche
    public static int recursiveBinarySearch(int[] sortedArray, int target, int left, int right) {
        if (left > right) {
            // Element nicht gefunden
            return -1;
        }

        int middle = left + (right - left) / 2;

        if (sortedArray[middle] == target) {
            // Element gefunden
            return middle;
        } else if (sortedArray[middle] < target) {
            // Das gesuchte Element liegt in der rechten Hälfte
            return recursiveBinarySearch(sortedArray, target, middle + 1, right);
        } else {
            // Das gesuchte Element liegt in der linken Hälfte
            return recursiveBinarySearch(sortedArray, target, left, middle - 1);
        }
    }

    public static void main(String[] args) {
        int[] searchArray = {9, 10, 13, 29, 33, 39, 45, 84};

        int elementToSearch = 45;

        int result = recursiveBinarySearch(searchArray, elementToSearch, 0, searchArray.length - 1);

        if (result != -1) {
            System.out.println("Das Element " + elementToSearch + " wurde an der Position " + result + " gefunden.");
        } else {
            System.out.println("Das Element " + elementToSearch + " wurde nicht im Array gefunden.");
        }
    }
}
