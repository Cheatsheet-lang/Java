
// Understanding Overloading
// Overloading is a concept in Java where a class can have multiple methods with the same name but different parameters.
// Method or Constructor overloading is a static/compile-time polymorphism.
// The methods must have the same name but different parameters.
// The return type of the methods can be different.

// The methods can be overloaded in the same class or in a subclass.
// The methods can have different access modifiers.
// The methods can throw different exceptions.
// The methods can have different return types.
// The methods can have different number of parameters.

class Calculation {
    String operations;

    Calculation() {
        this.operations = "Add Sub";
    }

    Calculation(String operations) {
        this.operations = operations;
    }

    public int addition(int a, int b) {
        return a + b;
    }

    public int addition(int a, int b, int c) {
        return a + b + c;
    }

    public void addition(float a, float b) {
        System.out.println("Addition: " + (a + b));
        return ;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int subtraction(int a, int b, int c) {
        return a - b - c;
    }

    public float subtraction(float a, float b) {
        return (a - b);
    }
}

public class Overloading {
    public static void main(String[] args) {
        Calculation calc = new Calculation();

        System.out.println("Operations: " + calc.operations);
        System.out.println("Addition: " + calc.addition(10, 20));
        System.out.println("Addition: " + calc.addition(10, 20, 30));
        calc.addition(10.5f, 20.5f);
        System.out.println("Subtraction: " + calc.subtraction(10, 20));
        System.out.println("Subtraction: " + calc.subtraction(10, 20, 30));
        System.out.println("Subtraction: " + calc.subtraction(10.5f, 20.5f));
    }
}