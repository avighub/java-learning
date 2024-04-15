package array;

import java.util.Arrays;

public class LargestNumber {

  public static void main(String[] args) {
    int[] numbers = {1, 1, 2, 2, 3, 3, 4, 5};
    System.out.println(findLargestNumberUsingIteration(numbers).toString());
    System.out.println(findLargestNumberUsingStream(numbers).toString());
    System.out.println(findLargestNumberUsingSort(numbers).toString());
  }

  // Time Complexity: O(n), where n represents the size of the given array.
  //Auxiliary Space: O(1), no extra space is required, so it is a constant.
  static Integer findLargestNumberUsingIteration(int[] numbers) {
    int largestNumber = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      if (largestNumber < numbers[i]) {
        largestNumber = numbers[i];
      }
    }
    return largestNumber;
  }

  // Time Complexity: O(n), where n represents the size of the given array.
  //Auxiliary Space: O(1), no extra space is required, so it is a constant.
  static Integer findLargestNumberUsingStream(int[] numbers) {
    return Arrays.stream(numbers).max().getAsInt();
  }

  //  Time Complexity: O(n logn), where n represents the size of the given array.
//  Auxiliary Space: O(1), no extra space is required, so it is a constant.
  static Integer findLargestNumberUsingSort(int[] numbers) {
    Arrays.sort(numbers);
    return numbers[numbers.length - 1];
  }
}
