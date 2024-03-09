package string;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StringUtilityMethods {

  public static void main(String[] args) {
    printNumberToString(3);
  }

  private static void printNumberToString(int number){
    log.info(String.valueOf(number));
  }
}
