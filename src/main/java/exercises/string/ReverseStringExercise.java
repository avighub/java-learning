package exercises.string;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReverseStringExercise {
  public static void main(String[] args) {
    ReverseStringExercise reverseStringExercise = new ReverseStringExercise();
    log.info(reverseStringExercise.reverseString("hello").toString());
  }

  private StringBuilder reverseString(String stringToReverse) {
    char[] stringToChar = stringToReverse.toCharArray();
    // Use StringBuilder instead of StringBuffer for faster and single threaded use case
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = stringToChar.length - 1; i >= 0; i--) {
      stringBuilder.append(stringToChar[i]);
    }
    return stringBuilder;
  }
}
