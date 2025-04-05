public class expt3{
    public static void main(String[] args) {
        String input = "abc";  // Invalid number

        try {
            int number = Integer.parseInt(input);  // This will throw NumberFormatException
            System.out.println("Converted Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught: Invalid number format.");
        }

        System.out.println("Program continues after handling the exception.");
    }
}
