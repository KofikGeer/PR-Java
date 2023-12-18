package PR_21;
//Реализация очереди на основе массива.
public class ArrayQueue {
    private Object[] elements = new Object[10];
    private int size = 0;
    private int front = 0;
    private int rear = 0;

    // Предусловие: element != null
    // Постусловие: элемент добавлен в конец очереди
    public void enqueue(Object element) {
        ensureCapacity(size + 1);
        elements[rear] = element;
        rear = (rear + 1) % elements.length;
        size++;
    }

    // Предусловие: очередь не пуста
    // Постусловие: возвращен первый элемент в очереди
    public Object element() {
        if (size == 0) {
            throw new IllegalStateException("Очередь пуста");
        }
        return elements[front];
    }

    // Предусловие: очередь не пуста
    // Постусловие: удален и возвращен первый элемент в очереди
    public Object dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Очередь пуста");
        }
        Object element = elements[front];
        elements[front] = null;
        front = (front + 1) % elements.length;
        size--;
        return element;
    }

    // Постусловие: возвращен текущий размер очереди
    public int size() {
        return size;
    }

    // Постусловие: возвращено true, если очередь пуста, иначе false
    public boolean isEmpty() {
        return size == 0;
    }

    // Постусловие: очередь очищена (удалены все элементы)
    public void clear() {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
        size = 0;
        front = 0;
        rear = 0;
    }

    private void ensureCapacity(int capacity) {
        if (capacity > elements.length) {
            int newCapacity = elements.length * 2;
            Object[] newElements = new Object[newCapacity];
            int j = 0;
            for (int i = front; i < front + size; i++) {
                newElements[j] = elements[i % elements.length] ;
                j++;
            }
            elements = newElements;
            front = 0;
            rear = size;
        }
    }
}