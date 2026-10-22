package ua.com.kisit.unit_4;

public class MyProject {

    static double a = 5;
    static double b = 3;

    static void main() {
        System.out.println(a+b);
        addAB(6,4);
        addAB(a, b);
        System.out.println(addAandB(5, 7));
    }


    static public void addAB(double a, double b){
        System.out.println(a+b);
    }

    static public double addAandB(double a, double b){
        return a+b;
    }



}
