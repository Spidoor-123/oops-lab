public class abstract3 {
    public static void main(String[] args) {
        Payment p1 = new CreditCard(1500);
        Payment p2 = new UPI(500);

        p1.makePayment();
        p2.makePayment();
    }
}
// Abstract class
abstract class Payment {
    double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    abstract void makePayment(); 
}
class CreditCard extends Payment {
    public CreditCard(double amount) {
        super(amount);
    }

    void makePayment() {
        System.out.println("Paid Rs " + amount + " using Credit Card.");
    }
}
class UPI extends Payment {
    public UPI(double amount) {
        super(amount);
    }

    void makePayment() {
        System.out.println("Paid Rs " + amount + " using UPI.");
    }
}

