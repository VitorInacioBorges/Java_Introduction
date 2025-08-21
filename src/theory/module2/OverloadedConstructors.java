package theory.module2;
/*
* Allow a class to have multiple constructors with different parameter lists. (same as overloaded methods)
* Enable objects to be initialized in various ways
*/
public class OverloadedConstructors {
    public static void main(String[] args) {
        User user1 = new User("Vitor");
        User user2 = new User("Anna", "annahelenaborges@hotmail.com");
        User user3 = new User("Maria", "mariahelena@yahho.com", 19);
        User guest = new User();
    }
}
