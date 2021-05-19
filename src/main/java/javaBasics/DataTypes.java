package javaBasics;

public class DataTypes {

    public static void main(String[] args) {
//        implicitTypeCasting();
        explicitTypeCasting();
    }

    public static void implicitTypeCasting(){
        //Type casting
        byte byteCount=100;

        int intCount = byteCount; // widening or implicit type casting
        System.out.println(intCount);

        long longCount=intCount;
        System.out.println(longCount);
    }

    public static void explicitTypeCasting(){
        //Narrowing Type casting
        long longCount=100;

//        int intCount=longCount; //Throws and error to cast type
        int intCount= (int) longCount; //Type casted
        System.out.println(intCount);

        /**
         * If the type casting value is not formatable it will throw exception
         * java.lang.numberFormatException
         */
    }


}
