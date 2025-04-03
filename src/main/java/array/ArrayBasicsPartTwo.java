package array;


import java.util.List;

public class ArrayBasicsPartTwo {
    public static void main(String[] args) {
        // Declare and array with Elements
        List<String> names = List.of("Manoj", "Avishek");

        // iterate array with for loop
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        // iterate array with enhanced for loop
        for (String name : names) {
            System.out.println(name);
        }

        // iterate array with while loop
        int arrayLength = names.size();
        int counter = 0;
        while (arrayLength == 0) {
//            System.out.println(names.get());
        }
    }

}
