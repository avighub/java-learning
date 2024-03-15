package array;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;

@Slf4j
public class FindDuplicate {
  public static void main(String[] args) {
    int[] numbers = {2, 3, 3, 4, 5, 2, 6, 5, 6};
    log.info(findDuplicateElementInArrayUsingNestedFor(numbers).toString());
    log.info(findDuplicateElementInArrayUsingHashSetLogic(numbers).toString());
  }

  private static HashSet<Integer> findDuplicateElementInArrayUsingNestedFor(int[] numbers) {
    HashSet<Integer> duplicates = new HashSet<>();
    int count = 0;
    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers.length; j++) {
        if (numbers[i] == numbers[j]) {
          count++;
        }
      }
      if (count > 1) {
        duplicates.add(numbers[i]);
        count = 0;
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
