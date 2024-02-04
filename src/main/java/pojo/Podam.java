package pojo;

import pojo.lombok.Athlete;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

import java.util.ArrayList;
import java.util.HashMap;

public class Podam {
  private static final PodamFactory podamFactory = new PodamFactoryImpl();

  public static void main(String[] args) {
    printNoArgsConstructorPOJO();
    printAllArgsConstructorPOJO();
    printListOfNames();
    printKeyValue();
  }

  public static void printNoArgsConstructorPOJO() {
    System.out.println(podamFactory.manufacturePojo(Athlete.class));
  }

  public static void printAllArgsConstructorPOJO() {
    System.out.println(podamFactory.manufacturePojoWithFullData(Athlete.class));
  }

  public static void printListOfNames() {
    System.out.println(podamFactory.manufacturePojo(ArrayList.class, String.class));
  }

  public static void printKeyValue() {
    System.out.println(podamFactory.manufacturePojo(HashMap.class, String.class, Integer.class));
  }

}
