
import java.io.File;

public class deletefile {
    public static void main(String[] args) {
        // Specify the file to be deleted
        File file = new File("myfile.txt");

        // Attempt to delete the file
        if (file.delete()) {
            System.out.println("File deleted successfully: " + file.getName());
        } else {
            System.out.println("Failed to delete the file. It may not exist.");
        }
    }
}
