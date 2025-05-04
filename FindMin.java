public class FindMin {
  public static void main(String[] args) {
    int[] arr = { 10, 20, 320, 320, 45, 21, 56, 2, 2 };
    int min = arr[0];
    int tmp =0;
    for (int i = 1; i < arr.length; i++) {
      if (min > arr[i]) {
        tmp = min;
        min = arr[i];
      }
    }
    System.out.println("minimum value : " + min);
    System.out.println("second Minmum value "+ tmp);
  }
}
