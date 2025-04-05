public class MethodOverloading_poly1_poly
{
    public static void main(String[] args) {
        Bank b = new Bank();

        b.calculateInterest(10000.0, 2);             
        b.calculateInterest(15000.0, 3, 6.5);          
        b.calculateInterest(5000, 1);                  
    }
}
class Bank {

    public void calculateInterest(double principal, int time) {
        double rate = 5.0; 
        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest (fixed rate): ₹" + interest);
    }

    public void calculateInterest(double principal, int time, double rate) {
        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest (custom rate): ₹" + interest);
    }

    public void calculateInterest(int principal, int time) {
        double rate = 4.5; 
        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest (int version): ₹" + interest);
    }
}
