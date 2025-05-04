public class MergeSort {

  public static void divide(int[] A, int left, int right) {

    if (left < right) {

      int mid_point = left + (right - left) / 2;

      divide(A, left, mid_point);
      divide(A, mid_point + 1, right);

      merge(A, left, mid_point, right);
    }

  }

  public static void merge(int[] A, int left, int mid_point, int right) {
    int n1 = mid_point - left + 1;
    int n2 = right - mid_point;

    int[] left_arr = new int[n1];
    int[] right_arr = new int[n2];

    // copy data to left array
    for (int i = 0; i < n1; i++) {
      left_arr[i] = A[left + i];
    }

    //copy data to right array
    for (int j = 0; j < n2; j++) {
      right_arr[j] = A[mid_point + 1 + j];

    }

    int i = 0;
    int j = 0;
    int k = left;

    while (i < n1 && j < n2) {
      if (left_arr[i] <= right_arr[j]) {
        A[k] = left_arr[i];
        i++;
      } else {
        A[k] = right_arr[j];
        j++;
      }
      k++;
    }
    while (i < n1) {
      A[k] = left_arr[i];
      k++;
      i++;
    }
    while (j < n2) {
      A[k] = right_arr[j];
      k++;
      j++;
    }

  }

  public static void printArr(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
    }
  }

  public static void main(String args[]) {
    int[] A = { 1, 4, 3, 5, 7, 9 };

    
    // printArr(A);
    divide(A, 0, A.length - 1);
    printArr(A);

  }
}