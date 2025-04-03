package array;

import java.util.Arrays;
import java.util.List;

public class ArrayBasics {
    /**
     * IF we try to access element outside index: ArrayIndexOutOfBoundsException
     */

    public static void main(String[] args) {
        // char array using literals
        char[] characters = {'a', 'f', 'r', 'g', 'b', 'z'};
        System.out.println(Arrays.toString(characters));

        // int array using literals
        int[] numbers = {1, 1, 2, 2, 3, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        // iterate array using enhanced loop
        for (int number : numbers) {
            System.out.print(number + "\n");
        }

        // iterate array using for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number in index " + i + "= " + numbers[i]);
        }

        // Creating Array object
        int[] marks = new int[5];
        marks[0] = 20;
        marks[1] = 30;
        marks[2] = 40;
        marks[3] = 50;
        marks[4] = 60;
        System.out.println(Arrays.toString(marks));

        // Create a mutable list array
        List<String> list = Arrays.asList("A", "B");
        System.out.println("List before update: " + list);
        list.set(0, "C");
        System.out.println("List after replace: " + list);
        list.add("Z"); // runtime error: java.lang.UnsupportedOperationException

    }


}
