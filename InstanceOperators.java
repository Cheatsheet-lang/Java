import java.util.*;

public class InstanceOperators {
    public static void main(String[] args) {
        String name = "James";

        if (name instanceof String) {
            System.out.println("An instance of String class");
        } else {
            System.out.println("Not an instance of String class");
        }
    }
}