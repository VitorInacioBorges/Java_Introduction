package theory.module2;
import theory.module2.testClasses.Student;
/*
 * A special method found within a class that can initialize objects
 * You can pass arguments to a constructor and set up initial values
 *
 * Syntax:
 *
 * <NameOfClass>(<arg1>, <arg2>, ...){
 *      ...
 * }
 *
 */

public class Constructors {
    public static void main(String[] args) {
        Student student1 = new Student("Vitor", 18, 25102123, true);
        Student student2 = new Student("Anna", 23, 23657876, true);
        Student student3 = new Student("Maria", 20, 20902987, false);

        System.out.println(student1.name + " " + student1.age + " " + student1.ID + " " + student1.isEnrolled);
        System.out.println(student2.name + " " + student2.age + " " + student2.ID + " " + student2.isEnrolled);

        student1.checkStudent();
        student3.checkStudent();
    }
}