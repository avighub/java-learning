package exercises.oddnumber;

public class PrintOddNumbers {

  public static void main(String[] args)
    {
      printOddNumbersWithinRange(10, 3);
    }

  public static void printOddNumbersWithinRange(int maxRange, int position)
    {
      int oddNumberCount = 0;
      for (int i = 1; i <= maxRange; i++) {
        if (i % 2 != 0) {
          if(oddNumberCount==position){
            System.out.println("Ignoring");
            continue;
          }else{
            System.out.println(i);
            oddNumberCount++;
          }

          System.out.println("oddNumberCount "+oddNumberCount);
        }
      }


    }


}
