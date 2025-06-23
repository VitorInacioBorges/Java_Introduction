import java.util.Scanner;
public class Printf{
    public static void main(String[] args) {
        // Printf is a print function. It contains a placeholder (%...) that holds
        // the value of a variable. Example1:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name please: ");
        String name = scanner.nextLine();
        System.out.printf("Hello %s", name);
        scanner.close();

        /* Syntax:
         *
         * System.out.printf("<%...>", <variable>);
         * %f --> float / double
         * %s --> string
         * %c --> char
         * %d --> integer
         * %b --> boolean
         * 
         * %[flag][width][.precision][specifier-character]
         * 
         * [flag]:
         * 
         * +      --> indicates a positive or negative number
         * ,      --> comma grouping separator
         * space  --> outputs a minus if negative and a space if positive
         * (      --> negative numbers are enclosed in ()
         * 
         * [precision]:
         * 
         * display the precision of a floating number
         * Ex1:
         * double i = 10.789123
         * System.out.printf("%0.2f", i);
         * TERMINAL: 10.78
         * 
         * [width]:
         * 
         * 0       --> zero padding
         * number  --> right justified padding
         * -       --> left justified padding
         */
    }
}