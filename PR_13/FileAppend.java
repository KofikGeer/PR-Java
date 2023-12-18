package PR_13;

import java.io.*;
import java.util.Scanner;

public class FileAppend { //добавляет в файл текст
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();
            FileWriter fileWriter = new FileWriter("C:\\Program Files\\Java\\jdk-20.0.2\\fork\\src\\PR_13\\file.txt", true);
            fileWriter.write('\n' + text);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

