package array;


import java.util.Arrays;

public class TwoDimensionalArray {
  public static void main(String[] args)
    {
      int[][] numbers = {
              {1, 2, 3},
              {4, 5, 6, 7},
              {8, 9, 10, 11, 12}
      };
      print2DArrayUsingForLoop(numbers);
      print2DArrayUsingForEachLoop(numbers);
      print2DArrayUsingArrayToString(numbers);
    }

  // Time Complexity: O(N*M) where N is the number of rows in the matrix and M is the number of columns in the matrix.
  //  Auxiliary Space: O(1)
  static void print2DArrayUsingForLoop(int[][] numbers)
    {
      for (int row = 0; row < numbers.length; row++) {
        for (int col = 0; col < numbers[row].length; col++) {
          System.out.print(numbers[row][col] + " ");
        }
      }
    }

  // Time Complexity: O(N*M) where N is the number of rows in the matrix and M is the number of columns in the matrix.
  // Auxiliary Space: O(1)
  static void print2DArrayUsingForEachLoop(int[][] numbers)
    {
      for (int[] row : numbers) {
        for (int col : row) {
          System.out.print(col + " ");
        }
      }
    }

  // Time Complexity: O(N*M)
  // Auxiliary Space: O(1)
  static void print2DArrayUsingArrayToString(int[][] numbers)
    {
      for (int[] row : numbers) {
        System.out.println(Arrays.toString(row));
      }
    }

}

