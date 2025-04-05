import java.util.Scanner;      
import java.util.Random;       
import java.time.LocalDate;    

public class Builtin_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        Random rand = new Random();
        int luckyNumber = rand.nextInt(100) + 1;  

        LocalDate date = LocalDate.now();

        double squareRoot = Math.sqrt(luckyNumber);

        System.out.println("\nHello, " + name + "!");
        System.out.println("Today's date: " + date);
        System.out.println("Your lucky number is: " + luckyNumber);
        System.out.println("Square root of your lucky number: " + squareRoot);

        sc.close();
    }
}
