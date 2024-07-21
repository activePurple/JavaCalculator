package basicCalculator;

/*This is a basic calculator to show some simple java methods and become familiar with using constructors, objects and methods*/

public class Calculator {
  public int add(int a, int b) {
    // add method
    int sum = a + b;
    return sum;
  }

  public int subtract(int a, int b) {
    int diff = a - b;
    return diff;
  }

  public int multiply(int a, int b) {
    int product = a * b;
    return product;
  }

  public int divide(int a, int b) {
    int quotient = a / b;
    return quotient;
  }

  public int modulo(int a, int b) {
    int rem = a % b;
    return rem;
  }

  public static void main(String[] args) {
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5, 7));
    System.out.println(myCalculator.subtract(5, 7));
    System.out.println(myCalculator.multiply(5, 7));
    System.out.println(myCalculator.divide(5, 7));
    System.out.println(myCalculator.modulo(5, 7));
  }
}