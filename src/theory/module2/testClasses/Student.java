package theory.module2.testClasses;

public class Student {
    public String name;
    public int age;
    public long ID;
    public boolean isEnrolled;

    public Student(String name, int age, long ID, boolean isEnrolled) {
       this.name = name;
       this.age = age;
       this.ID = ID;
       this.isEnrolled = isEnrolled;
    }

    public void checkStudent() {
        if(isEnrolled) {
            System.out.printf("%s is enrolled!\n", this.name);
        } else {
            System.out.printf("%s is NOT enrolled!\n", this.name);
        }
    }
}
