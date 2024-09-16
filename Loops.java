import java.util.*;

public class Loops {
    public static void main(String[] args) {
        int i, j;

        // For loop example
        System.out.println("For loop example");
        for (i = 0; i < 10; i++) {
            System.out.println("Value of i is: " + i);
        }

        // While loop example
        System.out.println("While loop example");
        j = 0;
        while (j < 10) {
            System.out.println("Value of j is: " + j);
            j++;
        }

        // Do-While loop example
        System.out.println("Do-While loop example");
        j = 0;
        do {
            System.out.println("Value of j is: " + j);
            j++;
        } while (j < 10);
    }
}