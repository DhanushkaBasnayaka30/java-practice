public class LinearSearch {

  public static void main(String args[]) {
    int[] arr = { 10, 20, 320, 320, 45, 21, 56, 4, 2 };

    int target = 320;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        System.out.println("Founded in Index: " + i); 
        break;
      } else {
        System.out.println("not Found give another target");
      }
    }
  }
}
