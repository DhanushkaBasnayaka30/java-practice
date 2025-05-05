import java.util.Scanner;
public class PrimeNUmber {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter your Number: ");
    int Number =input.nextInt();
    // int Number = 29;
    boolean itIs_Prime = true;
    if (Number > 0) {
      for (int i = 2; i <= Number; i++) {
        if (i == Number) {
          continue;
        } else if (Number % i == 0) {
          itIs_Prime = false;
          break;
        }
      }
    }
    System.out.println(Number + " it is prime " + itIs_Prime);
  }
}
