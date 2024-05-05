package functionalprogramming.functionalinterface;

public class Runner {
  public static void main(String[] args) {
    MyFunctionalInterface funcInterface = () -> System.out.println("This is My Functional Interface");
    funcInterface.print();

    MyFunctionalInterface funcInterface2 = MyStaticMethod::print;
    funcInterface2.print();
  }
}
