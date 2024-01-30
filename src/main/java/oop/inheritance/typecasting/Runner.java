package oop.inheritance.typecasting;

public class Runner {


  public static void main(String[] args)
    {
      // Simple Cat Behaviour
      Cat cat = new Cat();
      cat.meow();
      cat.eat(); // Inheritance
      cat.sleep(); // Inheritance
//      cat.bark(); // Not possible

      // Simple Dog Behaviour
      Dog dog = new Dog();
      dog.bark();
      dog.eat(); // Inheritance
      dog.sleep(); // Inheritance
//      dog.meow();  // Not possible

      // Simple Animal behaviour
      Animal animal1 = new Animal();
      animal1.eat();
      animal1.sleep();
//      animal1.meow(); // Not possible because Parent does not inherit

      Animal animal2 = new Cat(); // Storing Cat to Animal, upcasting
      animal2.eat();
      animal2.sleep();
//      animal2.meow(); // Even with Child object not possible to call child method

      // Able to call parent
      // Able to call child
      // Able to change child
      animal2 = new Dog();
      animal2.eat();
      animal2.sleep();
//      animal2.bark();

      Cat cat1 = (Cat) new Animal(); // Downcasting
      cat1.eat();
      cat1.sleep();
      cat1.meow();

    }


}
