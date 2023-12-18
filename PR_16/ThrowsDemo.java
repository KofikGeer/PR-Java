package PR_16;

import java.util.Scanner;

public class ThrowsDemo {

    // Метод, сигнализирующий о возможном броске исключения
    public void getKey() throws Exception {
        Scanner myScanner = new Scanner(System.in);
        boolean success = false;

        // Повторять, пока не будет успешного ввода
        while (!success) {
            System.out.println("Enter key: ");
            String key = myScanner.next();

            try {
                // Попытка обработки введенного ключа
                printDetails(key);
                success = true;  // Успешный ввод
            } catch (Exception e) {
                // Обработка исключения
                System.err.println("Exception caught: " + e.getMessage());
                System.err.println("Please try again.");
            }
        }
    }

    // Метод, сигнализирующий о возможном броске исключения
    public void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;  // Переброс исключения выше
        }
    }

    // Метод, сигнализирующий о возможном броске исключения
    private String getDetails(String key) throws Exception {
        // Проверка на особые случаи и бросок соответствующих исключений
        if (key.equals("")) {
            throw new Exception("Key set to an empty string");
        } else if (key.equals("0")) {
            throw new Exception("Key cannot be 0");
        }

        // Возврат данных для ключа
        return "Data for " + key;
    }

    // Точка входа в программу, сигнализирующая о возможном броске исключения
    public static void main(String[] args) throws Exception {
        ThrowsDemo demo = new ThrowsDemo();
        demo.getKey();
    }
}