package PR_12;

import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class DrankardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод карт для первого игрока.
        System.out.print("Enter cards for the first player: ");
        String player1Input = scanner.nextLine();

        // Ввод карт для второго игрока.
        System.out.print("Enter cards for the second player: ");
        String player2Input = scanner.nextLine();

        // Создание колод для игроков и очереди для карт на столе.
        Stack<Integer> player1Deck = createDeck(player1Input);
        Stack<Integer> player2Deck = createDeck(player2Input);
        Queue<Integer> table = new LinkedList<>();

        int moves = 0;
        boolean gameOver = false;

        // Основной цикл игры.
        while (moves < 106 && !player1Deck.isEmpty() && !player2Deck.isEmpty()) {
            int card1 = player1Deck.pop();
            int card2 = player2Deck.pop();

            table.add(card1);
            table.add(card2);

            if (card1 > card2) {
                player1Deck.addAll(table);
                table.clear();
            } else if (card2 > card1) {
                player2Deck.addAll(table);
                table.clear();
            }

            moves++;
        }

        // Проверка результата игры.
        if (moves >= 106) {
            System.out.println("botva"); // Ничья
        } else if (player1Deck.isEmpty()) {
            System.out.println("second " + moves); // Второй игрок победил
        } else {
            System.out.println("first " + moves); // Первый игрок победил
        }
    }

    // Метод для создания колоды из вводной строки.
    private static Stack<Integer> createDeck(String input) {
        Stack<Integer> deck = new Stack<>();
        String[] cards = input.split(" ");
        for (int i = cards.length - 1; i >= 0; i--) {
            deck.push(Integer.parseInt(cards[i]));
        }
        return deck;
    }
}
