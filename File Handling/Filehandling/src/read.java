import java.io.FileReader;
import java.io.IOException;

public class read {
    public static void main(String[] args) {
        try {

            FileReader reader = new FileReader("readfile.txt");

            int character;
            System.out.println("Contents of the file:");

            // Read characters one by one
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}

