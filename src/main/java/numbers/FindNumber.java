package numbers;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FindNumber {

  public static void main(String[] args) {
    int[] numbers = {4, 66, -21, 1, 87};
    log.info(" Minimum number is : {}", findMinimumNumber(numbers));
  }

  static int findMinimumNumber(int[] numbers) {
    int minimumNumber = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i] < minimumNumber) {
        minimumNumber = numbers[i];
      }
    }
    return minimumNumber;
  }
}
