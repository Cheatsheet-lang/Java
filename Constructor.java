import java.util.*;

// Constructor
// Parameterized constructor
// Constructor overriding

public class Constructor {
    int x;

    Constructor() {
        x = 10;
    }

    Constructor(int val) {
        x = val;
    }

    public static void main(String[] args) {
        Constructor t1 = new Constructor();
        Constructor t2 = new Constructor(88);
        System.out.println("t1.x = " + t1.x + ", t2.x = " + t2.x);
    }
}