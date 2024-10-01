
abstract class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void doesWork() {
        System.out.println("Person does work");
    }

    public abstract void display();
}

class Student extends Person {
    String course;

    Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    public void display() {
        System.out.println("Name: " + name + " Age: " + age + " Course: " + course);
    }
}

public class Abstract {
    public static void main(String[] args) {
        Student student = new Student("John", 20, "Computer Science");
        student.display();
        student.doesWork();
    }
}