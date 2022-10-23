package functionalprogramming.anonymousclass;

public class PrinterImpl {


  public static void main(String[] args)
    {

      System.out.println("Using Java 7 Way");
      IPrintable iPrintable = new IPrintable() {
        @Override
        public void print()
          {
            System.out.println("I am inside anonymous class");
          }
      };

      iPrintable.print();
    }






}
