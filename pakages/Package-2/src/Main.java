import mypackage2.Calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        calc.greet();

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int result = calc.add(num1, num2);
        System.out.println("Sum: " + result);

        calc.farewell();
        scanner.close();
    }
}
