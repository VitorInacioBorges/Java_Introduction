package pratice;
/*
* A CRUD Interface made for running in the terminal. It has the following options:
* - Register the user
* - Deposit an amount of money
* - Withdraw an amount
* - Show your balance
* - Close the program
*/
import java.util.Scanner;
public class BankingProgram {
    public static void main(String[] args) {
        boolean condition = true;
        while(condition){
            System.out.print("""
                    ========= BANKING PROGRAM ========
                    1. Registering
                    2. Deposit
                    3. Withdrawal
                    4. Show Balance
                    5. Close
                    >\s""");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    userRegistering();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    showBalance();
                    break;
                case 5:
                    condition = !condition;
                    scanner.close();
                    System.out.println("CLOSED!!!");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
    static void userRegistering(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your savings amount: ");
        double savings = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter your ID (Ex: 102874): ");
        int ID = scanner.nextInt();
        scanner.nextLine();
    }
    static void deposit(){

    }
    static void withdraw(){

    }
    static void showBalance(){

    }
}
