/* Overloaded Methods: methods that share the same name but have different parameter.
*  Methods are defined as blocks of reusable code and each one of them has a different signature (characteristic).
*  You can't have 2 methods with the same signature.
*  Signature = Name + Parameters */

public class OverloadedMethods {
    public static void main(String[] args) {
        System.out.println(add(2, 3));
        System.out.println(add(3, 4, 5));
    }
    static double add(double a, double b) {
        return a + b;
    }
    static double add(double a, double b, double c) {
        return a + b + c;
    }
}
