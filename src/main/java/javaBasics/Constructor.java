package javaBasics;

public class Constructor {

    public static void main(String[] args) {
        constructorExample constructorExample = new constructorExample(); // since this calls default no arg constructor it will just print sout statement

        constructorExample constructorExample1 = new constructorExample(100, "Avishek"); // This is calling param constructor so it will print emp info
    }


}

class constructorExample {
    int empId;
    String empName;

    constructorExample() {
        System.out.println("This is default no arg constructor..");
    }

    constructorExample(int empId, String empName) {
        this.empId = empId; //assignning class member with arg value
        this.empName = empName; //assignning class member with arg value
        System.out.println("Parameterized constructors. Emp id=" + this.empId + " and empName= " + this.empName);
    }

}
