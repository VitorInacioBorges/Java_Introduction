package theory.module1;

import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert a number for the WHILE operation: ");
        int number = scanner.nextInt();
        int cont = 0;
        while(number > 0){
            number--;
            cont++;
        }
        System.out.printf("The while loop has %d iterations\n\n", cont);

        System.out.print("Insert a number for the DO WHILE operation: ");
        number = scanner.nextInt();
        cont = 0;
        do{
            number--;
            cont++;
        } while (number > 0);
        System.out.printf("DO has %d iterations and WHILE has %d iterations\n\n", cont, cont-1);

        System.out.print("Insert a number for the FOR operation: ");
        number = scanner.nextInt();
        for(cont=0; number>0; cont++){
            number--;
        }
        System.out.printf("FOR has %d iterations\n", cont);
        scanner.close();
    }
}
