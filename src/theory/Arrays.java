package theory;
/*
* ARRAYS: reference data type which store only values of the same type
* can store booleans, chars, strings, integers, doubles and floats
*/
public class Arrays {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6};
        String[] stringArray = {"apple", "leaves", "object", "watch", "time"};
        // etc...

        int intArrayLength = intArray.length;
        int stringArrayLength = stringArray.length;

        System.out.printf("The length of the array is %d", intArrayLength);
        System.out.printf("The length of the array is %d", stringArrayLength);

        for(int i = 0; i < intArrayLength; i++){
            System.out.printf("%d ", intArray[i]);
        }
        for(int i = 0; i < stringArrayLength; i++){
            System.out.printf("%d ", stringArray[i]);
        }
    }
}
