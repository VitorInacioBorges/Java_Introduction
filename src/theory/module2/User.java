package theory.module2;

public class User {
    String name;
    String email;
    long ID;
    int age;
    boolean gender;
    // true = female / false = male

    // guest user
    User(){
        this.name = "Guest";
        this.email = "not provided";
        this.ID = 0;
        this.age = 0;
        this.gender = false;
    }

    // real users
    User(String name){
        this.name = name;
        this.email = "not provided";
        this.ID = 0;
        this.age = 0;
        this.gender = false;
    }
    User(String name, String email){
        this.name = name;
        this.email = email;
        this.ID = 0;
        this.age = 0;
        this.gender = false;
    }
    User(String name, String email, int age){
        this.name = name;
        this.email = email;
        this.ID = 0;
        this.age = age;
        this.gender = false;
    }
}
