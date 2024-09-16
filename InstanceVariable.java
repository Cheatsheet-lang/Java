import java.util.*;

public class InstanceVariable {
    // Instance Variables
    int a = 10;
    int b = 20;

    public void sum() {
        // Local variable to sum function
        int z = a + b;

        System.out.println("Sum: " + z);
    }

    public static void main(String[] args) {
        // Create an object of the class
        InstanceVariable obj = new InstanceVariable();

        // Access instance variables
        System.out.println("a: " + obj.a);
        System.out.println("b: " + obj.b);

        // Call the sum function
        obj.sum();

        // Change the value of instance variables
        obj.a = 100;
        obj.b = 200;

        // Access instance variables
        System.out.println("a: " + obj.a);
        System.out.println("b: " + obj.b);
    }
}