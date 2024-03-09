package array;

public class SearchTargetChar {

  public static void main(String[] args)
    {
      char[] characters = {'a', 'f', 'r', 'g', 'b', 'z'};
      String name = "Avishek";
      System.out.println("Target element is found at the index: " + findCharacterAndReturnIndex(characters, 'f'));
      System.out.println("Target element is found at the index: " + findCharacterAndReturnIndex(name.toCharArray(), 'f'));
      System.out.println("Is Target element found ?: " + isCharacterFound(characters, 'g'));
      System.out.println("Is Target element found ?: " + isCharacterFound(name.toCharArray(), 'g'));
      System.out.println("Target element is found at the index: " + findCharacterInRangeAndReturnIndex(characters, 'r', 2, 5));
    }

  static int findCharacterAndReturnIndex(char[] chars, char targetCharacter)
    {
      for (int i = 0; i < chars.length; i++) {
        if (chars[i] == targetCharacter) {
          return i;
        }
      }
      return -1; // Returns -1 if target is not found in Array
    }

  static boolean isCharacterFound(char[] chars, char targetCharacter)
    {
      for (char character : chars) {
        if (character == targetCharacter) {
          return true;
        }
      }
      return false;
    }

  static int findCharacterInRangeAndReturnIndex(char[] chars, char targetCharacter, int startRange, int endRange)
    {
      for (int i = startRange; i <= endRange; i++) {
        if (chars[i] == targetCharacter) {
          return i;
        }
      }
      return -1; // Returns -1 if target is not found in Array
    }
}
