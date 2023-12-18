package PR_13;

import java.io.FileReader;
import java.io.IOException;

public class FilesOut {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("C:\\Program Files\\Java\\jdk-20.0.2\\fork\\src\\PR_13\\file.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
