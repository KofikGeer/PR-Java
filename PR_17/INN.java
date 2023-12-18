package PR_17;

import java.util.Scanner;

public class INN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите ФИО: ");
            String fullName = scanner.nextLine();

            System.out.print("Введите номер ИНН: ");
            String inn = scanner.nextLine();

            // Проверка действительности ИНН
            if (isValidInn(inn)) {
                System.out.println("Ваш заказ успешно оформлен.");
            } else {
                throw new InvalidInnException("Недействительный ИНН.");
            }

        } catch (InvalidInnException e) {
            System.err.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static boolean isValidInn(String inn) {
        // Проверка по контрольной сумме (для примера, считаем, что длина ИНН равна 12 символам)
        if (inn.length() != 12) {
            return false;
        }

        int[] weights = {7, 2, 4, 10, 3, 5, 9, 4, 6, 8};
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum += Character.getNumericValue(inn.charAt(i)) * weights[i];
        }

        int controlDigit = sum % 11;
        if (controlDigit == 10) {
            controlDigit = 0;
        }

        return Character.getNumericValue(inn.charAt(10)) == controlDigit;
    }
}