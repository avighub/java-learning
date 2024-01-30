package keywords.statickeyexample.staticmethodfactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PlayerMethodFactory {

  private String name;
  private int age;
  private String skill;

  public static void main(String[] args)
    {
      log.info(getCricketPlayer("Sachin", 60).skill);
      log.info(getFootballPlayer("Messi", 60).skill);
    }

  private PlayerMethodFactory(String name, int age, String skill)
    {
      this.name = name;
      this.age = age;
      this.skill = skill;
    }

  static PlayerMethodFactory getCricketPlayer(String name, int age)
    {
      return new PlayerMethodFactory(name, age, "Cricket");
    }

  static PlayerMethodFactory getFootballPlayer(String name, int age)
    {
      return new PlayerMethodFactory(name, age, "Football");
    }


}
