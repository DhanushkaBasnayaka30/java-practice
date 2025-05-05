public class CountVowels {
  public static void main(String[] args) {
    char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    String text = "Mother";
    int Number_OF_VOWELS=0;
  
    text = text.toLowerCase();  
    
    for (int k = 0; k < text.length(); k++) {
      char chara = text.charAt(k);  

      for (int i = 0; i < vowels.length; i++) {
        if (chara == vowels[i]) {  
        Number_OF_VOWELS++;
        }
      }
    }
    System.out.println(Number_OF_VOWELS);
  }
}
