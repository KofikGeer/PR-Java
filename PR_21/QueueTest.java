package PR_21;
//Тестирует функциональность `ArrayQueue`.
//Добавляет элементы в очередь, извлекает их, проверяет размер и пуста ли очередь.
public class QueueTest {
    public static void main(String[] args) {
        // Тесты для класса ArrayQueue
        ArrayQueue queue = new ArrayQueue();

        // Тест enqueue и element
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        // Выводится элемент в начале очереди, который сейчас
        //равен 1.
        System.out.println(queue.element());

        // ())`: Удаляется и выводится элемент из начала очереди,
        //который снова равен 1.
        System.out.println(queue.dequeue());
        //Удаляется и выводится следующий элемент из начала
        //очереди, который теперь равен 2.
        System.out.println(queue.dequeue());

        // Тест size и isEmpty
        // Выводится текущий размер очереди, который сейчас равен 1.
        System.out.println(queue.size());
        // Выводится `false`, так как очередь не пуста.
        System.out.println(queue.isEmpty());

        // Тест clear и isEmpty
        queue.clear();
        // Выводится `true`, так как очередь теперь пуста.
        System.out.println(queue.isEmpty());


    }
}