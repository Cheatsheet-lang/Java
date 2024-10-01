package mathfuncs;

// It is a package for storing all the math related functions

public class MathFunc {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int modulus(int a, int b) {
        return a % b;
    }

    public int increment(int a) {
        return a++;
    }

    public int decrement(int a) {
        return a--;
    }

    public int unaryMinus(int a) {
        return -a;
    }
}