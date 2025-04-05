public class expt1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int result;

        try {
            result = a / b;  // This will cause ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Cannot divide by zero.");
        }

        System.out.println("Program continues after exception handling.");
    }
}
