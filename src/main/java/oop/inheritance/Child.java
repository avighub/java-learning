package oop.inheritance;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Child extends Parent {

  public static void main(String[] args)
    {
      Child child = new Child();
      // Print : Child class
      child.print();

      /* Child class object up cast to super class reference.
         Using super class reference , sub class object can not use methods
		 of sub class despite of being object of that class.
		  Up casting restricts access or visibility of methods downwards */
      Parent parent = new Parent();
      parent.print();
      parent.show();


      /* To access sub class methods, super class reference needs to be downcast to sub class reference. Note here we can down cast
		to a up cast reference only. */

      Parent parent2 = new Child();
      Child child2 = (Child) parent2;
      child2.print();
      child2.show();
    }

  @Override
  public void print()
    {
      log.info("Child Class Print");
    }


  public void show()
    {
      log.info("Child Class Show");
    }

}
