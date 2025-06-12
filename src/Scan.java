import java.util.Scanner;
import java.util.Locale;

// Using a class named "Scanner" to import the scanner method.
public class Scan { // Giving our main class the "Scan" Name
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        scanner.useLocale(Locale.US); // Using the locale Us to read the decimal numbers correctly (Ex: 18"."67).
        /* Scanner object created and giving It 
        the following charateristics Scanner 
        class with the System.in method. */

        System.out.print("\nEnter your name: ");
        String name = scanner.nextLine();
        /* Assignment of the variable "name" [(which the type is String(char array)] 
        assigning "name" with the object scanner and nextLine. */

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter a decimal number: ");
        double decimal = scanner.nextDouble(); 
        System.out.print("- America is bigger than Brasil -, is this true or false: ");
        boolean a = scanner.nextBoolean();

        System.out.println("\nHello " + name);
        System.out.println("You're " + age + " years old!");
        System.out.println("The decimal number is: " + decimal);
        if(a) System.out.println("America IS bigger than Brasil!\n");
        else System.out.println("America is NOT bigger than Brasil!\n");
        scanner.close(); 
        // Closing the scanner object.
    }
}

// nextLine: Reads Strings including " ".
// next: Reads Strings, but doesn't read any space characters " ".
// nextInt / nextDouble / nextChar / nextBoolean / nextFloat: Read only those value made for It's type.
