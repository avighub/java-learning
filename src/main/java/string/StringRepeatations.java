package string;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
public class StringRepeatations {

  public static void main(String[] args)
    {
      printRepeatedOccurrenceOfCharacterInString();
      printRepeatedOccurrenceOfCharacterInStringUsingStreams();
    }

  static void printRepeatedOccurrenceOfCharacterInString()
    {
      String stringWithRepeatedCharacter = "avishekhssarrtbvccff";
      Map<Character, Integer> occurrenceLog = new HashMap<>();
      char[] convertedToChar = stringWithRepeatedCharacter.toCharArray();
      int occuranceCount = 0;
      for (Character c : convertedToChar) {
        for (int i = 0; i < convertedToChar.length; i++) {
          if (c == convertedToChar[i]) {
            occuranceCount++;
          }
        }
        occurrenceLog.put(c, occuranceCount);
        occuranceCount = 0;
      }
      log.info(occurrenceLog.toString());
    }

  static void printRepeatedOccurrenceOfCharacterInStringUsingStreams()
    {
      String stringWithRepeatedCharacter = "avishekhssarrtbvccff";
      Map<Character, Long> occurrenceLog = stringWithRepeatedCharacter.chars()
              .mapToObj(c -> (char) c)
              .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

      log.info(occurrenceLog.toString());
    }
}
