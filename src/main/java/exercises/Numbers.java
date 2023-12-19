package exercises;

public class Numbers {

  public static void main(String[] args)
    {
      printOddNumbersWithinPosition1(10, 4);
      printOddNumbersWithinPosition2(10, 4);
    }

  static void printOddNumbersWithinPosition1(int maxRange, int position)
    {
      for (int i = 1; i <= maxRange; i++) {
        if (i != position) {
          if (isOddNumber(i)) {
            System.out.println(i);
          }
        } else
          break;
      }
    }

  static boolean isOddNumber(int number)
    {
      if (number % 2 != 0) {
        return true;
      }
      return false;
    }

  static void printOddNumbersWithinPosition2(int maxRange, int position)
    {
      for (int i = 1; i < maxRange; i += 2) {
        System.out.println(i);
        if (i == position || i + 1 == position) {
          break;
        }
      }
    }
}
