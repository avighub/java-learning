package statickeyword.staticblock;

public class SequenceOfStaticNonStaticConstructor {
  /**
   * Blocks executed first and then methods
   */
  public static void main(String[] args)
    {
      SequenceOfStaticNonStaticConstructor object = new SequenceOfStaticNonStaticConstructor();
    }

  static {
    System.out.println("This is static block, get loaded when class is loaded");
  }

  {
    System.out.println("This is non static block,gets executed when object is created");
  }

  private SequenceOfStaticNonStaticConstructor()
    {
      System.out.println("This is private constructor,gets executed when object is created");
    }




}
