package oop.datatype;

public class TypeCasting {

  public static void main(String[] args)
    {
      implicitTypeCasting();
      explicitTypeCasting();
    }

  static void implicitTypeCasting()
    {
      int intCount = (byte) 100; // widening or implicit type casting
      System.out.println(intCount);

      System.out.println((long) intCount);
    }

  public static void explicitTypeCasting()
    {
      //Narrowing Type casting
      long longCount = 100;

      // int intCount=longCount; //Throws and error to cast type
      int intCount = (int) longCount; //Type casted
      System.out.println(intCount);

      /**
       * If the type casting value is not formatable it will throw exception
       * java.lang.numberFormatException
       */
    }


}
