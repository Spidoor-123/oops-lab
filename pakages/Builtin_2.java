import java.util.Scanner;         
import java.time.LocalDate;      
import java.lang.Math;

public class Builtin_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();

        double result = Math.sqrt(num);

        LocalDate today = LocalDate.now();

        System.out.println("Square root of " + num + " is: " + result);
        System.out.println("Calculated on: " + today);

        scanner.close();
    }
}
