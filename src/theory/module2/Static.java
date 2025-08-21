package theory.module2;
/*
* It's a keyword.
* It makes a variable or a method belong to the class rather than to any specific object.
* Commonly used for utility methods or shared resources.
*/
public class Static {
    public static void main(String[] args) {
        Friend friend1 = new Friend("Juan", 18);
        Friend friend2 = new Friend("Maria", 19);
        System.out.println(Friend.numOfFriends);
        // or...
        Friend.showFriends();
        // numOfFriends is static, so instead of each Friend object having their
        // own numOfFriends variable increased by one, they increase the same variable
        // by giving the variable the static keyword. Therefore, the variable numOfFriends
        // belongs to Friend class rather than a specific object

        Math.round(2.99);
    }
}
