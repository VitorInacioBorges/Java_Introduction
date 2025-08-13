package theory.module2;
/*
* Hash Maps: a data structure that stores values, such as array.
* they correlate two values, a key and the data itself
* keys are unique but values can be duplicated. each key corresponds to a value
* make the correlation of information and result of search instantly
* does not maintain any order, but is memory efficient
*
* Syntax:
* import java.util.HashMap;
* HashMap<keyType, valueType> <hashMapName> = new HashMap<>();
* <hashMapName>(<key>, <value>);
*/

import java.util.HashMap;
public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Double> store = new HashMap<>();
        // put() --> put an element referencing to another
        store.put("apple", 1.59);
        store.put("banana", 0.75);
        store.put("orange", 5.40);

        // remove() --> remove an element from the map. only requires the key
        store.remove("orange");

        // get() --> get and element from a map
        store.get("apple"); // 1.59

        // containsKey() --> see if the key exists
        if(store.containsKey("orange")){
            System.out.println("EXISTS!");
        } else {
            System.out.println("NOT EXISTS!");
            store.put("orange", 5.40);
        }

        // replace() --> replaces the value of a key
        store.replace("orange", 8.0);

        // forEach() --> makes an action for each map key and value
        store.forEach((k,v)->{
            System.out.println("Product: " + k + " " + "| Price: " + v);
        });

        // size() --> returns the size on the map
        // values() --> returns all the values on the map
        System.out.println("The number of products is " + store.size());
        System.out.println("The value on the map are respectively " + store.values());

        // keySet() --> returns all the keys on the map
        for(String k : store.keySet()){
            System.out.println(k + " | Price: $" + store.get(k));
        }
        System.out.println(store);
    }
}
