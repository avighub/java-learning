package javaBasics;

import javaBasics2.HerosNew;

public class AccessModifiers extends HerosNew {

    public static void main(String[] args) {
        /**
         * To access methods of other class we need instantiation (unless it is static)
         */
        Parents parents = new Parents(); // Object/Instance of class , Calling default constructor
        parents.showFixedDeposit(); //accessible as it is public method

//        parents.showMainBalance(); // Compile time Error: as it is private
//        parents.bankMoneyBal;// Compile time Error: as it is private

        parents.showAadhar();

        Heros heros = new Heros(); //Calling protected from same package
        heros.showPowers();

//        HerosNew herosNew = new HerosNew(); //Calling from different package, import is added
//        herosNew.showPowers(); // creating object of protected class wont work as it is in different package, it has to be subclass to access protected  members

        // Extending the protected class and creating child class(current) class object can access protected members
        AccessModifiers accessModifiers = new AccessModifiers();
        accessModifiers.showPowers();

    }
}

class Parents {
    //private variables : Data members
    private double bankMoneyBal = 50000;
    private double fixedDeposit = 3000;
    public double aadharNumber = 1234;

    //zero arg default constructor
    // if constructor is made private, no instantiation will be allowed outside class+.
    Parents() {
        System.out.println("I am zero arg default constructor");
    }

    // private method : member function
    private double showMainBalance() {
        System.out.println("Main Balance: " + bankMoneyBal);
        return bankMoneyBal;
    }

    //public method: member function
    public double showFixedDeposit() {
        System.out.println("Fixed Deposit: " + fixedDeposit);
        return fixedDeposit;
    }

    //public method: member function
    // public method having both public and private data member
    public double showAadhar() {
        System.out.println("aadharNumber: " + aadharNumber);
        System.out.println("fixedDeposit: " + fixedDeposit);
        return aadharNumber;
    }


}

class Heros {
    protected String power_Fly = "Superman";

    protected void showPowers() {
        System.out.println("Power of Hero:" + power_Fly);
    }
}