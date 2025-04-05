import java.io.FileWriter;
import java.io.IOException;

public class write {
    public static void main(String[] args) {
        try {
            // Create a FileWriter object
            FileWriter writer = new FileWriter("output.txt");

            // Write content to the file
            writer.write("Hello! how are long time to see.\n");
            writer.write("I am Batman ");

            // Close the FileWriter
            writer.close();

            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}

