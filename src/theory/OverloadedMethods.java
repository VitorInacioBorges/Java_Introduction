package theory;
/* Overloaded Methods: methods that share the same name but have different parameter.
*  Methods are defined as blocks of reusable code and each one of them has a different signature (characteristic).
*  You can't have 2 methods with the same signature.
*  Signature = Name + Parameters */

public class OverloadedMethods {
    public static void main(String[] args) {
        System.out.println(add(2, 3));
        System.out.println(add(3, 4, 5));
    }

    // Example: add method (2 parameters) and add method (3 parameters).

    static double add(double a, double b) {
        return a + b;
    }
    static double add(double a, double b, double c) {
        return a + b + c;
    }
}
