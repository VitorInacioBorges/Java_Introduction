package theory.module2;

public class Friend {
    static int numOfFriends = 0;
    String name;
    int age;

    Friend (String name, int age){
        this.name = name;
        this.age = age;
        numOfFriends++;
    }

    static void showFriends(){
        System.out.printf("Your have %d friends",  numOfFriends);
    }
}
