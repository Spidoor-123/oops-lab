public class Interface2 {
    public static void main(String[] args) {
        Payment payment;

        payment = new CreditCard();
        payment.pay(1500.00);

        payment = new DebitCard();
        payment.pay(750.00);

        payment = new UPI();
        payment.pay(300.00);
    }
}
// Credit Card Payment
class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

// Debit Card Payment
class DebitCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Debit Card.");
    }
}

// UPI Payment
class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}
// Interface
interface Payment {
    void pay(double amount);
}
