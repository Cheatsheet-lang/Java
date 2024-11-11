
public class Calculator {
    // This class contains methods to perform basic arithmetic operations
    Calculator() {
        System.out.println("Calculator object created");
    }

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

    public int modulo(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Addition: " + calculator.add(10, 20));
        System.out.println("Subtraction: " + calculator.subtract(10, 20));
        System.out.println("Multiplication: " + calculator.multiply(10, 20));
        System.out.println("Division: " + calculator.divide(10, 20));
        System.out.println("Modulo: " + calculator.modulo(10, 7));
    }
}