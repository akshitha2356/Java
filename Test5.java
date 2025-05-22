package CDC;
import java.io.*;

public class Test5 {
    public static void main(String[] args) throws IOException {
        // Escape backslashes correctly
        FileWriter f1 = new FileWriter("C:\\Users\\LENOVO\\OneDrive\\Documents\\Desktop\\java.txt");
        f1.write("hi how are you");
        f1.close();
        System.out.println("success");
        }
    }