import java.util.*;

// Nested classes
// * Two Types
//   * Non-Static Nested Class
//      * Inner Class
//      * Nested Class inside Outer Class Method
//      * Anonymous Nested Class
//   * static Nested Class

public class NestedClasses {
    private static String msg = "Learning Nested Classes";

    // Static Nested Class
    static class NestedStaticClass {
        public void printMessage() {
            System.out.println("Message from nested static class: " + msg);
        }
    }

    // Non-static Nested Class
    class InnerClass {
        public void display() {
            System.out.println("Message from non-static nested class: " + msg);
        }
    }

    public static void main(String[] args) {
        // Create instance of nested static class
        NestedStaticClass nestedStaticClass = new NestedStaticClass();
        nestedStaticClass.printMessage();

        // Create instance of non-static nested class
        NestedClasses outer = new NestedClasses();
        InnerClass inner = outer.new InnerClass();
        inner.display();

        // Accessing the inner class from outside the outer class
        // In order to create instance of Inner class from outside the Outer class, we need an Outer class instance
        // Let us create Outer class instance for creating non-static nested class
        NestedClasses.InnerClass innerObject = new NestedClasses().new InnerClass();

        innerObject.display();

        // Accessing the inner class from outside the outer class using outer class instance
        NestedClasses outerObject = new NestedClasses();
        NestedClasses.InnerClass innerObject2 = outerObject.new InnerClass();

        innerObject2.display();
    }
}