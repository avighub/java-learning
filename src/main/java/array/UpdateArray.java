package array;

import java.util.Arrays;

public class UpdateArray {
  public static void main(String[] args) {
    int[] numbers = {1, 1, 2, 2, 3, 3, 4, 5};
    System.out.print("Print numbers before update: \n");
    System.out.println(Arrays.toString(numbers));

    numbers[1] = 9;
    System.out.print("\nPrint numbers after update: \n");
    System.out.println(Arrays.toString(numbers));
  }
}
