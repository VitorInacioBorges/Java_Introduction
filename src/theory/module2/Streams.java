package theory.module2;

import java.util.*;
import java.util.stream.Collectors;
/*
* Java Streams gives us a set of functions that we can perform on certain data structure
* They quickly allow us to perform bulk operations on them
* Streams stream-line the process for you
*/
public class Streams {
    public static void main(String[] args) {
        // WITHOUT STREAMS:
        // Creating an array list in the List interface
        List<User> users = new ArrayList<>();

        // adding users with the .add method from List interface
        users.add(new User("Vitor", "vitorinacioborges@gmail.com", 17));
        users.add(new User("Pollyanna", "pkoborges@hotmail.com", 48));
        users.add(new User("Anna", "annahelenaborges@hotmail.com", 23));

        // Creating a new array list for the adults
        List<User> above18 = new ArrayList<>();

        // adding to the above18 array list
        for(User u : users){ // enhanced for loop. very alike with forEach method
            if(u.age >= 18){
                above18.add(u);
            }
        }

        // printing every person's name inside above18 array list
        above18.forEach(p -> System.out.println(p.name));

        // ------------------------------------------------------------------------------ //
        // WITH STREAMS:

        users.stream()
                .filter(u -> u.age >= 18)
                .forEach(u -> System.out.println(u.name));
        // SO MUCH EASIER!!!
    }
}
