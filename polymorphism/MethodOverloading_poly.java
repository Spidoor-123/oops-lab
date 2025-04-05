public class MethodOverloading_poly {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("add(int, int): " + calc.add(10, 20));
        System.out.println("add(int, int, int): " + calc.add(5, 10, 15));
        System.out.println("add(double, double): " + calc.add(4.5, 5.5));
        System.out.println("add(double, int): " + calc.add(7.5, 3));
    }
}
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public double add(double a, int b) {
        return a + b;
    }
}
