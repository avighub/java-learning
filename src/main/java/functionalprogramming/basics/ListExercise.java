package functionalprogramming.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ListExercise {

  public static void main(String[] args)
    {
      ArrayList<String> listOfCycleBrands = new ArrayList<>();
      listOfCycleBrands.add("merida");
      listOfCycleBrands.add("avon");
      listOfCycleBrands.add("merida");
      listOfCycleBrands.add("hero");
      listOfCycleBrands.add("hercules");
      listOfCycleBrands.add("giant");
      listOfCycleBrands.add("avon");
      listOfCycleBrands.add("trek");
      listOfCycleBrands.add("kona");
      listOfCycleBrands.add("giant");

      System.out.println("Original List: " + listOfCycleBrands);

      ListExercise listExercise = new ListExercise();

      ArrayList<String> listWithDuplicateRemoved = listExercise.removeDuplicateFromList(listOfCycleBrands);
      System.out.println("List After removing duplicates: " + listWithDuplicateRemoved);

      System.out.println("List after sorting: " + listExercise.sortList(listWithDuplicateRemoved));

      listExercise.printTextStartingByChar("h", listWithDuplicateRemoved);


      // Solving the problem using stream
      listOfCycleBrands.stream()
              .distinct()
              .sorted()
              .filter(s -> s.startsWith("h"))
              .forEach(System.out::println);
    }

  ArrayList<String> removeDuplicateFromList(ArrayList<String> list)
    {
      return new ArrayList<>(new HashSet<>(list));
    }

  ArrayList<String> sortList(ArrayList<String> list)
    {
      Collections.sort(list);
      return list;
    }

  void printTextStartingByChar(String c, ArrayList<String> list)
    {
      System.out.println("Strings starting with character: " + c);
      for (String s : list) {
        if (s.startsWith(c)) {
          System.out.println(c);
        }
      }
    }


}
