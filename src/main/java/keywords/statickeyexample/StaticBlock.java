package keywords.statickeyexample;

public class StaticBlock {
  /**
   * Blocks executed first and then methods
   */
  public static void main(String[] args)
    {
      StaticBlock object = new StaticBlock();
    }

  // Static block
  static {
    System.out.println("This is static block, get executed when class is loaded");
  }

  // Non Static Block - They are executed in the order they appear in the class.
  {
    System.out.println("1- This is non static block,gets executed when object is created");
  }

  {
    System.out.println("2- This is non static block,gets executed when object is created");
  }

  // Private Constructor
  private StaticBlock()
    {
      System.out.println("This is private constructor,gets executed when object is created");
    }

}
