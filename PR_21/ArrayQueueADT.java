package PR_21;
// Реализация очереди на основе массива с использованием абстрактных типов данных.
public class ArrayQueueADT {
    private Object[] elements = new Object[10];
    private int size = 0;
    private int front = 0;
    private int rear = 0;

    // Предусловие: element != null
    // Постусловие: элемент добавлен в конец очереди
    public static void enqueue(ArrayQueueADT queue, Object element) {
        ensureCapacity(queue, queue.size + 1);
        queue.elements[queue.rear] = element;
        queue.rear = (queue.rear + 1) % queue.elements.length;
        queue.size++;
    }

    // Предусловие: очередь не пуста
    // Постусловие: возвращен первый элемент в очереди
    public static Object element(ArrayQueueADT queue) {
        if (queue.size == 0) {
            throw new IllegalStateException("Очередь пуста");
        }
        return queue.elements[queue.front];
    }

    // Предусловие: очередь не пуста
    // Постусловие: удален и возвращен первый элемент в очереди
    public static Object dequeue(ArrayQueueADT queue) {
        if (queue.size == 0) {
            throw new IllegalStateException("Очередь пуста");
        }
        Object element = queue.elements[queue.front];
        queue.elements[queue.front] = null;
        queue.front = (queue.front + 1) % queue.elements.length;
        queue.size--;
        return element;
    }

    // Постусловие: возвращен текущий размер очереди
    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }

    // Постусловие: возвращено true, если очередь пуста, иначе false
    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }

    // Постусловие: очередь очищена (удалены все элементы)
    public static void clear(ArrayQueueADT queue) {
        for (int i = 0; i < queue.elements.length; i++) {
            queue.elements[i] = null;
        }
        queue.size = 0;
        queue.front = 0;
        queue.rear = 0;
    }

    private static void ensureCapacity(ArrayQueueADT queue, int capacity) {
        if (capacity > queue.elements.length) {
            int newCapacity = queue.elements.length * 2;
            Object[] newElements = new Object[newCapacity];
            int j = 0;
            for (int i = queue.front; i < queue.front + queue.size; i++) {
                newElements[j] = queue.elements[i % queue.elements.length];
                j++;
            }
            queue.elements = newElements;
            queue.front = 0;
            queue.rear = queue.size;
        }
    }
}