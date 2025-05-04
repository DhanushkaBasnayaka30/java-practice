public class ForEach {

  public static void main(String[] args) {
    int[] arr = { 2, 5, 8, 12, 16, 23, 38 };
    int sum = 0;
    int max  = 0;
    for (int element : arr) {
       sum = sum + element;
      // System.out.print(element);
      if(max <element){
        max = element;
      }
      
    }
    System.out.println(sum);
    System.out.println(max);
  }
}
