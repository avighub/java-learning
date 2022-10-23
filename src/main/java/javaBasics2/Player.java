package javaBasics2;

public class Player {


//  public Player(String name, int age, String...skill){
//
//  }


  private String skill=null;

  public Player(String name, int age,String skill){
    this.skill=skill;
  }


  public static Player getCricketPlayer(String name, int age){

    return new Player(name,age,"Cricket");
  }

  public static Player getFootballPlayer(String name, int age){

    return new Player(name,age,"Football");
  }




  public static void main(String[] args)
    {
      Player player =new Player("Avi",35,"Cricket");
//      Player player2 =new Player("Avi",35);
    }


}
