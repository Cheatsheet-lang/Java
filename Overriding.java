import java.util.*;

// Understanding Overriding
// Overriding is a concept in Java where a subclass can provide a specific implementation of a method that is already provided by its superclass.
// Method overriding is a dynamic/runtime polymorphism.
// The methods must have the same name, same parameters, and same return type.
// The methods can have different access modifiers.
// The methods can throw different exceptions.

class Person {
    public void display() {
        System.out.println("I am in the Person Class");
    }
}

class Student extends Person {
    public void display() {
        System.out.println("I am in the Student Class");
    }
}

class Employee extends Person {
    public void display() {
        System.out.println("I am in the Employee Class");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student();
        Employee employee = new Employee();

        person.display();
        student.display();
        employee.display();
    }
}