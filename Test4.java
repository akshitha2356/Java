package CDC;
import java.io.*;

public class Test4 {
    public static void main(String[] args) throws IOException {
        // Escape backslashes correctly
        File f1 = new File("C:\\Users\\HAS\\OneDrive\\Desktop\\j.txt,hlo.txt");
        if (f1.createNewFile()) {
            System.out.println("created success");
        } else {
            System.out.println("not created");
        }
    }
}