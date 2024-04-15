package array;

import java.util.ArrayList;
import java.util.HashSet;

public class FindDuplicate {
  public static void main(String[] args) {
    int[] numbers = {2, 3, 3, 4, 5, 2, 6, 5, 6};
    System.out.println(findDuplicateElementInArrayUsingNestedFor(numbers));
    System.out.println(findDuplicateElementInArrayUsingHashSetLogic(numbers));
  }

  private static ArrayList<Integer> findDuplicateElementInArrayUsingNestedFor(int[] numbers) {
    ArrayList<Integer> duplicates = new ArrayList<>();
    int count;
    for (int i = 0; i < numbers.length; i++) {
      count=0;
      for (int j = 0; j < numbers.length; j++) {
        if (numbers[i] == numbers[j]) {
          count++;
        }
      }
      if (count > 1 && !duplicates.contains(numbers[i])) {
        duplicates.add(numbers[i]);
      }
    }
    return duplicates;
  }

  private static HashSet<Integer> findDuplicateElementInArrayUsingHashSetLogic(int[] numbers) {
    HashSet<Integer> duplicates = new HashSet<>();
    HashSet<Integer> result = new HashSet<>();
    for (int number : numbers) {
      if (!result.add(number)) {
        duplicates.add(number);
      }
    }
    return duplicates;
  }

}
