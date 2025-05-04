import java.util.Scanner;
public class UserInput {
  
  public static void main(String[] args) {
    Scanner myOBJ = new Scanner(System.in);
    System.out.println("what you want ? ");
    String user_input = myOBJ.nextLine();
    System.out.println("This is you Wanted: "+user_input);
    System.out.println(user_input.getClass().getTypeName());
  }
}
