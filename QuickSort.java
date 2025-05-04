public class QuickSort {

  public static int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    int pivotIndex = (low - 1);
    for (int j = low; j < high; j++) {
      if (arr[j] <= pivot) {
        pivotIndex++;

        int tmp = arr[pivotIndex];
        arr[pivotIndex] = arr[j];
        arr[j] = tmp;
      }
    }

    int temp = arr[pivotIndex + 1];
    arr[pivotIndex + 1] = arr[high];
    arr[high] = temp;

    return pivotIndex + 1;
  }

  public static void quickSort(int[] arr, int low, int high) {
    if (low < high) {

      int pivotIndex = partition(arr, 0, high);
      System.out.println(pivotIndex);
      quickSort(arr, low, pivotIndex - 1);
      quickSort(arr, pivotIndex + 1, high);
    }
  }

  public static void main(String[] args) {
    int[] arr = { 10, 20, 320, 320, 45, 21, 56, 4, 2 };
    quickSort(arr, 0, (arr.length - 1));
    // for (int element : arr) {
    //   System.out.print(element + " , ");
    // }
  }
}
