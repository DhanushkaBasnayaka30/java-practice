public class SelectionSort {

  public static void main(String[] args) {
    int[] arr = { 10, 20, 320, 320, 45, 21, 56, 4, 2 };
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      int maxIndex = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[maxIndex] > arr[j]) {
          maxIndex = j;

        }

      }
      int tmp = arr[maxIndex];
      arr[maxIndex] = arr[i];
      arr[i] = tmp;
    }

    for (int element : arr) {
      System.out.print(element + " , ");
    }
  }
}
