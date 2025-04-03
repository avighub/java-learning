package basics;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        primitiveTypeCasting();
    }

    private static void primitiveTypeCasting() {
        int x = 135;

        /**
         * Explicit casting from int to byte
         * The int value is larger than the byte range (-128 to 127)
         */
        byte y = (byte) x;

        System.out.println("x: " + x);
        System.out.println("int to byte: " + y);
    }
}
