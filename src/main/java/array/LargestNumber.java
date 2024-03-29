package array;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class LargestNumber {

  public static void main(String[] args)
    {
      int[] numbers = {1, 1, 2, 2, 3, 3, 4, 5};
      log.info(findLargestNumberUsingIteration(numbers).toString());
      log.info(findLargestNumberUsingStream(numbers).toString());
      log.info(findLargestNumberUsingSort(numbers).toString());
    }

  // Time Complexity: O(n), where n represents the size of the given array.
  //Auxiliary Space: O(1), no extra space is required, so it is a constant.
  static Integer findLargestNumberUsingIteration(int[] numbers)
    {
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
  static Integer findLargestNumberUsingStream(int[] numbers)
    {
      return Arrays.stream(numbers).max().getAsInt();
    }

  //  Time Complexity: O(n logn), where n represents the size of the given array.
//  Auxiliary Space: O(1), no extra space is required, so it is a constant.
  static Integer findLargestNumberUsingSort(int[] numbers)
    {
      Arrays.sort(numbers);
      return numbers[numbers.length - 1];
    }
}
