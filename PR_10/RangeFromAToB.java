package PR_10;
/* 3. От A до B
Даны два целых числа A и В (каждое в отдельной строке). Выведите все
числа от A до B включительно, в порядке возрастания, если A < B, или в
порядке убывания в противном случае. */

import java.util.Scanner;

public class RangeFromAToB {
    public static void printRange(int a, int b) {
        if (a < b) {
            System.out.print(a + " ");
            printRange(a + 1, b);
        } else if (a > b) {
            System.out.print(a + " ");
            printRange(a - 1, b);
        } else {
            System.out.print(b);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        printRange(A, B);
    }
}