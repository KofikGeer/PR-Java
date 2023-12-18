package PR_21;
//Реализация очереди на основе связанного списка
public class LinkedQueue<E> implements Queue<E> {
    private Node<E> front;
    private Node<E> rear;
    private int size;

    private static class Node<E> {
        E element;
        Node<E> next;

        public Node(E element) {
            this.element = element;
        }
    }

    public LinkedQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public void enqueue(E element) {
        Node<E> newNode = new Node<>(element);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        E element = front.element;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return element;
    }

    public E element() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        return front.element;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        front = null;
        rear = null;
        size = 0;
    }
}