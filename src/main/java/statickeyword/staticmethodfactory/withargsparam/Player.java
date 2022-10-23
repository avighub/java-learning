package statickeyword.staticmethodfactory.withargsparam;

public class Player {

  private String name;
  private int age;
  private String skill;


  Player(String name, int age, Object... skill)
    {
      this.name = name;
      this.age = age;
      if (skill.length > 0) {
        this.skill = (String) skill[0];
      } else {
        this.skill = "Cricket/Football";
      }

    }

  public static void main(String[] args)
    {
      Player playerWithoutSkill = new Player("Sachin",20);
      System.out.println("Name:" +playerWithoutSkill.name +"|| Age: "+ playerWithoutSkill.age+"|| Skill: "+playerWithoutSkill.skill);

      Player cricketPlayer = new Player("Sachin",20,22,"rr");
      System.out.println("Name:" +cricketPlayer.name +"|| Age: "+ cricketPlayer.age+"|| Skill: "+cricketPlayer.skill);
    }



}
