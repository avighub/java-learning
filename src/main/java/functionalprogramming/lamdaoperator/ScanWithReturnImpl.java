package functionalprogramming.lamdaoperator;

//Abstract class so it does not need to be implemented
public abstract class ScanWithReturnImpl implements IScanableWithReturn{

  /**
   * 1- method with one or more params, with or without data type
   */


  public static void main(String[] args)
    {
      System.out.println("==== Lamda Way: Scan=====");
      // () = this is optional if only one param
      IScanableWithReturn scanableWithReturn = (file, copies) -> {
        return true;
      };
      boolean scan = scanableWithReturn.scan("test.pdf", 3);
      System.out.println(scan);


    }




}
