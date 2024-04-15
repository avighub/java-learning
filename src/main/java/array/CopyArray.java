package array;

import java.util.Arrays;

public class CopyArray {
  public static void main(String[] args) {
    int[] numbers = {2,3,5,1,5};

    // Simple assignment
    int[] copyReference = new int[10];
    copyReference=numbers;
    System.out.println(Arrays.toString(copyReference));
    // change a value in original array
    numbers[0]=0; // also updates its copyReference
    System.out.println(Arrays.toString(numbers));
    System.out.println(Arrays.toString(copyReference));

    // Clone
    int[] cloneOfNumbers = new int[10];
    cloneOfNumbers = numbers.clone();
    System.out.println(Arrays.toString(cloneOfNumbers));

    // Array copy - More control of what to copy
    int[] copyOfNumbers = new int[10];
    System.arraycopy(numbers,1,copyOfNumbers,2,numbers.length-1);
    System.out.println(Arrays.toString(copyOfNumbers));

  }

}
