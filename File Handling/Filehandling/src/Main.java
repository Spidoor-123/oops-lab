
import java.io.FileWriter;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {




                try {
                    FileWriter writer = new FileWriter("myfile.txt");
                    writer.write("THIS THE CONTENT THAT WILL BE WRITTEN IN THE FILE");
                    writer.close();
                    System.out.println("File created and written to");
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
            }
        }