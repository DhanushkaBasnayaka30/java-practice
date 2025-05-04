public class CountWords {
  public static void main(String[] args) {
    String sectence = "java is OOP language, it has more features";
    int countwords = sectence.split("\\s").length;
    System.out.println(countwords);
  }
}
