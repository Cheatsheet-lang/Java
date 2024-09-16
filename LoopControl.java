import java.util.*;

public class LoopControl {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        // for loop continues to the next iteration if the current iteration is 30
        for (int x : numbers) {
            if (x == 30) {
                continue;
            }
            System.out.print(x);
            System.out.print("\n");
        }

        // for loop breaks if the current iteration is 30
        for (int x : numbers) {
            if (x == 30) {
                break;
            }
            System.out.print(x);
            System.out.print("\n");
        }
    }
}