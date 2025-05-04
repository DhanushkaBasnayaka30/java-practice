public class BinarySearch {

  public static int Binarysearch(int[] arr, int target) {
    int low = 0;
    int high = arr.length - 1;

    while (low <= high) {
      int mid = (low + high) / 2;
      System.out.println("mid value " + mid);
      if (arr[mid] == target) {
        return mid;
      } else if (arr[mid] < target) {
        low = mid + 1; // search right half
        // Binarysearch(arr, target)
      } else {
        high = mid - 1;
      }
    }
    return -1;
  }

  public static void main(String args[]) {
    int[] arr = { 2, 5, 8, 12, 16, 23, 38 };

    int outputIndex = Binarysearch(arr, 23);
    System.out.println(outputIndex);
  }
}