package collectionsframework.iterable.collection.list.arraylist;

import java.util.ArrayList;

public class DistinctNumber {
  public static void main(String[] args)
    {
      //      int numbers[] = {1, 1, 2, 2, 3, 3, 4, 5}; // C-Style array declaration
      int[] numbers = {1, 1, 2, 2, 3, 3, 4, 5}; // Java style array declaration

      System.out.println(findDistinctNumber(numbers));
    }

  // Time complexity : O(n^2)
  static ArrayList<Integer> findDistinctNumber(int[] numbers)
    {
      ArrayList<Integer> distinctNumbers = new ArrayList<>();

      for (int i : numbers) {
        int occurrence = 0;
        for (int j : numbers) {
          if (i == j) {
            occurrence++;
          }
        }
        if (occurrence == 1) {
          distinctNumbers.add(i);
        }
      }
      return distinctNumbers;
    }


}
