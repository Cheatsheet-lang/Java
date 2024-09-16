import java.util.*;

public class PrecedenceOperators {
    public static void main(String[] args) {
        int a = 20, b = 10, c = 15, d = 5, e = 0;

        System.out.println("a + b * c = " + (a + b * c));
        System.out.println("a - b - c = " + (a - b - c));
        System.out.println("a * b / c = " + (a * b / c));
        System.out.println("a % b = " + (a % b));
    }
}