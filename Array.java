import java.util.*;

// Arrays

public class Array {
    public static void main(String[] args) {
        int i;
        double[] arr = {1.9, 2.9, 3.4, 3.5, 8.6, 7.4, 9.2};

        // Display all the elements
        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        // Summing all elements
        double total = 0;
        for (i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println("Total is " + total);

        // Finding a particular element
        double ele = 3.5;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                System.out.println(ele + " is found at index " + i);
                break;
            }
        }
    }
}