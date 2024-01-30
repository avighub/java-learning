package keywords.statickeyexample.staticmethodfactory;

import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

@Slf4j
public class PlayerGeneric {

  private final String name;
  private final int age;
  private final String skill;


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
      log.info("Name: {} , Age: {} ,Skill: {} ", allRounder.name, allRounder.age, allRounder.skill);

      PlayerGeneric cricketPlayerGeneric = new PlayerGeneric("Sachin", 20, "Cricket");
      log.info("Name: {},Age: {},Skill: {} ", cricketPlayerGeneric.name, cricketPlayerGeneric.age, cricketPlayerGeneric.skill);
    }


}
