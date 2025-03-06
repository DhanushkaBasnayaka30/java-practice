public class InsertionSort {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                System.out.print("      inside  " + i + "itteration-->");
                printArray(arr);
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            System.out.print("after" + i + "itteration-->");
            printArray(arr);
        }
    }

    // Utility function to print the array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example usage
        int[] arr = { 5, 3, 8, 6, 2 };

        System.out.println("Original array:");
        printArray(arr);

        // Call the insertionSort method
        insertionSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
