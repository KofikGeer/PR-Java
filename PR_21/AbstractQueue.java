package PR_21;

public abstract class AbstractQueue<E> implements Queue<E> {
    protected int size;
//возвращает текущий размер очереди
    public int size() {
        return size;
    }
//проверка пустоты очереди
    public boolean isEmpty() {
        return size == 0;
    }
//очистка очереди
    public void clear() {
        size = 0;
    }
}