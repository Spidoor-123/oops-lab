public class expt2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        try {
            System.out.println("Accessing element at index 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Index is out of bounds!");
        }

        System.out.println("Program continues after exception handling.");
    }
}
