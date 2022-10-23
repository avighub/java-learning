package functionalprogramming.lamdaoperator;

//Abstract class so it does not need to be implemented
public abstract class ScanImpl implements IScanable{

  /**
   * 1- method with one or more params, with or without data type
   */


  public static void main(String[] args)
    {
      System.out.println("==== Lamda Way: Scan=====");
      // () = this is optional if only one param
      IScanable scanable = (file, copies) -> System.out.println("File to scan is: "+file+" And number fo copies "+ copies);
      scanable.scan("test.pdf",3);


    }




}
