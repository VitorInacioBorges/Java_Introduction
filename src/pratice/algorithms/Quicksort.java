package pratice.algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Quicksort {
    public static void main(String[] args) {
        // creating an integer array
        Integer[] array = {7, 8, 2, 5, 1, 3, 4, 9, 0, 6};
        // transforming this array into a list with the Array.asList method from Arrays package
        List<Integer> list = Arrays.asList(array);
        // sorting the array and printing
        System.out.println(quicksort(list));
    }

    private static List<Integer> quicksort(List<Integer> list) {
        // base case, arrays with 0 or 1 element are already "sorted"
        if (list.size() < 2) {
            return list;

        // recursive case
        } else {
            Integer pivot = list.getFirst();
            // sub-array of all the elements less than the pivot
            List<Integer> less = list.stream().skip(1).filter(el -> el <= pivot)
                    .collect(Collectors.toList());

            // sub-array of all the elements greater than the pivot
            List<Integer> greater = list.stream().skip(1).filter(el -> el > pivot)
                    .collect(Collectors.toList());

            return Stream.of(
                            quicksort(less).stream(),
                            Stream.of(pivot),
                            quicksort(greater).stream())
                    .flatMap(Function.identity()).collect(Collectors.toList());
        }
    }
}
