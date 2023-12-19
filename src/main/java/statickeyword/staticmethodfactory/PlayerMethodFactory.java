package statickeyword.staticmethodfactory;

public class PlayerMethodFactory {

  private String name;
  private int age;
  private String skill;


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

  public static void main(String[] args)
    {
      System.out.println(getCricketPlayer("Sachin", 60).toString());
      System.out.println(getFootballPlayer("Messi", 60).skill);
    }

}
