package javaHomework4;

public class Class_TestData {
    public static void main(String[] args) {
        System.out.println("*******************************************");
        System.out.println("Class A Calling");
        System.out.println("*******************************************");
        Class_A clsA = new Class_A();
        clsA.Maths();
        clsA.Science();
        clsA.Computer();
        clsA.History();
        System.out.println("");

        System.out.println("*******************************************");
        System.out.println("Class A1 Calling");
        System.out.println("*******************************************");
        Class_A1 clsA1 = new Class_A1();
        clsA1.Accounts();
        clsA1.Statistic();
        clsA1.BusinessAnalysis();

        System.out.println("Method overriding calling 1st time");
        clsA1.Computer();
        System.out.println("");

        System.out.println("*******************************************");
        System.out.println("Class A2 Calling");
        System.out.println("*******************************************");
        Class_A2 clsA2 = new Class_A2();
        clsA2.C();
        clsA2.Java();
        clsA2.Python();

        System.out.println("Method overriding calling 2nd time");
        clsA2.Computer();
        System.out.println("");

        System.out.println("*******************************************");
        System.out.println("Class A3 Calling");
        System.out.println("*******************************************");
        Class_A3 clsA3 = new Class_A3();
        clsA3.Computer();
        clsA3.History();
        clsA3.Maths();
        clsA3.Science();
    }
}
