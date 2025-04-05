public class expt4 {
    public static void main(String[] args) {
        String text = null; 

        try {
           
            int length = text.length();
            System.out.println("Length: " + length);
        } catch (NullPointerException e) {
            System.out.println("Exception caught: Cannot call method on a null object.");
        }

        System.out.println("Program continues after exception handling.");
    }
}
