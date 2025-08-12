package theory.module1;
/*
* Variable Arguments: allow a method to accept a varying number of arguments
* they make methods more flexible, no need for overloaded methods
* java will pack the arguments into an array
*
* Declaring the method with variable arguments:
* static <type> <nameOfMethod> (<argumentType>... <nameOfArray/ellipsis>){
*
* <nameOfArray/ellipsis> = name of the array that stores the arguments
*/
public class VariableArguments {
    public static void main(String[] args) {
        System.out.println(add(2, 3, 4, 5, 6, 23, 455, 2));
        System.out.println(average(2, 4, 5, 6, 7, 8, 9, 12));
    }
    static int add(int... numbers){
        System.out.println(numbers);
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        return sum;
    }
    /*
    WHAT HAPPENED:

    public static void main(String[] args) {                     // main method
        System.out.println(add(2, 3, 4, 5, 6, 23, 455, 2));      // printing the result of add with 8 parameters
    }
    static int add(int... numbers){                              // variable arguments method. int is the type of the parameters and numbers is the name of the array that stores them
        System.out.println(numbers);                             // prints the memory path to the array. the array looks like this --> {2, 3, 4, 5, 6, 23, 455, 2
        int sum = 0;                                             // declaring the variable that will store the sum of numbers
        for(int i = 0; i < numbers.length; i++){                 // loop to sum the parameters
            sum += numbers[i];
        }
        return sum;                                              // result
    }
    */
    static double average(double... numbers){
        double sum = 0;
        for(int j = 0; j < numbers.length; j++){
            sum += numbers[j];
        }
        return sum / numbers.length;
    }
}
