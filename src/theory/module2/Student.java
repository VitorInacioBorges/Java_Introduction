package theory.module2;

public class Student {
    String name;
    int age;
    long ID;
    boolean isEnrolled;

    Student(String name, int age, long ID, boolean isEnrolled) {
       this.name = name;
       this.age = age;
       this.ID = ID;
       this.isEnrolled = isEnrolled;
    }

    void checkStudent() {
        if(isEnrolled) {
            System.out.printf("%s is enrolled!\n", this.name);
        } else {
            System.out.printf("%s is NOT enrolled!\n", this.name);
        }
    }
}
