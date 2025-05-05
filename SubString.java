public class SubString {
  public static void main(String[] args) {
    String text = "Start with 0 and 1, then keep adding the last two numbers to get the next one.";
    String subString = "the";
    int count = 0;
    for (int i = 0; i < (text.length() - subString.length() + 1); i++) {
      String word = "";
      for (int j = i; j < (subString.length() + i); j++) {
        word += text.charAt(j);
      }
      if(word.equals(subString)){
        System.out.println(word);
        count++;
      }
      
    }
    System.out.println(count);
  }
}
