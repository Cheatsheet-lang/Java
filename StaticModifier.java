import java.util.*;

public class StaticModifier {
    // Static Variables
    public static int a = 10;
    public static int b = 20;

    public static void sum() {
        // Local variable to sum function
        int z = a + b;

        System.out.println("Sum: " + z);
    }

    public void diff() {
        // Local variable to diff function
        int z = a - b;

        a = 100;
        b = 200;

        System.out.println("Diff: " + z);
    }

    public static void main(String[] args) {
        // Instance of the class
        StaticModifier obj = new StaticModifier();

        // Access static variables
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        // Call the sum function
        sum();

        // Call the diff function
        obj.diff();
    }
}