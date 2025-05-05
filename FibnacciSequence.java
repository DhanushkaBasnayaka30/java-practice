public class FibnacciSequence {
  public static void main(String[] args) {
    int target = 6;
    int a = 0, b = 1;
    for (int i = 0; i < target; i++) {
      System.out.print(a+" ");
      int next = a+b;
      a= b;
      b =next;
    }
  }
}
