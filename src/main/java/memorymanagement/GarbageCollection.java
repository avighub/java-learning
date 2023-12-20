package memorymanagement;

import java.util.ArrayList;

public class GarbageCollection {
  public static void main(String[] args)
    {
      unusedReference();
    }

  static void unusedReference()
    {
      int firstNumber = 10;
      int secondNumber = 25;
      firstNumber = secondNumber; // firstNumber is not eligible for garbage collection by JVM
      System.out.println(secondNumber);
    }

  static void methodScope()
    {
      GarbageCollection garbageCollection = new GarbageCollection();
      // Once method is executed, above object is eligible for Garbage Collection by JVM
    }

  static void objectBeingNull()
    {
      Integer number = 30;
      number = null; // Eligible for Garbage collection by JVM
    }

  static void dataVariableBeingEmpty()
    {
      ArrayList<String> names = new ArrayList<>();
      names.add("Avishek");
      names.remove(0); // names array is eligible for Garbage collection as it is empty
    }
}
