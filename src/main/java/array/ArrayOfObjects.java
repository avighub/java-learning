package array;

import java.util.Arrays;

public class ArrayOfObjects {
  public static void main(String[] args) {

    // Create array via object
    Person[] people = new Person[5];
    people[0] = new Person("Avishek", 35);
    people[1] = new Person("Avinash", 30);
    people[2] = new Person("Ram", 35);
    people[3] = new Person("Yuvraj", 33);
    people[4] = new Person("Kohli", 39);

    System.out.println(Arrays.toString(people)); // Wrong way to print Person

    // Right way to print
    for (Person person : people) {
      System.out.println(person.age);
      System.out.println(person.name);
    }

  }
}

class Person {
  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  String name;
  int age;
}