package mypackage;
public class Message {
    public void greet() {
        System.out.println("Hello from the user-defined package!");
        System.out.println("I am Batman");
    }
        public void farewell() {
            System.out.println("Goodbye! See you soon.");
        }

        public void displayDate() {
            System.out.println("Today's date is: " + java.time.LocalDate.now());
        }

    }



