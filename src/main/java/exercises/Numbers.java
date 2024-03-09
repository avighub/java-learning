package exercises;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Numbers {

  public static void main(String[] args) {
    printOddNumbersWithinPosition1(10, 4);
    printOddNumbersWithinPosition2(10, 4);
    printFibonacciSeries(8);
  }

  static void printOddNumbersWithinPosition1(int maxRange, int position) {
    for (int i = 1; i <= maxRange; i++) {
      if (i != position) {
        if (isOddNumber(i)) {
          log.info(String.valueOf(i));
        }
      } else
        break;
    }
  }

  static boolean isOddNumber(int number) {
    return number % 2 != 0;
  }

  static void printOddNumbersWithinPosition2(int maxRange, int position) {
    for (int i = 1; i < maxRange; i += 2) {
      log.info(String.valueOf(i));
      if (i == position || i + 1 == position) {
        break;
      }
    }
  }

  static void printFibonacciSeries(int range) {
    int result = 0;
    for (int i = 1; i <= range; i++) {
      result = result + i;
    }
    log.info("Fibonacci series of {} : {}", range, result);
  }
}
