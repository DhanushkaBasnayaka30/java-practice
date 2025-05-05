public class StarPatten {
  public static void main(String[] args) {
    for (int i = 0; i <= 5; i++) {
      System.out.println();
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
    }

    for (int i = 0; i <= 5; i++) {
      System.out.println();
      for (int j = 5 - i; j >= 0; j--) {
        System.out.print("*");
      }
    }

    for (int i = 0; i <= 5; i++) {
      System.out.println();
      for (int j = i; j < 5; j++) {

        System.out.print(" ");

      }
      for (int k = 1; k <= (2*i -1); k++) {
        System.out.print("*");
      }
    }


    for (int i = 5; i >= 0; i--) {
      System.out.println();
      for (int j = 5; j >i; j--) {

        System.out.print(" ");

      }
      for (int k = 1; k <= (2*i -1); k++) {
        System.out.print("*");
      }
    }
  }
}
