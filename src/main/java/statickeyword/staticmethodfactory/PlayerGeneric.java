package statickeyword.staticmethodfactory;

import java.util.Objects;

public class PlayerGeneric {

  private String name;
  private int age;
  private String skill;


  PlayerGeneric(String name, int age, String skill)
    {
      this.name = name;
      this.age = age;
      if (Objects.nonNull(skill)) {
        this.skill = skill;
      } else {
        this.skill = "All Rounder";
      }
    }

  public static void main(String[] args)
    {
      PlayerGeneric allRounder = new PlayerGeneric("Sachin", 20, null);
      System.out.println("Name:" + allRounder.name + "|| Age: " + allRounder.age + "|| Skill: " + allRounder.skill);

      PlayerGeneric cricketPlayerGeneric = new PlayerGeneric("Sachin", 20, "Cricket");
      System.out.println("Name:" + cricketPlayerGeneric.name + "|| Age: " + cricketPlayerGeneric.age + "|| Skill: " + cricketPlayerGeneric.skill);
    }


}
