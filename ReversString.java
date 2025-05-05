import java.util.Scanner;

public class ReversString {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Word");
    String user_input = input.nextLine();
    String ReversSring = "";
    for (int i = user_input.length()-1; i >= 0; i--) {
      ReversSring += user_input.charAt(i);
      
    }
    
    if(user_input.equals(ReversSring)){
      System.out.println("user_input--> "+user_input);
      System.out.println("ReverseOrder--> "+ReversSring);
      System.out.println("it is palindrom");
    }
  }
}
