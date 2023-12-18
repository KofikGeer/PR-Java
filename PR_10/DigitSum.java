package PR_10;
/* 5. Сумма цифр числа
Дано натуральное число N. Вычислите сумму его цифр. При решении
этой задачи нельзя использовать строки, списки, массивы (ну и циклы,
разумеется). */
public class DigitSum {
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0; // Базовый случай: сумма цифр нуля равна нулю
        }
        return n % 10 + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        int N = 12345; // Ваше натуральное число
        int result = sumOfDigits(N);
        System.out.println("Сумма цифр числа " + N + " равна " + result);
    }
}
