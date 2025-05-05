public class FactorialNumber {

  public static int FactorialSeries(int number) {
    if (number == 0) {
      return 1;
    }
    int result = number * FactorialSeries(number - 1);
    System.out.print(result + " "); 
    return result;
  }

  public static void main(String[] args) {
    int number = 4;
    int output = 1;
    for (int i = 1; i <= number; i++) {
      output *= i;
      if (i == number) {

        System.out.print(i + " = ");
      } else {

        System.out.print(i + "*");
      }

    }
    System.out.println(output);

    System.out.println(FactorialSeries(4));
  }
}
