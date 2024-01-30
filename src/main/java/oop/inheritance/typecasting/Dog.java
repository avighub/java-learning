package oop.inheritance.typecasting;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Dog extends Animal {
  public void bark()
    {
      log.info("Dog is barking");
    }
}
