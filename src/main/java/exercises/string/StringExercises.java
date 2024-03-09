package exercises.string;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StringExercises {
  public static void main(String[] args) {
    printWordsWithEvenLength("Sky is blue and vast");

    log.info(getSubstring("world", 2)); //returns substring starting from specified index
    log.info(String.valueOf(getIndexOfMatchedString("world", "r"))); //returns 2
    log.info(getExtensionNameOfAFile("movie.mp4")); //returns mp4
    log.info(getExtensionNameOfAFileUsingSplit("movie.mp4")); //returns mp4
  }

  static void printWordsWithEvenLength(String sentence) {
    // Split string with space and store
    String[] splitString = sentence.split(" ");

    // iterate and find words length and if even print
    for (String word : splitString) {
      if (word.length() % 2 == 0) {
        log.info(word);
      }
    }
  }

  static String getSubstring(String someString, int index) {
    return someString.substring(index);
  }

  static int getIndexOfMatchedString(String someString, String stringToMatch) {
    return someString.indexOf(stringToMatch);
  }

  static String getExtensionNameOfAFile(String fileNameWithExtension) {
    int indexOfDotChar = fileNameWithExtension.indexOf(".");
    return fileNameWithExtension.substring(indexOfDotChar + 1);
  }

  static String getExtensionNameOfAFileUsingSplit(String fileNameWithExtension) {
    String[] splitStrings = fileNameWithExtension.split("\\.");
    return splitStrings[1];
  }
}
