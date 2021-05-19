package javaBasics;

public class InnerClass {
    private int data=100;
    public String msg="Outer class data member";


    class innerclassTest{
        private String msg2="This is inner Test class";
        public void showData(){
            System.out.println("Calling private data from inner test class : "+data);
        }
    }

    public static void main(String[] args) {
        InnerClass innerClass=new InnerClass();

        innerclassTest inner= innerClass.new innerclassTest(); // using outclass.new we can access inner class
        inner.showData();
    }
}
