import java.util.*;

// Call by Value

public class ParamMethod1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swapping, a: " + a + " b: " + b);

        // Invoke the swap method
        swapFunction(a, b);
        System.out.println("After swapping(outside), a: " + a + " b: " + b);
    }

    public static void swapFunction(int a, int b) {
        System.out.println("Before swapping(Inside), a: " + a + " b: " + b);

        // Swap n1 with n2
        int c = a;
        a = b;
        b = c;

        System.out.println("After swapping(Inside), a: " + a + " b: " + b);
    }
}