package oop.classconcepts;


public class OuterClass {
  private int data = 100;
  public String outerMessage = "This is Outer class member";

  public static void main(String[] args)
    {
      OuterClass outerClass = new OuterClass();

      InnerClass innerClass = new OuterClass().new InnerClass();
      innerClass.showData();
    }

  class InnerClass {
    private String innerMessage = "This is inner class member";

    public void showData()
      {
        System.out.println("Calling private data of Outer Class from inner class : " + data);
      }
  }


}
