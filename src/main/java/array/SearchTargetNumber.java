package array;

public class SearchTargetNumber {

  public static void main(String[] args)
    {
      int[] numbers = {3, 55, 11, 65, 2, 0, 22, 44};
      System.out.println("Target element is found at the index: " + findNumberAndReturnIndex(numbers, 46));
      System.out.println("Is Target element found ?: " + isNumberFound(numbers, 11));
      System.out.println("Target element is found at the index: " + findNumberInRangeAndReturnIndex(numbers, 11, 2, 5));
    }

  static int findNumberAndReturnIndex(int[] numbers, int targetNumber)
    {
      for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] == targetNumber) {
          return i;
        }
      }
      return -1; // Returns -1 if target is not found in Array
    }

  static boolean isNumberFound(int[] numbers, int targetNumber)
    {
      for (int number : numbers) {
        if (number == targetNumber) {
          return true;
        }
      }
      return false;
    }

  static int findNumberInRangeAndReturnIndex(int[] numbers, int targetNumber, int startRange, int endRange)
    {
      for (int i = startRange; i <= endRange; i++) {
        if (numbers[i] == targetNumber) {
          return i;
        }
      }
      return -1; // Returns -1 if target is not found in Array
    }
}
