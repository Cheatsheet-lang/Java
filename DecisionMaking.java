import java.util.*;

public class DecisionMaking {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        if (a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("a is greater than or equal to b");
        }

        // if-else-if ladder
        int c = 30;
        if (c == 10) {
            System.out.println("Value of c is 10");
        } else if (c == 20) {
            System.out.println("Value of c is 20");
        } else if (c == 30) {
            System.out.println("Value of c is 30");
        } else {
            System.out.println("Value of c is not matching");
        }

        // nested if
        int d = 10;

        if (a == 10) {
            if (b == 20) {
                System.out.println("Value of a is 10 and b is 20");
            }
        }

        // switch statement
        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
            case 'C':
                System.out.println("Well done");
                break;
            case 'D':
                System.out.println("You passed");
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}