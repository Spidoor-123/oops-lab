public class BankOverrideDemo {
    public static void main(String[] args) {
        Bank bank;

        bank = new Bank1();
        bank.displayBankName();
        System.out.println("Interest Rate: " + bank.getInterestRate() + "%\n");

        bank = new Bank2();
        bank.displayBankName();
        System.out.println("Interest Rate: " + bank.getInterestRate() + "%\n");

        bank = new Bank3();
        bank.displayBankName();
        System.out.println("Interest Rate: " + bank.getInterestRate() + "%");
    }
}
// Parent class
class Bank {
    public double getInterestRate() {
        return 0.0;
    }

    public void displayBankName() {
        System.out.println("Generic Bank");
    }
}

// Subclass 1
class Bank1 extends Bank {
    public double getInterestRate() {
        return 5.5;
    }

    public void displayBankName() {
        System.out.println("Bank1");
    }
}

// Subclass 2
class Bank2 extends Bank {
    public double getInterestRate() {
        return 6.0;
    }
    
    public void displayBankName() {
        System.out.println("Bank2");
    }
}
// Subclass 3
class Bank3 extends Bank {
    
    public double getInterestRate() {
        return 6.75;
    }

    public void displayBankName() {
        System.out.println("Bank3");
    }
}
