package exceptionhandling;

import lombok.SneakyThrows;

import java.io.FileInputStream;
import java.util.Properties;

public class CheckedException {

  public static void main(String[] args) {
    loadProperty();
  }

  static void loadProperty() {
    Properties properties = new Properties();
    try {
      properties.load(new FileInputStream("./src/main/java/java8/ConsumerInt/test.properties"));

    } catch (Exception e) {
      e.printStackTrace();
      System.out.println(e.fillInStackTrace());
      System.out.println(e.getMessage());
      System.out.println(new MyException("This is my own exception"));
    } finally {
      System.out.println("THis will always be executed");
    }
  }

  @SneakyThrows
  static void throwExceptionUsingSneakyThrows() { // No need of throws in the signature
    Properties properties = new Properties();
    properties.load(new FileInputStream("./src/main/java/java8/ConsumerInt/test.properties"));
  }

}
