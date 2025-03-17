public class SwitchStatement {

  public static void main(String args[]){

    int numOFday = 3;
    String result = switch (numOFday) {
      case 1 -> "Monday";
      case 2 -> "Tuesday";
      case 3 -> "Wednesday"; // Fixed spelling
      case 4 -> "Thursday";
      case 5 -> "Friday";
      case 6 -> "Saturday";  // Fixed spelling
      case 7 -> "Sunday";
      default -> "Invalid day"; // Handle invalid cases
    };
    System.out.println(result);
  
  }

}
