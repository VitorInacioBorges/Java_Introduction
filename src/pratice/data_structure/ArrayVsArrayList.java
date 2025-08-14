package pratice.data_structure;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        // two types of declarations
        // Arrays don't shrink or grow, they stay the exact same size for all eternity
        // unless you change it
        // can hold PRIMITIVES and OBJECTS

        String[] friendsArray2 = new String[4]; // specify the size
        String[] friendsArray = {"henri", "vitor", "lucas", "luana"};

        // two types of declaration
        // ArrayLists grow and shrink automatically, depending on how much data they store
        // can hold only OBJECTS and WRAPPER TYPES FOR PRIMITIVES

        ArrayList<String> friendsArrayList2 = new ArrayList<>(); // no need for size specification
        ArrayList<String> friendsArrayList = new ArrayList<>(Arrays.asList("henri", "vitor", "lucas", "luana"));

        // getting the values
        // for arrays:
        System.out.println(friendsArray[0]);
        // for arraylists:
        System.out.println(friendsArrayList.get(0));

        // getting the size
        System.out.println(friendsArray.length);
        System.out.println(friendsArrayList.size());

        System.out.println(friendsArrayList);
    }
}
