import java.util.Scanner;

public class CreatingArrayFromUser {

  public static void main(String[] args) {
    int numbers[] = new int[5];
    Scanner input = new Scanner(System.in);
    for (int i = 0; i < 5; i++) {
      if (i == 0) {

        System.out.print("Enter 5 Int  value to creating array, "+" First value -->: ");
      } else {
        System.out.print((i +1)+ "value -->: ");
      }
      int UserInput = input.nextInt();
      numbers[i] = UserInput;
    }
    for (int element : numbers) {
      System.out.println(element);
    }
  }

}
