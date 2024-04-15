package array;

import java.util.Arrays;
import java.util.Collections;

public class Sorting {

  public static void main(String[] args) {
    // Sort all elements in natural order
    char[] characters = {'a', 'f', 'r', 'g', 'b', 'z'};
    sortCharArrayInNaturalOrder(characters);

    // sort based on index range - sub array
    char[] characters2 = {'a', 'f', 'r', 'g', 'b', 'z'};
    sortCharArrayInNaturalOrderWithIndex(characters2, 3, 5);


    Integer[] numbers = {1, 1, 2, 2, 3, 3, 4, 5};
    sortIntegerInReverse(numbers);

    int[] primitiveNumbers = {1, 1, 2, 2, 3, 3, 4, 5};
    sortPrimitiveNumbersInReverse(primitiveNumbers);

    int[] primitiveNumbers2 = {1, 1, 2, 2, 3, 3, 4, 5};
    sortNumberUsingTraditionalLoop(primitiveNumbers2);

  }

  private static void sortCharArrayInNaturalOrder(char[] characters) {
    // sorting naturally
    Arrays.sort(characters);
    System.out.println("Sorted in natural order" + Arrays.toString(characters));
  }

  private static void sortCharArrayInNaturalOrderWithIndex(char[] characters, int from_index, int to_index) {
    Arrays.sort(characters, from_index, to_index);
    System.out.println("Sorted from 4th to 6th: " + Arrays.toString(characters));
  }

  private static void sortPrimitiveNumbersInReverse(int[] numbers) {
    // Arrays.sort(numbers, Collections.reverseOrder()); // Collections.reverseOrder() wont work for primitive array
    Integer[] convertedInt = new Integer[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
      convertedInt[i] = numbers[i];
    }
    Arrays.sort(convertedInt, Collections.reverseOrder());
    System.out.println("Reversed primitive int: " + Arrays.toString(convertedInt));
  }

  private static void sortIntegerInReverse(Integer[] numbers) {
    Arrays.sort(numbers, Collections.reverseOrder());
    System.out.println("Sorted Integer in reverse : " + Arrays.toString(numbers));
  }

  private static void sortNumberUsingTraditionalLoop(int[] numbers) {
    // sort in ascending order
    Arrays.sort(numbers);

    System.out.println("Primitive numbers reverse sorted using for loop:");
    for (int i = numbers.length - 1; i > 0; i--) {
      System.out.print(numbers[i]);
    }

  }

  private static void  removeElementFromArray(int[] numbers){

  }

}


