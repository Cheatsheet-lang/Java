
// Understanding different types of numbers classes in Java

public class Numbers {
    public static void main(String[] args) {
        Integer x = 5; // boxes int to an Integer object
        Integer y = 10; // boxes int to an Integer object
        Double d = -100.325; // boxes double to a Double object
        Float f = 5.25f; // boxes float to a Float object

        // Some methods to perform operations on numbers
        System.out.println("x: " + x);
        System.out.println("x.doubleValue(): " + x.doubleValue());
        System.out.println("x.compareTo(y): " + x.compareTo(y));
        System.out.println("Ceil of d: " + Math.ceil(d));
        System.out.println("Floor of d: " + Math.floor(d));
        System.out.println("Max of x, y: " + Math.max(x, y));
        System.out.println("Min of x, y: " + Math.min(x, y));
        System.out.println("Max of f, d: " + Math.max(f, d));
        System.out.println("Sqrt of f: " + Math.sqrt(f));
    }
}