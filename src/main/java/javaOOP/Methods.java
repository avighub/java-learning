package javaOOP;

public class Methods {

    public static void main(String[] args) {
        //Main () is caller method
        showMessage();
        add(2, 3);

    }

    //accessmodifier - return type - identifier/Name()

    //no arg method
    public static void showMessage() {
        System.out.println("This is no arg method");
    }

    public static void add(int a, int b) {
        System.out.println("Sum of " + a + " and " + b + " is : " + (a + b));
    }


}
