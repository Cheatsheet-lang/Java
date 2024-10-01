import java.util.ArrayList;
import java.util.Collection;

// Collection is an interface that represents a group of objects known as elements
// ArrayList is a class that implements the Collection interface
// Collection API doesn't have any indexing methods

public class Arraylist {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<Integer>();

        // Adding elements to the collection
        nums.add(1);
        nums.add(4);
        nums.add(3);
        nums.add(2);
        nums.add(5);
        nums.add(5);

        
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();
        nums.remove(5);

        System.out.println("Printing the collection: " + nums);
    }
}