import java.util.*;

// Inheritance in Java

class Calculation {
    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }
}

class CalculationExtension extends Calculation {
    public int multiplication(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        CalculationExtension obj = new CalculationExtension();
        int sum = obj.addition(10, 20);
        int difference = obj.subtraction(20, 10);
        int product = obj.multiplication(10, 20);
        int quotient = obj.division(20, 10);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}