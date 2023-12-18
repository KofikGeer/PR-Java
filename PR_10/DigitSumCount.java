package PR_10;
/* 4. Заданная сумма цифр
Даны натуральные числа k и s. Определите, сколько существует k - значных натуральных чисел, сумма цифр которых равна s. Запись
натурального числа не может начинаться с цифры 0.
В этой задаче можно использовать цикл для перебора всех цифр,
стоящих на какой-либо позиции. */
public class DigitSumCount {
    public static int countNumbersWithDigitSum(int k, int s) {
        if (s < 0 || s > 9 * k) {
            return 0; // Если сумма недопустима, то нет таких чисел
        }
        if (k == 1) {
            return 1; // Единственное однозначное число с суммой s - s само по себе
        }
        int count = 0;
        for (int i = 0; i <= 9; i++) {
            if (s - i >= 0) {
                count += countNumbersWithDigitSum(k - 1, s - i);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int k = 2; // Количество цифр
        int s = 3; // Сумма цифр
        int result = countNumbersWithDigitSum(k, s);
        System.out.println("Количество " + k + "-значных чисел с суммой цифр " + s + ": " + result);
    }
}
