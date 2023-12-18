package PR_13;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReplace { //заменяем текст на другой
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        try (FileWriter writer = new FileWriter("C:\\Program Files\\Java\\jdk-20.0.2\\fork\\src\\PR_13\\file.txt")) {
            writer.write(text);
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}
