package string;

public class FindNumbersAndSum {

  public static void main(String[] args) {
    // Given below string , find the numbers and sum them up
    String stringWithNumbers = "sd20uy30kd40jj50";
    String stringWithNumbers2 = "sd20uy30kd40jj50dd";
    System.out.println(calculateSumOfNumbersFromString(stringWithNumbers));
    System.out.println(calculateSumOfNumbersFromString(stringWithNumbers2));
  }

  private static int calculateSumOfNumbersFromString(String stringWithNumbers) {
    int sum = 0;
    StringBuilder numberToSum = new StringBuilder();
    for (char character : stringWithNumbers.toCharArray()) {
      if (Character.isDigit(character)) {
        numberToSum.append(character);
      } else if (numberToSum.length() > 0) {
        sum += Integer.parseInt(numberToSum.toString());
        numberToSum.setLength(0);
      }
    }
    // Add the number present in the end
    if (numberToSum.length() > 0) {
      sum += Integer.parseInt(numberToSum.toString());
    }
    return sum;
  }

}
