package pratice.data_structure;

import java.util.HashMap;

public class HasVotedHashMap {
    private static HashMap<String, Boolean> voted = new HashMap<>();

    private static void checkVoter(String person){
        if(voted.containsKey(person)){
            System.out.println("voted already! kick them out!");
        } else {
            voted.put(person, true);
            System.out.println("voted not found! let them vote!");
        }
    }

    public static void main(String[] args){
        checkVoter("tom"); // didn't vote
        checkVoter("victor"); // didn't vote
        checkVoter("victor"); // voted already
    }
}
