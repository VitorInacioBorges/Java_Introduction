package theory.module1;

import java.util.Scanner;
public class Conditional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        if(age<10) System.out.println("You're a baby");
        else if(age<18) System.out.println("Still no permissions...");
        else if(age>=18 && age<25) System.out.println("Almost a grownup");
        else if(age>=25 && age<35) System.out.println("A grownup already!");
        else System.out.println("TOO OLD!!!");
        scanner.close();
    }
}
