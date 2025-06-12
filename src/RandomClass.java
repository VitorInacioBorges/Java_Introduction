import java.util.Random;
public class RandomClass {
    public static void main(String[] args) {
        Random random = new Random();
        int numberInt = random.nextInt(1, 7);
        System.out.println(numberInt);
        /* 
        The Random class generates a number between +2 billion and 
        - 2 billion. To set the boundaries of the generation we use
        random.next<type>(origin, bound)
        For example:
        random.nextInt(1, 101);
        P.S. THE FIRST NUMBER IS INCLUSIVE AND THE LAST IS EXCLUSIVE!!!
         */
        
        double numberDouble = random.nextDouble();
        System.out.println(numberDouble);
        // Without any boundaries It generates a decimal number between 0 and 1

        boolean trueOrFalse = random.nextBoolean();
        System.out.println(trueOrFalse);
    }
}
