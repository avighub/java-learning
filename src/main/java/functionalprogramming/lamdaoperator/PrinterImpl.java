package functionalprogramming.lamdaoperator;

public  class PrinterImpl {


  public static void main(String[] args)
    {

      System.out.println("==== Using Java 7 Way=====");
      IPrintable iPrintable = new IPrintable() {

        @Override
        public void print()
          {
            System.out.println("I am inside anonymous class");
          }
      };

      iPrintable.print();


      System.out.println("==== Lamda Way=====");
      // TODO: Document in notion
      //Functional programming
      // 1- Parameter to the abstract method and lambda expression should match
      // 2- return type of the abstract method and lambda expression should match
      // 3- Interface should have only one abstract method

      IPrintable iPrintableLamda = () -> System.out.println("This is from lamda expression");
      iPrintableLamda.print();





    }






}
