import java.util.*;

// Understanding 'this' keyword

public class This {
    int age;

    This() {
        this(20);
    }

    This(int age) {
        this.age = age;
    }
    public static void main(String[] args) {
        int age = 88;
        This obj1 = new This();
        This obj2 = new This(30);

        System.out.println("Age value: " + age);
        System.out.println("Age value: " + obj1.age);
        System.out.println("Age value: " + obj2.age);
    }
}