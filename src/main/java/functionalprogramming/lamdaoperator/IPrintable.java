package functionalprogramming.lamdaoperator;

@FunctionalInterface
public interface IPrintable {

  // Functional Interface: Interface with only one abstract or unimplemented method
  // java8 can have  static,default and abstract methods as below
  // add @FunctionalInterface annotation to restrict others adding more abstract methods
  public abstract void print();

  default void scan()
    {
      System.out.println("Scanning");
    }

    static void ocr(){
      System.out.println("OCR");
    }


}
