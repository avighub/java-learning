package statickeyword.staticmethodfactory.withstaticmethod;

public class Player {

  private String name;
  private int age;
  private String skill;


  private Player(String name, int age, String skill)
    {
      this.name = name;
      this.age = age;
    }

  public static Player getCricketPlayer(String name, int age)
    {
      return new Player(name, age, "Cricket");
    }

  public static Player getFootballPlayer(String name, int age)
    {
      return new Player(name, age, "Football");
    }

}
