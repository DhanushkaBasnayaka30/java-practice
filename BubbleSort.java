class BubbleSort {

  public static void main(String[] args) {

    int[] numbers = { 10, 20, 320, 320, 45, 21, 56, 4, 2 };
    int length1 = numbers.length;
    System.out.println(length1);

    for (int i = 0; i < numbers.length-1; i++) {
      for (int j = 0; j < numbers.length-1; j++) {
        if (numbers[j] < numbers[j + 1]) {
          int tmp = numbers[j];
          numbers[j] = numbers[j + 1];
          numbers[j + 1] = tmp;
        }
      }
    }
    for (int element : numbers) {
      
      System.out.print(element+" , ");
    }
  }
}