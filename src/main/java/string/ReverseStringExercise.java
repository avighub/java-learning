package string;


public class ReverseStringExercise {
  private StringBuilder reverseString(String stringToReverse)
    {
      char[] stringToChar = stringToReverse.toCharArray();
      // Use StringBuilder instead of StringBuffer due to its single threaded usage
      StringBuilder stringBuilder = new StringBuilder();
      for (int i = stringToChar.length - 1; i >= 0; i--) {
        stringBuilder.append(stringToChar[i]);
      }
      return stringBuilder;
    }

  public static void main(String[] args)
    {
      ReverseStringExercise reverseStringExercise = new ReverseStringExercise();
      System.out.println(reverseStringExercise.reverseString("hello"));
    }
}
