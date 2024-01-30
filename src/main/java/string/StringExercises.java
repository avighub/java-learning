package string;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StringExercises {
  public static void main(String[] args)
    {
      printWordsWithEvenLength("Sky is blue and vast");
    }

  static void printWordsWithEvenLength(String sentence)
    {
      // Split string with space and store
      String[] splitString = sentence.split(" ");

      // iterate and find words length and if even print
      for (String word : splitString) {
        if (word.length() % 2 == 0) {
          log.info(word);
        }
      }
    }
}
