import java.util.*;

// Understanding the interface concept.
// An interface is a reference type in Java. It is similar to class. It is a collection of abstract methods. A class implements an interface, thereby inheriting the abstract methods of the interface.
// Along with abstract methods, an interface may also contain constants, default methods, static methods, and nested types. Method bodies exist only for default methods and static methods.
// Writing an interface is similar to writing a class. But a class describes the attributes and behaviors of an object. And an interface contains behaviors that a class implements.
// Unless the class that implements the interface is abstract, all the methods of the interface need to be defined in the class.

interface Person {
    void displayDetails();
    boolean works();
}

class Student implements Person {
    String name;
    int age;
    String course;

    Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void displayDetails() {
        System.out.println("Name: "+name+" Age: "+age+" Course: "+course);
    }

    public boolean works() {
        return false;
    }
}

public class Interface {
    public static void main(String[] args) {
        Student student = new Student("John", 20, "Computer Science");
        student.displayDetails();
        System.out.println("Does student work? "+student.works());
    }
}