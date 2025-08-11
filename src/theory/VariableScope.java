package theory;
// Variable Scope: where a variable can be accessed
// 2 types: LOCAL and CLASS
// CLASS variables override LOCAL variables
public class VariableScope {
    static int x = 3; // CLASS variable: recognized through all the code
    public static void main(String[] args) {
        int x = 1; // LOCAL variable: recognized locally
        System.out.println(x);
        doSomething(); // calling a doSomething method.
    }
    static void doSomething(){
        int x = 2; // LOCAL variable
        System.out.println(x);
    }
}
